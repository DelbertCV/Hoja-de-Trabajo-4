@SuppressWarnings("hiding")
public class ListaSimple<Double> extends ListaA<Double>{
	
	private Nodo<Double> head;
	private int count;
	
	public ListaSimple(){
		head = null;
		count = 0;
	}

	@Override
	public Double QUltimo() {
		// TODO Auto-generated method stub
		
		Nodo<Double> finger = head;
		Nodo<Double> anterior = null;
		while(finger.getNext() != null){
			anterior = finger;
			finger = finger.getNext();
		}
		
		//finger = null o fin de la lista
		if (anterior == null){
			head = null; //un elemento
		}
		else{ 
			anterior.setNext(null);
		}
		count--;
		return finger.getValor();
	}

	@Override
	public void AUltimo(Double a) {
		// TODO Auto-generated method stub
		Nodo <Double> temp = new Nodo <Double> (a);
		if (head!=null){
			Nodo<Double> finger = head;
			while (finger.getNext() != null){
				finger = finger.getNext();
			}
			finger.setNext(temp);
		}
		else head = temp;
		count ++;
	}

	@Override
	public Double GetUltimo() {
		// TODO Auto-generated method stub
		Nodo <Double> finger = head;
		Nodo <Double> anterior = null;
		while (finger.getNext() != null){ //fin de la lista
			anterior = finger;
			finger = finger.getNext();
		}
		return anterior.getValor();
	}

	@Override
	public boolean Contiene(Double a) {
		// TODO Auto-generated method stub
		Nodo <Double> finger = head;
		while (finger != null && !finger.getValor().equals(a)){
			
			finger = finger.getNext();
		}
		return finger != null;
	}

	@Override
	public void empty() {
		// TODO Auto-generated method stub
		count=0;
		head=null;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return count==0;
	}

	@Override
	public void push(Double x) {
		// TODO Auto-generated method stub
		Nodo<Double> temp = head;
		head = new Nodo<Double>(x) ;
		head.setNext(temp);
		count++;
	}

	@Override
	public Double pop() throws Exception {
		// TODO Auto-generated method stub
		Nodo <Double> temp = head;
		if(head!=null && head.getNext()!=null){
			head = head.getNext();
		}else{
			head=null;
		}
		count--;
		return temp.getValor();
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return count;
	}

	@Override
	public Double peek() throws Exception {
		// TODO Auto-generated method stub
		if (head == null){
			throw new Exception ("Stack vacio");
		}
		else{
			return head.getValor();
		}
	}
	
	
}