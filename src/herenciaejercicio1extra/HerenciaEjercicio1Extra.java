package herenciaejercicio1extra;

import Entidades.Barco;
import Entidades.Cliente;
import Entidades.Velero;
import Servicios.BarcoServicio;
import Servicios.ClienteServicio;
import Servicios.VeleroServicio;

public class HerenciaEjercicio1Extra {

    public static void main(String[] args) {
        BarcoServicio bs = new BarcoServicio();
        VeleroServicio vs = new VeleroServicio();
        ClienteServicio cx = new ClienteServicio();
        Barco bx = new Barco();

        Cliente cliente1 = cx.crearCliente();
        cx.alquilerBase(cliente1, bx);
        Velero velero1 = vs.crearVelero(bx);
        
        vs.alquilerVelero(cx.alquilerBase(cliente1, bx), velero1);

    }

}
