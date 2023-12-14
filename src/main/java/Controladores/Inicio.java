package Controladores;

import Servicios.*;

/*
 * Clase principal de la aplicacion
 * 14/12/2023 -> irodhan
 */
public class Inicio {
	/*
	 * Metodo principal de la aplicacion
	 * 14/12/2023 -> irm
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int opcionIntroducida=0;
		Boolean cerrarMenu=false;
		MenuInterfaz mI= new MenuImplementacion();
		ModificacionesBBDDImplementacion mB= new ModificacionesBBDDImplementacion();
		
		while(!cerrarMenu) 
		{
			opcionIntroducida=mI.mostrarMenuYSeleccion();
			
			switch(opcionIntroducida) 
			{
			case 0: 
				System.out.println("[INFO] - Ha seleccionado la opcion 0");
				cerrarMenu=true;
				break;
			case 1:
				System.out.println("[INFO] - Ha seleccionado la opcion 1");
				//mB.darAlta();
				break;
			case 2:
				System.out.println("[INFO] - Ha seleccionado la opcion 2");
				//mB.eliminarElemento();
				break;
			case 3:
				System.out.println("[INFO] - Ha seleccionado la opcion 3");
				//mB.modificarCantidad();
				break;
			case 4:
				System.out.println("[INFO] - Ha seleccionado la opcion 4");
				//mB.mostrarStock();
				break;
			case 5:
				System.out.println("[INFO] - Ha seleccionado la opcion 5");
				//mB.crearReserva();
				break;
			default:
				System.out.println("[INFO] - El numero introducido no corresponde a ninguna opcion");
			}
			
		}
		
		
	}

}
