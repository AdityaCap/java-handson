package na.devraj;
import java.util.List;
public class missing {
    public static void main(String[] args) {
        List<Integer>l=List.of(1,2,3,4,5,6,8,9,10);
        int s=l.size();
        int n=s+1;
        int sum=n*(n+1)/2;
        for(int i:l){
            sum-=i;
                    }
        System.out.println(sum);

    }
}
