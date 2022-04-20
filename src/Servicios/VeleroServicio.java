package Servicios;

import Entidades.Barco;
import Entidades.Velero;
import java.util.Scanner;

public class VeleroServicio extends BarcoServicio {

    Scanner leer = new Scanner(System.in);

    public Velero crearVelero(Barco bx) {
        
        Velero vx = new Velero();
        
        System.out.println("Ingrese la cantidad de mastiles");
        vx.setMastiles(leer.nextInt());
        System.out.println(vx.toString());
        return vx;
    }
    
    public double alquilerVelero(double alquilerBase,Velero vx){
         
        double alquilerVelero = alquilerBase + vx.getMastiles();
        System.out.println("el alquiler del velero es "+alquilerVelero);
        return alquilerVelero;
        
    }
}
