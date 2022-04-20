
package Servicios;

import Entidades.Barco;
import Entidades.BarcoMotor;
import Entidades.Velero;
import java.util.Scanner;

public class BarcoMotorServicio extends BarcoServicio {
     Scanner leer = new Scanner(System.in);
     
     public BarcoMotor CrearBarcoMotor (Barco bx){
         BarcoMotor bmx = new BarcoMotor();
        
        System.out.println("Ingrese la cantidad de cv");
        bmx.setCv(leer.nextInt());
        System.out.println(bmx.toString());
        return bmx;
     }
}
