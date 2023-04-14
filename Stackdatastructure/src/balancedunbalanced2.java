
public class balancedunbalanced2 {
	//static String str ="{[()]}";
	//static String str = "{[[ ()]]}";
	//static String str = "{[)]}";
	// static String str = "{[(}])";
	 static String str = "{[(}])";

	//static String str = "{[(}])";
	 static boolean b = false;
	static int size = str.length();
	static int top =-1;
	static char[] stack = new char[size];

	public static boolean isfull()
	{
		if(top==size-1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static void push(char cha)
	{
		if(isfull())
		{
			System.out.println("stack is full");
		}
		else
		{
			top++;
			stack[top] = cha;
		}
	}
	public static boolean isempty()
	{
		if(top == -1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static void pop()
	{
		if(isempty())
		{
			b= true;
		}
		else
		{
			top--;
		}
	}
	public static void display()
	{
		if(isempty())
		{
			System.out.println(" stack is empty");
		}
		else
		{
			for (int i = top;i>=0; i--) {
				System.out.println(stack[i]);
			}
		}
	}
	

	public static void main(String[] args) {
          for (int i = 0; i <size; i++) 
          {
			if(str.charAt(i)=='{' || str.charAt(i)== '['  || str.charAt(i)=='(')
			{
				push(str.charAt(i));
			}
			else if( str.charAt(i)==')')
			{
				if(stack[top]=='(')
					pop();
				else
					return;
			}
		}
         
        if(isempty() && b == false)
     	 {
     		 System.out.println("balanced string");
    	 }
    	 else     	 
    	 {
   		 System.out.println("unbalanced string");
  	 }
    		 
    	 
			
		}
	}


