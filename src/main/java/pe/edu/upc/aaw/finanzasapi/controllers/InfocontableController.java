package pe.edu.upc.aaw.finanzasapi.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.finanzasapi.dtos.InfocontableDTO;
import pe.edu.upc.aaw.finanzasapi.entities.Infocontable;
import pe.edu.upc.aaw.finanzasapi.serviceinterfaces.IInfocontableService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/infocontable")
public class InfocontableController {
    @Autowired
    private IInfocontableService myService;

    // Add an item to table
    @PostMapping
    public void registrar(@RequestBody InfocontableDTO dto) {
        ModelMapper m = new ModelMapper();
        Infocontable myItem = m.map(dto, Infocontable.class);
        myService.insert(myItem);
    }

    // Delete an item by ID on table
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id")Integer id){
        myService.delete(id);
    }

    // Retrieve an items by ID from table
    @GetMapping("/{id}")
    public InfocontableDTO listarId(@PathVariable("id")Integer id){
        ModelMapper m = new ModelMapper();
        InfocontableDTO myItem = m.map(myService.listId(id), InfocontableDTO.class);
        return myItem;
    }

    // Retrieve all items from table
    @GetMapping
    public List<InfocontableDTO> listar(){
        return myService.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, InfocontableDTO.class);
        }).collect(Collectors.toList());
    }

    // (Exclusive to controller) Modify values on table
    @PutMapping
    public void modificar(@RequestBody InfocontableDTO dto) {
        ModelMapper m = new ModelMapper();
        Infocontable d = m.map(dto, Infocontable.class);
        myService.insert(d);
    }
}