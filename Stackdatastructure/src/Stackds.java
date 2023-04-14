
public class Stackds {
	
	 static int   top = -1;
     static	int size = 5;
	  static  int[] stack = new int[size];
	
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
	public static void push(int ele)
	{
		if(isfull())
		{
			System.out.println("stack is full");
		}
		else
		{
			top++;
			stack[top] = ele;
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
			System.out.println("stack is empty");
		}
		else
		{
			System.out.println(stack[top] + " deleted");
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
		push(45);
		push(75);
		push(67);
		push(76);
		push(77);
        display();
	}

}
