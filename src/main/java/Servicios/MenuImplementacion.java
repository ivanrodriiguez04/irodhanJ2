package Servicios;

import java.util.Scanner;

public class MenuImplementacion implements MenuInterfaz {
	@Override
	public int mostrarMenuYSeleccion() 
	{
		Scanner sc = new Scanner(System.in);
		int opcion=0;
		
		System.out.println("0. Cerra App");
		System.out.println("1. Dar alta");
		System.out.println("2. Eliminar elemento");
		System.out.println("3. Modificar cantidad");
		System.out.println("4. Mostrar stock");
		System.out.println("5. Crear reserva");
		opcion=sc.nextInt();
		return opcion;
	}
}
