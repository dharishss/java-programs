package bubblesort;

public class bubblesortalgo {

	public static void main(String[] args) {
           int[] arr =  {5,36,99,6,7,3};
           for(int i = 0;i<arr.length;i++)
           {
        	   for(int j =1;j<arr.length-i;j++ )
        	   {
        		   if(arr[j]<arr[j-1])
        		   {
        			   int temp = arr[j-1];
        			   arr[j-1]=arr[j];
        			   arr[j]= temp;
        		   }
        	   }
           }
           System.out.println("hfh");
           for (int i = 0; i < arr.length; i++) {
        	   System.out.println(arr[i]);
			
		}
           
	}

}
