package m_o2_listascolaspilas;



public class Lista {
	//primero creo dos variables de tipo nodo en si son dos objetos en la practica
	protected Nodo inicio;
	//creo el contructor de esta clase
	protected Nodo auxiliar;
	public Lista() {
		//inicializo los valores en nulo porque por defecto al principio estran vacios
		this.inicio = null;
	}
	//creo la funcion para poder agregarle al principio
	public void agregarInicio(int elemento) {
		//creo el objeto que va almacenar el elemento le paso el elemento y el objeto fin
		Nodo nodo = new Nodo(elemento,inicio);
		//en el objeto inicio le almaceno el contenido de nodo
		inicio=nodo;
	}
	
	//creo la funcion para saber si la lista esta vacia
	public boolean estaVacia() {
		//que lea la variable inicio si contiene informacion
		if(inicio==null) {
			//si esta con datos me devuelve el valor de verdadero
			return true;
		}
		//caso contrario me debe devoler false
		return false;
	}
	
	//funcion para recorrer los nodos y colocar al final el elemento
	public void agregarFinal(int numero) {
		//instancio el nodo para pasarle el dato, en si es la posicion final le que se crea aqui
		Nodo nodo = new Nodo(numero,null);
		//compruebo que no este vacio
		if(estaVacia()) {
			//si esta vacio le coloco en el inicio el valor del nodo
			inicio=nodo;
		}else {
			//si esta ya con datos, le coloco en un auxiliar los valores
			auxiliar = inicio;
			//recorro el auxiliar con su pintero hasta encontrar las datos
			while(auxiliar.siguiente!=null) {
				auxiliar = auxiliar.siguiente;
			}
			//entonces el apuntador se auxiliar debe referencias al valor igresado en el nodo
			auxiliar.siguiente = nodo;
		}
	}
	
	//insertar intermedio de algun valor
	public void insertarMedio(int numero,int posicion) {
		//croe el objeto nodo
		Nodo nodo = new Nodo(numero,null);
		//commpruebo si esta vacia la lista
		if(estaVacia()) {
			System.out.println("La lista esta vacia no existe la posicion que tu quieres");
		}else {
			//creo el auxiliar para alli colocar lo existente
			auxiliar = inicio;
			//necesito el contador para buscar la posicion
			int contador = 0;
			//evaluo el contador que cumpla la condicion del numero que me pide el usuario
			while (contador < posicion && auxiliar.siguiente!=null) {
				auxiliar = auxiliar.siguiente;
				contador++;
			}
			//aqui lo que hago es que el nodo ya tiene el valor, pero el puntero estaba con nulo asi que alli le coloco 
			//lo que aun esta dentro de la cola del auxiliar con el puntero y demas posiciones
			nodo.siguiente=auxiliar.siguiente;
			//entonces ahora ya le puedo insertar el nodo con los elementos que le agregue en la linea anterior
			auxiliar.siguiente=nodo;
		}
	}
	
		
	//funcion para buscar un dato 
	public void buscarpornumero(int numero) {
		//compruebo que si esta vacia
		if(estaVacia()) {
			System.out.println("La lista esta vacia");
		}else {
			//si tiene elementos le paso a un objeto nodo toda la lista
			auxiliar = inicio;
			//utilizo el contador para marcar la posicion
			int contador = 0;
			//valido que el dato no sea nulo
			while (auxiliar!=null) {
				//si el dato es igual al dato dentro el nodo envio mensaje de la posicion donde esta
				if(numero == auxiliar.getDato()) {
					System.out.println("El elemento buscado esta en la posicion: "+contador);
				}
				//sino que siga corriendo hasta el final
				auxiliar=auxiliar.siguiente;
				contador++;
			}
		}
	}
	

	//funcion para eliminar cualquier elemento
	public void eliminarporposicion(int posicion) {
		//validar si esta vacia o no la lista
		if(estaVacia()) {
			System.out.println("la lista esta vacia y no hay que eliminar");
		}else {
			//le cargo los datos en el auxiliar para trabajar con el
			auxiliar=inicio;
			int contador = 0;
			//busco la posicion menos uno porque ese elemento le apunta al que yo quiero eliminar
			while(contador < (posicion-1)) {
				//si se ha cumplido la condicion entonces a esa posicion le capturo 
				auxiliar = auxiliar.siguiente;
				contador++;
			}
			//creo un nodo temporal donde almaceno lo que esta luego del apuntador hacia atras
			Nodo temporal = auxiliar.siguiente;
			//ese temporal le conecto con el puntero que tenia el auxiliar del elemento antes de la posicion buscada
			//con el puntero del temporar y entonces el temporal no le pasa la cabeza de el que es el que quiero borrar
			auxiliar.siguiente = temporal.siguiente;
			//por seguridad le el temporal le apunto a null para que ya no tenga dentro guardado los valores
			temporal.siguiente=null;
		}
	}
	
	//funcion para eliminar la cabeza en la lista
	public void eliminarcabeza() {
		//compruebo que este vacia
		if(estaVacia()) {
			System.out.println("La lista esta vacia");
		}else {
			//para eliminar la cabeza hago que la cabeza apunte a su siguiente y asi la cabea queda libre
			inicio=inicio.siguiente;
		}
	}
	
	//funcion para eliminar el ultimo en la lista
	public void eliminarcola() {
		//compruebo que no este vacia
		if(estaVacia()) {
			System.out.println("Esta la lista vacia");
		}else {
			//si tiene un solo elemento le aviso que no se puede aliminar el unico
			if(inicio.siguiente==null) {
				System.out.println("solo tiene un elemento la lista no tiene cola para eliminar");
			}else {
				//le paso los elementos al auxiliar
				auxiliar=inicio;
				//mientras la secuencia de dos punteros seguidos no apunte a null quiere decir que aun hay elementos
				while (auxiliar.siguiente.siguiente!=null) {
					//le recorro normalmente a los punteros
					auxiliar=auxiliar.siguiente;
				}
				//si se a cumplido la condicion le digo que tome el siguiente normal con el que salio
				//y este empieze apuntar hacia nulo
				auxiliar.siguiente=null;
			}
		}
	}
	
	//funcion para el tamanio de la cola
	public int tamanio() {
		if(estaVacia()) {
			return 0;
		}else {
			//le paso a un auxiliar para que me ayude con la cuenta porque sino se vacia el objeto inicio en caso de querer
			//refrescarlo cada rato
			auxiliar=inicio;
			//este sera el contador que lo retornare
			int contador=0;
			while(auxiliar!=null) {
				auxiliar = auxiliar.siguiente;
				contador++;
			}
			//este contador me retorna haciendole cuenta al null
			return contador;
		}
	}
	
	//funcion para poder recorrer la lista y mostrar los valores
	public void verLista() {
		//creo un objeto auxiliar para poder alli almacenar los valores que contenga el nodo
		auxiliar = inicio;
		//primero compruebo si la lista esta vacia
		if(estaVacia()) {
			System.out.println("La lista esta vacia");
		}else {
			//si en el caso de estar llena le empiezo a recorrer el objeto que cree arriba
			while(auxiliar!=null) {
				//empiezo a desglozar los datos
				System.out.print("["+auxiliar.getDato()+"]"+" --> ");
				auxiliar = auxiliar.getSiguiente();
			}
			//si ya termina de correr la lista que me muestre el valor de null
			System.out.print("null");
		}
	}
}
