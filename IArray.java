import java.util.*;

/**
 * @author Delbert Custodio
 * @author Jonathan Aguirre
 * 
 * Implementacion de una ArrayList para la clase Stack
 *
 * @param <Double>
 */
@SuppressWarnings("hiding")
public class IArray<Double> extends Stack<Double>{
	private ArrayList<Double> v;
	
	public IArray(){
		v = new ArrayList<Double>();
	}
	
	@Override
	public void empty() {
		// TODO Auto-generated method stub
		v.clear();
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return v.isEmpty();
	}

	@Override
	public void push(Double x) {
		// TODO Auto-generated method stub
		v.add(x);
	}

	@Override
	public Double pop() throws Exception {
		// TODO Auto-generated method stub
		if (v.isEmpty())
			throw new Exception("Su vector se encuentra vacio");
		else
			return v.remove(v.size()-1);
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return v.size();
	}

	@Override
	public Double peek() throws Exception {
		// TODO Auto-generated method stub
		if (v.isEmpty())
			throw new Exception("Su vector se encuentra vacio");
		else
			return v.get(v.size()-1);
	}
	
	
}