
public interface LinkedStackADT<T>
{
    public int size();
    public boolean isEmpty();
    public T peek() throws StackUnderflowException;
    public void push(T element);
    public T pop() throws StackUnderflowException;
}
