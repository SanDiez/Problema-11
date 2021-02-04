/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p10.empresa.minera;

/**
 *
 * @author santi
 */
public class DeVolteo extends Camion{
    private double capacidadTon;
    
    public DeVolteo(){
        super();
    }

  /*  public DeVolteo(double capacidadTon, String marca, String numMotor, String placas) {
        super(marca, numMotor, placas);
        this.capacidadTon = capacidadTon;
    }*/
    
     @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        
        sb.append(super.toString());
        sb.append("CapacidadTon: "+capacidadTon+"\n");
        return sb.toString();
    }

    public void setCapacidadTon(double capacidadTon) {
        this.capacidadTon = capacidadTon;
    }

    public double getCapacidadTon() {
        return capacidadTon;
    }
    
    
}
