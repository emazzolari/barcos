package herenciaejercicio1extra;

import Entidades.Barco;
import Entidades.BarcoMotor;
import Entidades.Cliente;
import Entidades.Velero;
import Entidades.YateLujo;
import Servicios.BarcoMotorServicio;
import Servicios.BarcoServicio;
import Servicios.ClienteServicio;
import Servicios.VeleroServicio;
import Servicios.YateLujoServicio;
import java.util.Scanner;

public class HerenciaEjercicio1Extra {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        BarcoMotorServicio bms = new BarcoMotorServicio();
        VeleroServicio vs = new VeleroServicio();
        ClienteServicio cx = new ClienteServicio();
        Barco bx = new Barco();
        YateLujoServicio ylx=new YateLujoServicio();

        System.out.println("Bienvenido, por favor ingrese sus datos:");
        Cliente cliente1 = cx.crearCliente();

        System.out.println("Que barco desea alquilar?");
        System.out.println("1-Un Velero\n2-Barco con Motor\n3-Yate de Lujo");
        int opcion = 0;
        opcion = leer.nextInt();

        switch(opcion) {
            case 1:
                Velero velero1 = vs.crearVelero(bx);
                vs.alquilerVelero(cliente1, velero1);
                break;
            case 2:
                BarcoMotor barcoMotor1=bms.CrearBarcoMotor(bx);
                bms.alquilerBarcoMotor(cliente1, barcoMotor1);
                break;
            case 3:
                YateLujo yateLujo1=ylx.CrearYateLujo(bx);
                ylx.alquilerYateLujo(cliente1, yateLujo1);
                break;        
    }

    }

}
