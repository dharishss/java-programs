
public class Search1 {

	public static void main(String[] args)
	{
        int[] arr = {1,2,3,4,99,6};
        int target =99;
        System.out.println(linearsearch(arr, target));
	}
	static int linearsearch(int[] arr,int target)
	{
		for (int i = 0; i < arr.length; i++) {
			int element = arr[i];
			if(element==target)
			{
				return element;
			}
		}
		return -1;
	}

}
