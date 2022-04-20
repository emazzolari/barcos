package Entidades;

import java.util.Scanner;

public class Barco {

    protected int matricula;
    protected int eslora;
    protected int anioFabricacion;

    public Barco() {
    }

    public void crearBarco() {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese Matricula del barco");
        matricula = (leer.nextInt());
        System.out.println("Ingrese eslora");
        eslora = (leer.nextInt());
        System.out.println("Ingrese Año de fabricación");
        anioFabricacion = (leer.nextInt());

    }

    public Barco(int matricula, int eslora, int anioFabricacion) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.anioFabricacion = anioFabricacion;
    }

    public int getMatricula() {
        return matricula;
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
