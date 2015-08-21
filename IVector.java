import java.util.*;

/**
 * @author Delbert Custodio
 * @author Jonathan Aguirre
 * 
 * Clase encargada de implementar la clase Vector de Java para
 * el Stack
 *
 * @param <Double>
 */
@SuppressWarnings("hiding")
public class IVector<Double> extends Stack<Double>{
	
	private Vector<Double> v ;
	
	public IVector(){
		v = new Vector<Double>();
	}
	
	@Override
	public void empty() {
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
		if (v.isEmpty())
			throw new Exception("Su vector se encuentra vacio");
		else
			return v.lastElement();
	}}