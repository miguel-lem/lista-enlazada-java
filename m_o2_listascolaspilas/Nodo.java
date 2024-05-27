package m_o2_listascolaspilas;

public class Nodo {
	//creo la variable donde voy almacenar la informacion
	private int dato;
	//creo el apuntador para que el haga referencia hacia donde esta el proximo dato
	public Nodo siguiente;
	//debo crear el constructor
	public Nodo(int dato, Nodo siguiente) {
		//asigno que este dato pertenece al dato que venga e fuera mediante el contructor
		this.dato=dato;
		//asigno a este apuntador el puntero externo que venga
		this.siguiente = siguiente;
	}
	public int getDato() {
		return dato;
	}
	public void setDato(int dato) {
		this.dato = dato;
	}
	public Nodo getSiguiente() {
		return siguiente;
	}
	public void setSiguiente(Nodo siguiente) {
		this.siguiente = siguiente;
	}
	
}
