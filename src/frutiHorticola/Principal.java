package frutiHorticola;

public class Principal {
			
	public static void main(String[] args){
		boolean finSimulacion=false;
		Evento actual;
                ListIterator iterator;
		float tiempoSimulacion;
		
                Fel fel = Fel.getFel();//Creo la lista de eventos futuros
		
                Queue queue = new Queue();//Creo la cola de espera
                //Queue queue = Queue.getQueue(); //Creo cola de espera
		
                Servidor servidor = new Servidor();//Creo el servidor
                //Servidor servidor = Servidor.getServidor();//Creo el servidor
		

		//Continuar con la implementación ...

	}
}
