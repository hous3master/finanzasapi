package pe.edu.upc.aaw.finanzasapi.serviceimplements;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import pe.edu.upc.aaw.finanzasapi.entities.Infocontable;
import pe.edu.upc.aaw.finanzasapi.repositories.IInfocontableRepository;
import pe.edu.upc.aaw.finanzasapi.serviceinterfaces.IInfocontableService;

import java.util.List;

@Service
public class InfocontableServiceImplement implements IInfocontableService {
    @Autowired
    private IInfocontableRepository myRepository;

    // Add an item to table
    @Override
    public void insert(Infocontable Infocontable) {
        myRepository.save(Infocontable);
    }

    // Delete an item by ID on table
    @Override
    public void delete(int idInfocontable){
        myRepository.deleteById(idInfocontable);
    }

    // Retrieve an items by ID from table
    @Override
    public Infocontable listId(int idInfocontable){
        return myRepository.findById(idInfocontable).orElse(new Infocontable());
    }

    // Retrieve all items from table
    @Override
    public List<Infocontable> list() {
        return myRepository.findAll();
    }
}