package m_o2_listascolaspilas;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//aqui creo el objeto de lista para poder operar cons sus funciones
		Lista lista = new Lista();
		//creo el objeto para poder ingresar datos por teclado
		Scanner teclado = new Scanner(System.in);
		int estado,continuar;;
		do {
			System.out.println("----------Opciones----------");
			System.out.println("1 Si desea trabajar con Listas");
			System.out.println("0 Si desea salir");
			estado = teclado.nextInt();
			switch(estado) {
				case 1:
					int paso;
					do {
						System.out.println("---opciones de lista---");
						System.out.println("1 Agregar datos al inicio de la lista");
						System.out.println("2 Agregar datos al final de la lista");
						System.out.println("3 Agregar datos luego de una posicion en la lista");
						System.out.println("4 Buscar por elemento en la lista");
						System.out.println("5 Eliminar por posicion en la lista");
						System.out.println("6 Eliminar la cabeza");
						System.out.println("7 Eliminar la cola");
						System.out.println("0 Para salir");
						paso = teclado.nextInt();
						switch(paso) {
							case 1:
								do {
									System.out.println("Ingrese un valor al inicio de la lista");
									int numero = teclado.nextInt();
									lista.agregarInicio(numero);
									System.out.println("Datos luego de insertar al inicio en la lista");
									lista.verLista();
									System.out.println("");
									System.out.println("Tamaño de la lista: "+lista.tamanio());
									System.out.println("");
									System.out.println("1 para continuar, 0 para salir ");
									continuar = teclado.nextInt();
								}while(continuar!=0);
								break;
							case 2:
								do {
									System.out.println("Ingrese un valor al final de la lista");
									int numero = teclado.nextInt();
									lista.agregarFinal(numero);
									System.out.println("Datos luego de insertar al final en la lista");
									lista.verLista();
									System.out.println("");
									System.out.println("Tamaño de la lista: "+lista.tamanio());
									System.out.println("");
									System.out.println("1 para continuar, 0 para salir ");
									continuar = teclado.nextInt();
								}while(continuar!=0);
								break;
							case 3:
								do {
									System.out.println("Ingrese un valor que quiere colocar en la lista");
									int numero = teclado.nextInt();
									System.out.println("Luego de que posicion lo quiere colocar");
									int posicion = teclado.nextInt();
									lista.insertarMedio(numero, posicion);
									System.out.println("Datos luego de incertar intermedio en la lista");
									lista.verLista();
									System.out.println("");
									System.out.println("Tamaño de la lista: "+lista.tamanio());
									System.out.println("");
									System.out.println("1 para continuar, 0 para salir ");
									continuar = teclado.nextInt();
								}while(continuar!=0);
								break;
							case 4:
								do {
									System.out.println("Ingrese un numero que quiere buscar en la lista");
									int numero = teclado.nextInt();
									lista.buscarpornumero(numero);
									System.out.println("Datos de lista");
									lista.verLista();
									System.out.println("");
									System.out.println("Tamaño de la lista: "+lista.tamanio());
									System.out.println("");
									System.out.println("1 para continuar, 0 para salir ");
									continuar = teclado.nextInt();
								}while(continuar!=0);
								break;
							case 5:
								do {
									System.out.println("Ingrese la posicion que quiere eliminar");
									int posicion = teclado.nextInt();
									lista.eliminarporposicion(posicion);
									System.out.println("Datos luego de eliminar un valor de la lista");
									lista.verLista();
									System.out.println("");
									System.out.println("Tamaño de la lista: "+lista.tamanio());
									System.out.println("");
									System.out.println("1 para continuar, 0 para salir ");
									continuar = teclado.nextInt();
								}while(continuar!=0);
								break;
							case 6:
								do {
									lista.eliminarcabeza();
									System.out.println("Datos luego de eliminar la cabeza");
									lista.verLista();
									System.out.println("");
									System.out.println("Tamaño de la lista:"+lista.tamanio());
									System.out.println("");
									System.out.println("1 para continuar, 0 para salir ");
									continuar = teclado.nextInt();
								}while(continuar!=0);
								break;
							case 7:
								do {
									lista.eliminarcola();
									System.out.println("Datos luego de eliminar la cola");
									lista.verLista();
									System.out.println("");
									System.out.println("Tamaño de la lista: "+lista.tamanio());
									System.out.println("");
									System.out.println("1 para continuar, 0 para salir ");
									continuar = teclado.nextInt();
								}while(continuar!=0);
								break;
						}
					}while(paso!=0);			
				break;
			}
		}while(estado!=0);

	}

}
