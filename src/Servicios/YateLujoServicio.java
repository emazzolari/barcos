
package Servicios;

import Entidades.Barco;
import Entidades.BarcoMotor;
import Entidades.Cliente;
import Entidades.YateLujo;
import java.util.Scanner;

public class YateLujoServicio extends ClienteServicio {
     Scanner leer = new Scanner(System.in);
     
     public YateLujo CrearYateLujo (Barco bx){
          YateLujo ylx = new YateLujo();
        
        System.out.println("Cuantos camarotes desea?");
        ylx.setNumeroCamarote(leer.nextInt());
        
        return ylx;
     }
     
     public double alquilerYateLujo(Cliente cx,YateLujo ylx){
         
        alquilerBase(cx, ylx);
        double alquilerYateLujo = alquilerBase(cx, ylx) + ylx.getNumeroCamarote();
        System.out.println("el alquiler del velero es "+alquilerYateLujo);
        return alquilerYateLujo;
        
    }
}
