package concerttours.facades.impl;

import concerttours.facades.ProducerFacade;
import java.util.List;

import concerttours.service.BandService;
import de.hybris.platform.core.model.product.ProductModel;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Required;
import concerttours.data.ProducerData;
import concerttours.facades.ProducerFacade;
import concerttours.model.ProducerModel;
import concerttours.service.ProducerService;
import java.util.Locale;
import concerttours.data.TourSummaryData;

public class DefaultProducerFacade implements ProducerFacade {
    private ProducerService producerService;

    @Override
    public List<ProducerData> getProducers() {
        final List<ProducerModel> producerModels = producerService.getProducers();
        final List<ProducerData> producerFacadeData = new ArrayList<>();
        for (final ProducerModel sm : producerModels)
        {
            final ProducerData sfd = new ProducerData();
            sfd.setId(sm.getCode());
            sfd.setFirstName(sm.getFirstName());
            sfd.setSurname(sm.getSurname());
            producerFacadeData.add(sfd);
        }
        return producerFacadeData;
    }

    @Required
    public void setProducerService(final ProducerService producerService)
    {
        this.producerService = producerService;
    }
}
