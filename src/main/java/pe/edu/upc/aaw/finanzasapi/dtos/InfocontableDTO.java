package pe.edu.upc.aaw.finanzasapi.dtos;

import pe.edu.upc.aaw.finanzasapi.entities.*;
import java.time.LocalDate;

public class InfocontableDTO {
    private int idInfocontable;
    private int plazodias;
    private LocalDate fechafin;
    private LocalDate fechainicio;
    private double tasaefectiva;
    private double valorpresente;
    private double valorfuturo;
    private Users user;

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