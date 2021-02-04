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
public class EmpresaMinera {
    private String nombreEmpresa;
    private Camion[] camiones;
    private int totalCam;
    private final int MAX=10;
    
    public EmpresaMinera(){
        camiones= new Camion[MAX];
        totalCam=0;
    }

    public EmpresaMinera(String nombreEmpresa) {
        this(); //no super() pq no llama al papa
        this.nombreEmpresa = nombreEmpresa;
    }
    
    //1)
    public String regresaDatos(){
        StringBuilder sb =new StringBuilder();
        int i;
        
        for(i=0;i<totalCam;i++)
            if (camiones[i]instanceof DePasajeros)
                sb.append(camiones[i].toString()+"\n");
        
        return sb.toString();          
    }
    
    //2)
    public boolean actualizaCapacidad(String placa, double capacidad){
       boolean resp;
       int i=0;
       
       while(i<totalCam && !camiones[i].equals(placa))
           i++;
       if(i<totalCam && camiones[i]instanceof DeVolteo){
           ((DeVolteo)camiones[i]).setCapacidadTon(capacidad); //casting
           resp=true;
       }
       else
           resp=false;
       
       return resp;
    }
    
    //3)
    public int regresaTotal(String marca){
       int i, total=0;
       
       for(i=0;i<totalCam;i++)
           if(camiones[i]instanceof DePasajeros && camiones[i].getMarca().equals(marca))
               total++;
       return total;
    }
    
    public double cantToneladas(){
        double ton=0;
        int i;
        
        for(i=0;i<totalCam;i++)
            if(camiones[i]instanceof DeVolteo)
                ton += ((DeVolteo)camiones[i]).getCapacidadTon();
        
        return ton;
    }
    
    
    
}
