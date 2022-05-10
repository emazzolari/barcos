package Servicios;

import Entidades.Barco;
import Entidades.Cliente;
import Entidades.Velero;
import java.util.Scanner;

public class VeleroServicio extends ClienteServicio {

    Scanner leer = new Scanner(System.in);

    public Velero crearVelero(Barco bx) {
        
        Velero vx = new Velero();
        
        System.out.println("Ingrese la cantidad de mastiles");
        vx.setMastiles(leer.nextInt());
        
        return vx;
    }
    
    public double alquilerVelero(Cliente cx,Velero vx){
         
        alquilerBase(cx, vx);
        double alquilerVelero = alquilerBase(cx, vx) + vx.getMastiles();
        System.out.println("el alquiler del velero es "+alquilerVelero);
        return alquilerVelero;
        
    }
}
