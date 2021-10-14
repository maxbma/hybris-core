package concerttours.service.impl;

import concerttours.daos.ItemWithTokenDAO;
import concerttours.service.ItemWithTokenService;
import concerttours.model.ItemWithTokenModel;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

public class DefaultItemWithTokenService implements ItemWithTokenService {
    @Autowired
    private ItemWithTokenDAO itemWithTokenDAO;

    public void setItemWithTokenDAO(final ItemWithTokenDAO itemWithTokenDAO){
        this.itemWithTokenDAO = itemWithTokenDAO;
    }
    @Override
    public List<ItemWithTokenModel> findItemsWithToken() {
        return itemWithTokenDAO.findItemsWithToken();
    }
}
