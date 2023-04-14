
public class Queueds {
	static  int size=4;
    static   int[] arr = new int[size];
     static   int last =0,first=0;
     
     public static boolean isfull()
     {
    	 if(last==size)
    	 {
    		 return true;
    	 }
    	 else
    	 {
    		 return false;
    	 }
     }
     public static void enQue(int ele)
     {
    	 if(isfull())
    	 {
    		 System.out.println("que is full");
    	 }
    	 else
    	 {
    		 arr[last]= ele;
    		 last++;
    	 }
     }
     public static boolean isempty()
     {
    	 if(last==first)
    	 {
    		 return true;
    	 }
    	 else
    	 {
    		 return false;
    	 }
     }
     public static void deQue()
     {
    	 if(isempty())
    	 {
    		 System.out.println("que is empty");
    	 }
    	 else
    	 {
    		 for (int i = 0; i <last-1; i++) {
				arr[i] = arr[i+1];
			}
    		 last--;
    	 }
     }
     public static void display()
     {
    	 if(isempty())
    	 {
    		 System.out.println("que is empty");
    	 }
    	 else
    	 {
    		 for (int i = 0; i <last; i++) {
				System.out.print(arr[i]+" ");
			}
    	 }
     }
     

	public static void main(String[] args) 
	{
     
      enQue(64);
     enQue(5);
     enQue(75);
     enQue(4);
     display();
      deQue();
      deQue();
      deQue();
      deQue();
      display();
      
	}
}
