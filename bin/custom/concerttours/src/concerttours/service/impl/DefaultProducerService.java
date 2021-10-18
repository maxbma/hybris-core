package concerttours.service.impl;

import concerttours.daos.BandDAO;
import concerttours.service.ProducerService;
import java.util.List;
import de.hybris.platform.servicelayer.exceptions.AmbiguousIdentifierException;
import de.hybris.platform.servicelayer.exceptions.UnknownIdentifierException;
import org.springframework.beans.factory.annotation.Required;
import concerttours.daos.ProducerDAO;
import concerttours.model.ProducerModel;

public class DefaultProducerService implements ProducerService {
    private ProducerDAO producerDAO;
    @Override
    public List<ProducerModel> getProducers() {
        return producerDAO.findProducers();
    }

    @Required
    public void setProducerDAO(final ProducerDAO producerAO)
    {
        this.producerDAO = producerAO;
    }
}
