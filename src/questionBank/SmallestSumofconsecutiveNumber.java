package questionBank;

public class SmallestSumofconsecutiveNumber {
	public static void main(String[] args) {
		int minsum=Integer.MAX_VALUE;
		int arr[]= {1,2,4,5,6,74,45};
		for(int i=0;i<arr.length;i++) {
			int currentsum=0;
			for(int j=i;j<arr.length;j++) {
				currentsum+=arr[j];
			}
			if( currentsum<minsum) {
				minsum=currentsum;
			}
		}
		System.out.println("min sum is"+minsum);
	}

}
