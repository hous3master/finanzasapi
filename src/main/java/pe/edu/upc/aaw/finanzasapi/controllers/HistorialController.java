package pe.edu.upc.aaw.finanzasapi.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.finanzasapi.dtos.HistorialDTO;
import pe.edu.upc.aaw.finanzasapi.entities.Historial;
import pe.edu.upc.aaw.finanzasapi.serviceinterfaces.IHistorialService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/historial")
public class HistorialController {
    @Autowired
    private IHistorialService myService;

    // Add an item to table
    @PostMapping
    public void registrar(@RequestBody HistorialDTO dto) {
        ModelMapper m = new ModelMapper();
        Historial myItem = m.map(dto, Historial.class);
        myService.insert(myItem);
    }

    // Delete an item by ID on table
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id")Integer id){
        myService.delete(id);
    }

    // Retrieve an items by ID from table
    @GetMapping("/{id}")
    public HistorialDTO listarId(@PathVariable("id")Integer id){
        ModelMapper m = new ModelMapper();
        HistorialDTO myItem = m.map(myService.listId(id), HistorialDTO.class);
        return myItem;
    }

    // Retrieve all items from table
    @GetMapping
    public List<HistorialDTO> listar(){
        return myService.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, HistorialDTO.class);
        }).collect(Collectors.toList());
    }

    // (Exclusive to controller) Modify values on table
    @PutMapping
    public void modificar(@RequestBody HistorialDTO dto) {
        ModelMapper m = new ModelMapper();
        Historial d = m.map(dto, Historial.class);
        myService.insert(d);
    }
}