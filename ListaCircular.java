@SuppressWarnings("hiding")
public class ListaCircular<Double> extends ListaA<Double>{
	
	private Nodo<Double> last;
	private int count;
	
	public ListaCircular(){
		last = null;
		count = 0;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public Double QUltimo() {
		// TODO Auto-generated method stub
		Nodo<Double> pointer = last;
		while (pointer.getNext()!= last){
			pointer = pointer.getNext();
		}
		
		Nodo<Double> temp = last;
		
		if (pointer == last){
			last = null;
		}
		else
		{
			pointer.setNext(last.getNext());
			last = pointer;
		}
		
		count--;
		return (Double) temp;
	}

	@Override
	public void AUltimo(Double a) {
		// TODO Auto-generated method stub
		//No se utiliza
	}

	@SuppressWarnings("unchecked")
	@Override
	public Double GetUltimo() {
		// TODO Auto-generated method stub
		Nodo<Double> pointer = last;
		while (pointer.getNext()!= last){
			pointer = pointer.getNext();
		}
		
		return (Double) pointer;
	}

	@Override
	public boolean Contiene(Double a) {
		// TODO Auto-generated method stub
		//No se utiliza
		return false;
	}

	@Override
	public void empty() {
		// TODO Auto-generated method stub
		count = 0;
		last = null;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return count==0;
	}

	@Override
	public void push(Double x) {
		// TODO Auto-generated method stub
		Nodo<Double> temp = new Nodo<Double>(x);
		
		if (last == null){
			
			last = temp;
			last.setNext(last);
			
		}
		else
		{
			temp.setNext(last.getNext());
			last.setNext(temp);
		}
		count++;
	}

	@Override
	public Double pop() throws Exception {
		// TODO Auto-generated method stub
		Nodo<Double> temp;
		Nodo<Double> temp2;
		temp2 = last.getNext();
		temp =  last.getNext().getNext();
		last.setNext(temp);
		return (Double) temp2.getValor();
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return count;
	}

	@Override
	public Double peek() throws Exception {
		// TODO Auto-generated method stub
		if (count!=0){
			return (Double) last.getNext().getValor();
		}
		
		return null;
	}

	
	
	
}