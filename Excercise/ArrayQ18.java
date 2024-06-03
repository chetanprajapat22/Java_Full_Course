package in.co.Excercise;

public class ArrayQ18 {
    //q.18
    public static int search(int arr[],int key) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==key) {
			int pos = arr[key];
			System.out.println("Key will be found at index of : "+pos);
			return pos;
			}
		}
		return -1;
	}

    public static void main(String[] args) {
        int arr[] = {10,9,8,7,6,5,4,3,2,1};
		int key = 1;
		int index = search(arr,key);
		if(index==-1) {
			System.out.println("Not found");
		}
    }
}
