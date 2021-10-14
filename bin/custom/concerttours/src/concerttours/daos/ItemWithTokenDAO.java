package concerttours.daos;

import concerttours.model.ItemWithTokenModel;
import java.util.List;

public interface ItemWithTokenDAO {
    List<ItemWithTokenModel> findItemsWithToken();
}
