package frutiHorticola;


public abstract class Evento {
	private int tipo;//0: Arribo - 1:Fin de Servicio - 2: Fin de Simulacion
	private float tiempo;
	private Item item;
	
	public Evento(int tipo,float tiempo,Item item){
		
        }

        public Item getItem() {
            
        }

        public void setItem(Item item) {
            
        }
	
	
	
	public float getTiempo() {
		
	}
	

	public void setTiempo(float tiempo) {
		
	}
	
	public int getTipo() {
		
	}
	
	public void setTipo(int tipo) {
		
	}

	/**
	 *  Implementa la planiificaci�n de eventos.
	 */
	public abstract void planificarEvento(Servidor servidor,Queue queue);
}
