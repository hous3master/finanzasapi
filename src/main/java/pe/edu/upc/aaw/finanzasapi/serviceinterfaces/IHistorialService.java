package pe.edu.upc.aaw.finanzasapi.serviceinterfaces;

import pe.edu.upc.aaw.finanzasapi.entities.Historial;
import java.util.List;

public interface IHistorialService {
    void insert(Historial Historial);
    void delete(int id);
    Historial listId(int id);
    List<Historial> list();
}