
public class Reverseastring {
 static	String str =" harish harish";
 static int size = str.length();
 static int top =-1;
static char[] stack = new char[size];
    public static void push(char cha)
    {
    	if(top == size-1)
    	{
    		System.out.println("stack is full");
    	}
    	else
    	{
    		top++;
    		stack[top] =cha;
    	}
    }
    public static void display()
    {
    	if(top==-1)
    	{
    		System.out.println("stack is empty");
    	}
    	else
    	{
    		for(int i = top; i>=0;i--)
    		{
    			System.out.println(stack[i]);
    		}
    	}
    }
	

	public static void main(String[] args) {
		for (int i = 0; i <str.length(); i++) {
			push(str.charAt(i));
		}
		display();

	}

}
