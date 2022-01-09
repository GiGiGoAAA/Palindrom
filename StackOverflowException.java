
public class StackOverflowException extends StackException
{
	public StackOverflowException()
	{
		super("stack overflow");
	}
	public StackOverflowException(String s)
	{
		super(s);
	}
}
