package pe.edu.upc.aaw.finanzasapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.aaw.finanzasapi.entities.Historial;
import java.util.List;

@Repository
public interface IHistorialRepository extends JpaRepository<Historial, Integer> { }