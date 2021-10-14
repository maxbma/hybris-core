package concerttours.service;

import concerttours.model.ItemWithTokenModel;
import java.util.List;

public interface ItemWithTokenService {
    List<ItemWithTokenModel> findItemsWithToken();
}
