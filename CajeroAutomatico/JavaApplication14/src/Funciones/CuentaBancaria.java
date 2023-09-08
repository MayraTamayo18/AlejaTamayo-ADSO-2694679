package Funciones;

import java.util.ArrayList;
import java.util.List;

public class CuentaBancaria {

    private int clienteId;
    private TipoCuenta tipoCuenta;
    private double saldo;
    public List<Retiro> historialRetiros;

    public CuentaBancaria(Cliente cliente) {
        clienteId = cliente.getClienteId();
        tipoCuenta = cliente.getTipoCuenta();
        saldo = cliente.getSaldoInicial();
        historialRetiros = new ArrayList<>();
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean realizarRetiro(double monto) {
        if (saldo >= monto) {
            saldo -= monto;
            registrarRetiro(new Retiro(monto));
            return true;
        }
        return false;
    }

    public void registrarRetiro(Retiro retiro) {
        historialRetiros.add(retiro);
    }

    public int getClienteId() {
        return clienteId;
    }

    public List<Retiro> getHistorialRetiros() {
        return historialRetiros;
    }
}
