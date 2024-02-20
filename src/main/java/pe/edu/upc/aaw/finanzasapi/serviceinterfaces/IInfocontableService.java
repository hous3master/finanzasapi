package pe.edu.upc.aaw.finanzasapi.serviceinterfaces;

import pe.edu.upc.aaw.finanzasapi.entities.Infocontable;
import java.util.List;

public interface IInfocontableService {
    void insert(Infocontable Infocontable);
    void delete(int id);
    Infocontable listId(int id);
    List<Infocontable> list();
}