package concerttours.attributehandlers;

import de.hybris.platform.servicelayer.model.attribute.AbstractDynamicAttributeHandler;
import org.springframework.stereotype.Component;
import concerttours.model.BandModel;

import java.time.Duration;
import java.time.ZoneId;
import java.time.ZonedDateTime;

@Component
public class AlbumSalesAchievementAttributeHandler extends AbstractDynamicAttributeHandler<String, BandModel> {

    @Override
    public String get(final BandModel model)
    {
        if (model.getAlbumSales() == null)
        {
            return null;
        }
        final long albumSales = model.getAlbumSales();
        if(albumSales == 0) return "No albums were sold";
        else if(albumSales > 0 && albumSales < 1000) return "Less than 1000 albums sold!";
        else if(albumSales >= 1000 && albumSales < 10000) return "More than 1000 albums sold!";
        else return "More than 10000 albums sold!";
    }
}
