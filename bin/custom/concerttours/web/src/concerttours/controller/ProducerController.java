package concerttours.controller;

import concerttours.facades.ProducerFacade;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import concerttours.data.ProducerData;

import de.hybris.platform.catalog.CatalogVersionService;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class ProducerController {
    private static final String CATALOG_ID = "concertoursProductCatalog";
    private static final String CATALOG_VERSION_NAME = "Online";
    private CatalogVersionService catalogVersionService;
    private ProducerFacade producerFacade;

    @RequestMapping(value = "/producers")
    public String showProducers(final Model model){
        final List<ProducerData> producers = producerFacade.getProducers();
        model.addAttribute("producers", producers);
        return "ProducerList";
    }

    @Autowired
    public void setCatalogVersionService(final CatalogVersionService catalogVersionServiceService)
    {
        this.catalogVersionService = catalogVersionServiceService;
    }

    @Autowired
    public void setFacade(final ProducerFacade facade)
    {
        this.producerFacade = facade;
    }
}
