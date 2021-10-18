package concerttours.daos;

import java.util.List;
import concerttours.model.ProducerModel;

public interface ProducerDAO {
    List<ProducerModel> findProducers();
}
