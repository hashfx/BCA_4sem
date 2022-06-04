// 11. wap for binary search.

public class Q11 {

	static int binarySearch(int arr[], int l, int r, int val){
		if(r>=l){
			int mid = l + (r - 1) / 2;

			if(arr[mid] == val){
				return mid;
			}

			if(arr[mid] > val){
				binarySearch(arr, l, mid - 1, val);
			}

			return binarySearch(arr, mid + 1, r, val);
		}
		return -1;
	}

	public static void main(String[] args) {
        // wap to print hello world.
        int arr[] = {2, 4, 5, 6, 8, 9};
        int size = arr.length; 
        int val = 5;
        System.out.println(binarySearch(arr, 0, size-1, val));
	}
}

// output -> 2

