@SuppressWarnings("hiding")
public class ListaDoble<Double> extends ListaA<Double>{
	
	private NodoDoble<Double> head;
	private NodoDoble<Double> tail;
	private int count;
	
	public ListaDoble(){
		count = 0;
		head = null;
		tail = null;
		
	}
 
	@Override
	public Double QUltimo() {
		// TODO Auto-generated method stub
		NodoDoble<Double> temp = tail;
		tail = tail.getPrevious();
		if (tail == null){
			head = null;
		}
		else {
			tail.setNext(null);
		}
		count --;
		return temp.getValor();
	}

	@Override
	public void AUltimo(Double a) {
		// TODO Auto-generated method stub
		tail = new NodoDoble <Double> (a);
		count ++;
	}

	@Override
	public Double GetUltimo() {
		// TODO Auto-generated method stub
		return tail.getValor();
	}

	@Override
	public boolean Contiene(Double a) {
		// TODO Auto-generated method stub
		int i = 0;
		NodoDoble<Double> temp = head;
		while (i<size()){
			if (temp.valor == a){
				return true;
			}
			else
			{
				temp = (NodoDoble<Double>) temp.getNext();
			}
			i++;
		}
		return false;
	}

	@Override
	public void empty() {
		// TODO Auto-generated method stub
		count = 0;
		head = null;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return count==0;
	}

	@Override
	public void push(Double x) {
		// TODO Auto-generated method stub
		if(head==null){
			head = new NodoDoble<Double>(x) ;
		}else{
			tail=head;
			head = new NodoDoble<Double>(x) ;
			head.setNext(tail);
			tail.setPrevious(head);
			
		}
		count++;
	}

	@Override
	public Double pop() throws Exception {
		// TODO Auto-generated method stub
		if (head!=null && size()!=0){
			NodoDoble<Double> temp;
			temp=head;
			head.setNext(null);
			head=tail;
			head.setPrevious(null);
			if(head.getNext()!=null){
				tail=(NodoDoble<Double>) head.getNext();
			}
			count--;
			return (Double) temp.getValor();
		}
		else{
			throw new Exception ("Stack vacio!!");
		}
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return count;
	}

	@Override
	public Double peek() throws Exception {
		// TODO Auto-generated method stub
		return head.getValor();
	}
	
	
}