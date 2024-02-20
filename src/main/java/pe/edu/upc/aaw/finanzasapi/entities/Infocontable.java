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

@Column(name = "plazodias", nullable = false)
private int plazodias;

@Column(name = "fechafin", nullable = false)
private LocalDate fechafin;

@Column(name = "fechainicio", nullable = false)
private LocalDate fechainicio;

@Column(name = "tasaefectiva", nullable = false)
private double tasaefectiva;

@Column(name = "valorpresente", nullable = false)
private double valorpresente;

@Column(name = "valorfuturo", nullable = false)
private double valorfuturo;

@ManyToOne
@JoinColumn(name = "id")
private Users user;

public Infocontable() { }

public Infocontable(int idInfocontable,int plazodias, LocalDate fechafin, LocalDate fechainicio, double tasaefectiva, double valorpresente, double valorfuturo, Users user) {
    this.idInfocontable = idInfocontable;
    this.plazodias = plazodias;
    this.fechafin = fechafin;
    this.fechainicio = fechainicio;
    this.tasaefectiva = tasaefectiva;
    this.valorpresente = valorpresente;
    this.valorfuturo = valorfuturo;
    this.user = user;
}

public int getIdInfocontable() {
    return idInfocontable;
}

public void setIdInfocontable(int idInfocontable) {
    this.idInfocontable = idInfocontable;
}

public int getPlazodias() {
    return plazodias;
}

public void setPlazodias(int plazodias) {
    this.plazodias = plazodias;
}

public LocalDate getFechafin() {
    return fechafin;
}

public void setFechafin(LocalDate fechafin) {
    this.fechafin = fechafin;
}

public LocalDate getFechainicio() {
    return fechainicio;
}

public void setFechainicio(LocalDate fechainicio) {
    this.fechainicio = fechainicio;
}

public double getTasaefectiva() {
    return tasaefectiva;
}

public void setTasaefectiva(double tasaefectiva) {
    this.tasaefectiva = tasaefectiva;
}

public double getValorpresente() {
    return valorpresente;
}

public void setValorpresente(double valorpresente) {
    this.valorpresente = valorpresente;
}

public double getValorfuturo() {
    return valorfuturo;
}

public void setValorfuturo(double valorfuturo) {
    this.valorfuturo = valorfuturo;
}

public Users getUser() {
    return user;
}

public void setUser(Users user) {
    this.user = user;
}

}