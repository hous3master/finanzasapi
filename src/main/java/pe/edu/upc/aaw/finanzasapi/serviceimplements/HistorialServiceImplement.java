package pe.edu.upc.aaw.finanzasapi.serviceimplements;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import pe.edu.upc.aaw.finanzasapi.entities.Historial;
import pe.edu.upc.aaw.finanzasapi.repositories.IHistorialRepository;
import pe.edu.upc.aaw.finanzasapi.serviceinterfaces.IHistorialService;

import java.util.List;

@Service
public class HistorialServiceImplement implements IHistorialService {
    @Autowired
    private IHistorialRepository myRepository;

    // Add an item to table
    @Override
    public void insert(Historial Historial) {
        myRepository.save(Historial);
    }

    // Delete an item by ID on table
    @Override
    public void delete(int idHistorial){
        myRepository.deleteById(idHistorial);
    }

    // Retrieve an items by ID from table
    @Override
    public Historial listId(int idHistorial){
        return myRepository.findById(idHistorial).orElse(new Historial());
    }

    // Retrieve all items from table
    @Override
    public List<Historial> list() {
        return myRepository.findAll();
    }
}