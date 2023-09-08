/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

/**
 *
 * @author Maira Alejandra
 */
public class ClassEmpresa {

    private Double inversion1;
    private Double inversion2;
    private Double inversion3;
    private Double inversionTotal;
    private Double p1;

    public Double getInversion1() {
        return inversion1;
    }

    public void setInversion1(Double inversion1) {
        this.inversion1 = inversion1;
    }

    public Double getInversion2() {
        return inversion2;
    }

    public void setInversion2(Double inversion2) {
        this.inversion2 = inversion2;
    }

    public Double getInversion3() {
        return inversion3;
    }

    public void setInversion3(Double inversion3) {
        this.inversion3 = inversion3;
    }

    public Double getInversionTotal() {
        return inversionTotal;
    }

    public void setInversionTotal(Double inversionTotal) {
        this.inversionTotal = inversionTotal;
    }

    public Double getP1() {
        return p1;
    }

    public void setP1(Double p1) {
        this.p1 = p1;
    }

    public Double  Promedio() {
        this.setInversionTotal(this.getInversion1() + this.getInversion2() + this.getInversion3());
        
        this.getP1(this.getInversion1() * 100 / this.inversionTotal);
        promedio[1] = (this.getInversion2() * 100 / this.inversionTotal);
        promedio[2] = (this.getInversion3() * 100 / this.inversionTotal);
        return null;

        

    }
}

// hallar el porcentaje de cada persona 

