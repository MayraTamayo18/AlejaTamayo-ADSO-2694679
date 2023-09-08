package Funciones;

import java.util.Date;

public class Retiro {

    private double monto;
    private Date fecha;

    public Retiro(double monto) {
        this.monto = monto;
        this.fecha = new Date();
    }

    public double getMonto() {
        return monto;
    }

    public Date getFecha() {
        return fecha;
    }
}
