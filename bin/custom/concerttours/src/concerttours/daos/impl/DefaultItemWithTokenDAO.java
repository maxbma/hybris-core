package concerttours.daos.impl;

import concerttours.daos.ItemWithTokenDAO;
import concerttours.model.ItemWithTokenModel;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;
import java.util.List;

@Component(value="itemWithTokenDAO")
public class DefaultItemWithTokenDAO implements ItemWithTokenDAO {
    @Autowired
    private FlexibleSearchService flexibleSearchService;
    @Override
    public List<ItemWithTokenModel> findItemsWithToken() {
        final String queryString = //
                "SELECT {p:" + ItemWithTokenModel.PK + "} "//
                        + "FROM {" + ItemWithTokenModel._TYPECODE + " AS p} ";
        final FlexibleSearchQuery query = new FlexibleSearchQuery(queryString);
        return flexibleSearchService.<ItemWithTokenModel> search(query).getResult();
    }
}
