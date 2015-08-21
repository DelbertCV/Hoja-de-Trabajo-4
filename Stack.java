

/**
 * @author Delbert Custodio, 14246
 * @author Jonathan Aguirre, 14349
 *
 * @param <E>
 */
public abstract class Stack<E> {
	public Stack(){}
	public abstract void empty();
	public abstract boolean isEmpty();
	public abstract void push(E x) ;
	public abstract E pop() throws Exception;
	public abstract int size();
	public abstract E peek() throws Exception;
	
}
