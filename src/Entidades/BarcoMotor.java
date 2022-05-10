
package Entidades;

public class BarcoMotor extends Barco {
    
    protected int cv;

    public BarcoMotor() {
        crearBarco();
    }

    public BarcoMotor(int cv) {
        this.cv = cv;
    }

    public BarcoMotor(int cv, int matricula, int eslora, int anioFabricacion) {
        super(matricula, eslora, anioFabricacion);
        this.cv = cv;
    }

    public int getCv() {
        return cv;
    }

    public void setCv(int cv) {
        this.cv = cv;
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
    
    
}
