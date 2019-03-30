package frutiHorticola;
import java.util.LinkedList;
import java.util.ListIterator;



public class Fel {
	private static Fel fel;
	private LinkedList lista;
        
	private Fel(){
            lista=new LinkedList();	
	}
	
	public static Fel getFel(){
		if(fel==null)
			fel=new Fel();
		return(fel);
	}
	
	public void insertarFel(Evento e){
            
	}

	public Evento suprimirFel(){
		
	}
	
	public void mostrarFel(){
		
	}
	
	/**
	 * @return Returns the lista.
	 */
	public LinkedList getLista() {
		return lista;
	}
	
}
