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
public class Turismo extends DePasajeros{
    private boolean asientoCama;
    private boolean serviBar;

    public Turismo() {
        super();
    }

    public Turismo(boolean asientoCama, boolean serviBar, int totalPasj, String marca, String numMotor, String placas, double costo) {
        super(totalPasj, marca, numMotor, placas, costo);
        this.asientoCama = asientoCama;
        this.serviBar = serviBar;
    }
    
    public String toString(){
        StringBuilder sb= new StringBuilder();
        
        sb.append(super.toString());
        sb.append("asientoCama:    "+asientoCama+"\n");
        sb.append("tiene servibar: "+serviBar+"\n");
        return sb.toString();
    }
    
    public double calculaCostoServicio(double km){
        
    }
    
    
}
