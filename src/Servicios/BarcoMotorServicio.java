
package Servicios;

import Entidades.Barco;
import Entidades.BarcoMotor;
import Entidades.Cliente;
import Entidades.Velero;
import java.util.Scanner;

public class BarcoMotorServicio extends ClienteServicio {
     Scanner leer = new Scanner(System.in);
     
     public BarcoMotor CrearBarcoMotor (Barco bx){
         BarcoMotor bmx = new BarcoMotor();
        
        System.out.println("Que cantidad de cv quiere que tenga el motor?");
        bmx.setCv(leer.nextInt());
        
        return bmx;
     }
     
     public double alquilerBarcoMotor(Cliente cx,BarcoMotor bmx){
         
        alquilerBase(cx, bmx);
        double alquilerBarcoMotor = alquilerBase(cx, bmx) + bmx.getCv();
        System.out.println("el alquiler del velero es "+alquilerBarcoMotor);
        return alquilerBarcoMotor;
        
    }
}
