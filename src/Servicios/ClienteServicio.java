package Servicios;

import Entidades.Barco;
import Entidades.Cliente;
import java.util.Date;
import java.util.Scanner;

public class ClienteServicio {

    Scanner leer = new Scanner(System.in);

    public Cliente crearCliente() {

        Cliente cx = new Cliente();

        System.out.println("Ingrese el nombre");
        cx.setNombre(leer.next());

        System.out.println("Ingrese el dni");
        cx.setDni(leer.nextInt());

        Date diaAlquiler = new Date();
        System.out.println("Ingrese el día de alquiler");
        diaAlquiler.setDate(leer.nextInt());
        System.out.println("Ingrese el mes de alquiler");
        diaAlquiler.setMonth(leer.nextInt()-1);
        System.out.println("Ingrese el año de alquiler");
        diaAlquiler.setYear(leer.nextInt()-1900);
        
        cx.setFechaAlquiler(diaAlquiler);
        
        Date diaDevolucion = new Date();
        System.out.println("Ingrese el día de devolución");
        diaDevolucion.setDate(leer.nextInt());
        System.out.println("Ingrese el mes de devolución");
        diaDevolucion.setMonth(leer.nextInt()-1);
        System.out.println("Ingrese el año de devolución");
        diaDevolucion.setYear(leer.nextInt()-1900);

        cx.setFechaDevolucion(diaDevolucion);
        
        System.out.println("Usted va a alquilar "+(cx.getFechaDevolucion().getTime()-cx.getFechaAlquiler().getTime())/86400000+" días");
        //System.out.println("Ingrese el número de amarre");
       // cx.setAmarre(leer.nextInt());

//        LocalDate dateBefore = LocalDate.of(anio1, mes1, dia1);
//        LocalDate dateAfter = LocalDate.of(anio2, mes2, dia2);
//        long dias = ChronoUnit.DAYS.between(dateBefore, dateAfter);
//        System.out.println(dias);

        
        return cx;
    }
    
    public double alquilerBase (Cliente cx, Barco bx){
        
        long alquilerBase=((cx.getFechaDevolucion().getTime()-cx.getFechaAlquiler().getTime())/86400000)*10*bx.getEslora();
        
        return alquilerBase; 
    }
}
