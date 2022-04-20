
package Servicios;

import Entidades.Barco;
import Entidades.BarcoMotor;
import Entidades.YateLujo;
import java.util.Scanner;

public class YateLujoServicio extends BarcoServicio {
     Scanner leer = new Scanner(System.in);
     
     public YateLujo CrearYateLujo (Barco bx){
          YateLujo ylx = new YateLujo();
        
        System.out.println("Ingrese la cantidad de camarotes");
        ylx.setCv(leer.nextInt());
        System.out.println(ylx.toString());
        return ylx;
     }
}
