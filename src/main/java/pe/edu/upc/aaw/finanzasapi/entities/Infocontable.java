package pe.edu.upc.aaw.finanzasapi.entities;

import javax.persistence.*;
import pe.edu.upc.aaw.finanzasapi.entities.*;
import java.time.LocalDate;

@Entity
@Table(name = "Infocontable")
public class Infocontable {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int idInfocontable;

@Column(name = "plazoDias", nullable = false)
private int plazoDias;

@Column(name = "fechaFin", nullable = false)
private LocalDate fechaFin;

@Column(name = "fechaInicio", nullable = false)
private LocalDate fechaInicio;

@Column(name = "tasaEfectiva", nullable = false)
private double tasaEfectiva;

@Column(name = "valorPresente", nullable = false)
private double valorPresente;

@Column(name = "valorFuturo", nullable = false)
private double valorFuturo;

@ManyToOne
@JoinColumn(name = "id")
private Users user;

public Infocontable() { }

public Infocontable(int idInfocontable,int plazoDias, LocalDate fechaFin, LocalDate fechaInicio, double tasaEfectiva, double valorPresente, double valorFuturo, Users user) {
    this.idInfocontable = idInfocontable;
    this.plazoDias = plazoDias;
    this.fechaFin = fechaFin;
    this.fechaInicio = fechaInicio;
    this.tasaEfectiva = tasaEfectiva;
    this.valorPresente = valorPresente;
    this.valorFuturo = valorFuturo;
    this.user = user;
}

public int getIdInfocontable() {
    return idInfocontable;
}

public void setIdInfocontable(int idInfocontable) {
    this.idInfocontable = idInfocontable;
}

public int getPlazodias() {
    return plazoDias;
}

public void setPlazodias(int plazoDias) {
    this.plazoDias = plazoDias;
}

public LocalDate getFechafin() {
    return fechaFin;
}

public void setFechafin(LocalDate fechaFin) {
    this.fechaFin = fechaFin;
}

public LocalDate getFechainicio() {
    return fechaInicio;
}

public void setFechainicio(LocalDate fechaInicio) {
    this.fechaInicio = fechaInicio;
}

public double getTasaefectiva() {
    return tasaEfectiva;
}

public void setTasaefectiva(double tasaEfectiva) {
    this.tasaEfectiva = tasaEfectiva;
}

public double getValorpresente() {
    return valorPresente;
}

public void setValorpresente(double valorPresente) {
    this.valorPresente = valorPresente;
}

public double getValorfuturo() {
    return valorFuturo;
}

public void setValorfuturo(double valorFuturo) {
    this.valorFuturo = valorFuturo;
}

public Users getUser() {
    return user;
}

public void setUser(Users user) {
    this.user = user;
}

}