package Entidades;

import java.util.Scanner;

public class Barco {

    protected double matricula;
    protected int eslora;
    protected int anioFabricacion;

    public Barco() {
    }

    public void crearBarco() {
        Scanner leer = new Scanner(System.in);

        matricula = Math.round(Math.random()*1000);
        System.out.println("La Matricula del barco es "+matricula);
        
        System.out.println("Ingrese los metros de eslora que desea ");
        eslora = (leer.nextInt());
        System.out.println("Ingrese Año de fabricación que desea ");
        anioFabricacion = (leer.nextInt());

    }

    public Barco(int matricula, int eslora, int anioFabricacion) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.anioFabricacion = anioFabricacion;
    }

    

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getEslora() {
        return eslora;
    }

    public void setEslora(int eslora) {
        this.eslora = eslora;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    @Override
    public String toString() {
        return "Barco{" + "matricula=" + matricula + ", eslora=" + eslora + ", anioFabricacion=" + anioFabricacion + '}';
    }

}
