package pe.edu.upc.aaw.finanzasapi.dtos;

import pe.edu.upc.aaw.finanzasapi.entities.*;
import java.time.LocalDate;

public class HistorialDTO {
    private int idHistorial;
    private LocalDate fecha;
    private double monto;
    private Users user;

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