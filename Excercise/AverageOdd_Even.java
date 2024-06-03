package in.co.Excercise;

public class AverageOdd_Even {
    public static void main(String[] args) {
        int n=100;
		int count=0;
		int average=0;
		for(int i=1;i<=n;i++) {
			if(i%2==0){
				count+=1;
//				System.out.println(i+ " : is a even number");
			}else {
				average+=1;
//				System.out.println(i+" : is a odd number");
			}
		}
		System.out.println(count);
		System.out.println(average);
    }
}
