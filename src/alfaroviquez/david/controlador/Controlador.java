package alfaroviquez.david.controlador;

import alfaroviquez.david.bl.logica.Gestor;
import alfaroviquez.david.ui.IU;

public class Controlador {
    private IU interfaz = new IU();
    private Gestor gestor = new Gestor();

    public void ejecutarPrograma(){
        int opcion=0;
        do{
            interfaz.imprimirMenu();
            opcion = interfaz.leerNumero();
            procesarOpcion(opcion);
        }while (opcion!=9);
    }

    private void procesarOpcion(int opcion) {
        switch (opcion){
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            default:
                interfaz.imprimirMensaje("Opcion invalida");
        }
    }
}
