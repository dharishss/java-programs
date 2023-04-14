
public class Binarysearch {
	
	public static int search(int[] arr,int target)
	{
		int start=0;
		int end= arr.length-1;
		
		while(start <=end)
			
		{
			int mid = start + (end-start)/2;
		if(target> arr[mid])
		{
			start = mid+1;
		}
		else if ( target <arr[mid]) {
			end = mid-1;
		}
		else if (target == arr[mid]) {
			return mid;
		}
		
	}
		return -1;
	}

	public static void main(String[] args) {
          int[] arr = {2,3,5,7,8,35,65,99};
          int target = 100;
          int ans = search(arr, target);
          System.out.println(ans);
	}

}
