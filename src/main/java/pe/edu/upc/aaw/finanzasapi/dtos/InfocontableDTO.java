package pe.edu.upc.aaw.finanzasapi.dtos;

import pe.edu.upc.aaw.finanzasapi.entities.*;
import java.time.LocalDate;

public class InfocontableDTO {
    private int idInfocontable;
    private int plazoDias;
    private LocalDate fechaFin;
    private LocalDate fechaInicio;
    private double tasaEfectiva;
    private double valorPresente;
    private double valorFuturo;
    private Users user;

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