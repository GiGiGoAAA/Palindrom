//Chaorui Xiang
//Csc 236-02
//Lab4#LinkedStackDS
public class LinkedStackDS<T> implements LinkedStackADT<T>
{
	private class StackNode<T>
	{
	    public T element;
	    public StackNode<T> next;
		public StackNode()
	    {
	        element = null;
	        next = null;
	    }
	    public StackNode(T e, StackNode<T> n)
	    {
	        element = e;
	        next = n;
	    }

		public String toString()
		{
			return "StackNode [element=" + element + ", next=" + next + "]";
		}
	}

	protected StackNode<T> top;
	protected int size;
    public LinkedStackDS()
	{
	   top = null;
	   size = 0;
	}
    public LinkedStackDS(StackNode<T> top,int size)
	{
	    this.top = top;
	    this.size = size;
	}
    public LinkedStackDS(LinkedStackDS<T> lsds)
	{
	    top = lsds.top;
	    size = lsds.size;
	}
	public int size()
	{
	    return size;
	}
	public boolean isEmpty()
	{
	    if(top == null)
	       return true;
	    return false;
	}
	public T peek() throws StackUnderflowException
	{
	    if(isEmpty())
	       throw new StackUnderflowException("Underflow");
	    return top.element;
	}
    public void push(T element)
	{
         StackNode<T> node = new StackNode<T>(element, top);
         top = node;
	     size++ ;
	}
    public T pop() throws StackUnderflowException
    {
	    if(isEmpty())
	       throw new StackUnderflowException("Underflow");
	    T temp = top.element;
	    top = top.next;
	    size--;
	    return temp;
	 }
	 public String display()
	 {
	    String h="";
	    System.out.print("\nStack = ");
	    if(size == 0)
	    {
	       System.out.print("Empty\n");
	       return null;
	    }
	    StackNode<T> ptr = top;
	    while (ptr != null)
	    {
	        h+=ptr.element;
	        ptr = ptr.next;
	    }
	     top = null;
	     return h;
	 }
}
