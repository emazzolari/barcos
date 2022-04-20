
package Entidades;

public class YateLujo extends BarcoMotor{
    
    protected int numeroCamarote;

    public YateLujo() {
        crearBarco();
    }

    public YateLujo(int numeroCamarote) {
        this.numeroCamarote = numeroCamarote;
    }

    public YateLujo(int numeroCamarote, int cv) {
        super(cv);
        this.numeroCamarote = numeroCamarote;
    }

    public YateLujo(int numeroCamarote, int cv, int matricula, int eslora, int anioFabricacion) {
        super(cv, matricula, eslora, anioFabricacion);
        this.numeroCamarote = numeroCamarote;
    }

    public int getNumeroCamarote() {
        return numeroCamarote;
    }

    public void setNumeroCamarote(int numeroCamarote) {
        this.numeroCamarote = numeroCamarote;
    }

    public int getCv() {
        return cv;
    }

    public void setCv(int cv) {
        this.cv = cv;
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
    
    
}
