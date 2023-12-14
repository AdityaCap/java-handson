package na.devraj;

public class secondHighest {
    public static void main(String[] args) {
        int []a={2,3,5,6,3,3,3,2,3,5,0};
        sort(a);
        int size=a.length;
        System.out.println("Second Highest =" + a[size -2]);
    }
    static void sort(int []a){
        int n=a.length;
        int temp=0;
        for(int i=0; i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(a[j]>a[j+1]){
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
}
