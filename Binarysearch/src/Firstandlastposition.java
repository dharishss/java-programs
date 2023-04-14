import javax.xml.stream.events.StartDocument;

public class Firstandlastposition {
	
	public static void main(String[] args) {
		int[] arr = {1,2,7,7,7,7,5,5};
		int target = 7;
		int[] fans =searchRange(arr, target);
		for (int i = 0; i < fans.length; i++) {
			System.out.println(fans[i]);

		}
	}
	
	public static  int[] searchRange(int[] arr, int target)
	{
	
	int[] ans = {-1,-1};
	ans[0] = searchRange(arr, target, true);
	if(ans[0] != -1)
	{
		ans[1] = searchRange(arr, target, false);
	}
	
	return ans;
	}
	
   public static  int searchRange(int[] arr, int target, boolean findfirstoccurence) 
   {
	   int ans = -1;
	   
	   int first = 0;
	   int last = arr.length-1;
	   while(first <= last)
	   {
		  int mid = first +( last - first )/2;
		  if(target > arr[mid])
		  {
			  first = mid +1;
		  }
		  else if (target <arr[mid]) {
			  last = mid -1;
			
		}
		  else
		  {
			  ans = mid;
			  if(findfirstoccurence)
			  {
				  last = mid -1;
			  }
			  else
			  {
				  first = mid +1;
			  }
		  }
		  {
			  
		  }
	   }
	   
	   return  ans;
   }


}
