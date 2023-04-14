
public class Orderagnosticbinarysearch {

	public static void main(String[] args) {

		int[] arr = {1,2,4,5,6,77,899};
	       int target = 77;
	       int ans = obs(arr, target);
	       System.out.println(ans);
	       int[] arr1 = {9,8,7,6,5,4,3};
	       int target1 = 8;
	       int ans1 = obs(arr1, target1);
	       System.out.println(ans1);
       
	}
	
	public static int obs(int[] arr,int target)
	{
		int start = 0;
		int end = arr.length-1;
		  boolean isasc =  arr[start]<arr[end];
		  while(start<=end)
		  {
			  int mid = start + (end -start)/2;
			  if(target == arr[mid])
			  {
				  return mid;
			  }
			  if(isasc)
			  {
				  if(target > arr[mid])
				  {
					  start = mid +1;
				  }
				  else if (target < arr[mid]) 
				  {
					end = mid -1;
				  }
			  }
			  else
			  {
				  if(target < arr[mid])
				  {
					  start = mid +1;
				  }
				  else if (target < arr[mid]) 
				  {
					end = mid -1;
				  }
			  }
		

}
		  return -1;
	}
}
