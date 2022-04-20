package Servicios;

import Entidades.Barco;
import Entidades.Cliente;
import java.util.Scanner;

public class BarcoServicio {

    Scanner leer = new Scanner(System.in);
    
    public double alquilerBase(Cliente cx, Barco bx) {

        long falqmili = cx.getFechaAlquiler().getTime();
        long fdevmili = cx.getFechaDevolucion().getTime();
        long diasAlquiler = (fdevmili - falqmili) / 8640000;
        double alquilerBase = diasAlquiler * 10 * bx.getEslora();

        return alquilerBase;
    }

}
