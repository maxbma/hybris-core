package concerttours.jobs;

import concerttours.service.ItemWithTokenService;
import de.hybris.platform.cronjob.enums.CronJobResult;
import de.hybris.platform.cronjob.enums.CronJobStatus;
import de.hybris.platform.cronjob.model.CronJobModel;
import de.hybris.platform.servicelayer.config.ConfigurationService;
import de.hybris.platform.servicelayer.cronjob.AbstractJobPerformable;
import de.hybris.platform.servicelayer.cronjob.PerformResult;
import de.hybris.platform.util.mail.MailUtils;
import concerttours.model.ItemWithTokenModel;

import java.util.List;
import java.util.UUID;

import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.configuration.Configuration;
import de.hybris.platform.servicelayer.model.ModelService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Required;

public class GenerateTokenJob extends AbstractJobPerformable<CronJobModel>{
    private static final Logger LOG = Logger.getLogger(GenerateTokenJob.class);
    private ItemWithTokenService service;
    private ConfigurationService configurationService;
    private ModelService modelService;
    public ModelService getModelService()
    {
        return modelService;
    }
    public void setModelService(final ModelService modelService)
    {
        this.modelService = modelService;
    }

    @Required
    public ItemWithTokenService getItemWithTokenService()
    {
        return service;
    }

    @Required
    public ConfigurationService getConfigurationService()
    {
        return configurationService;
    }

    @Required
    public void setItemWithTokenService(final ItemWithTokenService service)
    {
        this.service = service;
    }

    @Required
    public void setConfigurationService(final ConfigurationService configurationService)
    {
        this.configurationService = configurationService;
    }
    @Override
    public PerformResult perform(final CronJobModel cronJob)
    {
        LOG.info("Sending news mails. Note that org.apache.commons.mail.send() can block if behind a firewall/proxy.");
        final List<ItemWithTokenModel> items = getItemWithTokenService().findItemsWithToken();
        if (items.isEmpty())
        {
            LOG.info("No items, skipping generating tokens");
            return new PerformResult(CronJobResult.SUCCESS, CronJobStatus.FINISHED);
        }
        for (final ItemWithTokenModel item : items)
        {
            String randomToken = UUID.randomUUID().toString();
            LOG.info("Changing token from " + item.getToken() + " to " + randomToken);
            item.setToken(randomToken);
            modelService.save(item);
        }
        return new PerformResult(CronJobResult.SUCCESS, CronJobStatus.FINISHED);
    }
}
