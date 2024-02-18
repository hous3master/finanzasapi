package pe.edu.upc.aaw.finanzasapi.entities;

import javax.persistence.*;
import pe.edu.upc.aaw.finanzasapi.entities.*;
import java.time.LocalDate;

@Entity
@Table(name = "Historial")
public class Historial {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int idHistorial;

@Column(name = "fecha", nullable = false)
private LocalDate fecha;

@Column(name = "monto", nullable = false)
private double monto;

@ManyToOne
@JoinColumn(name = "id")
private Users user;

public Historial() { }

public Historial(int idHistorial,LocalDate fecha, double monto, Users user) {
    this.idHistorial = idHistorial;
    this.fecha = fecha;
    this.monto = monto;
    this.user = user;
}

public int getIdHistorial() {
    return idHistorial;
}

public void setIdHistorial(int idHistorial) {
    this.idHistorial = idHistorial;
}

public LocalDate getFecha() {
    return fecha;
}

public void setFecha(LocalDate fecha) {
    this.fecha = fecha;
}

public double getMonto() {
    return monto;
}

public void setMonto(double monto) {
    this.monto = monto;
}

public Users getUser() {
    return user;
}

public void setUser(Users user) {
    this.user = user;
}

}