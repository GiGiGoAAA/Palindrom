
import java.io.IOException;
import javax.swing.JOptionPane;
public class PalindromDemo
{
	static LinkedStackDS<Character> stack;

	public static String replaceALL(String f)
	{
		String[] p = f.split(" ");
		String k = "";
		for (int i = 0; i < p.length; i++)
		{
			for (int j = 0; j < p[i].trim().length(); j++)
			{
			   if(Character.isAlphabetic(p[i].charAt(j))){
			   stack.push(p[i].charAt(j));
			   k += p[i].charAt(j);}
			}
		}
		return k;
	}
	public static void main(String[] args) throws IOException
	{
	  String f="";
	  String h="";

	  stack = new LinkedStackDS<Character>();
	  do{
		 try{
		     f = JOptionPane.showInputDialog("enter the string or line....");
		     h=PalindromDemo.replaceALL(f);
		     String k=stack.display();
			 if(h.equalsIgnoreCase(k))
			 {
				System.out.println(f+"--->Palindrom Confirmed");
			 }
			 else
				System.out.println(f +"--->Not a Palindrom");
			 }
			 catch(NullPointerException e)
			 {
			    System.exit(0);
		     }
		     catch (NumberFormatException e)
		     {
			   System.exit(0);
		     }
		 }while(true);
	}

}
