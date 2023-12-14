//package na.devraj;
//import java.util.*;
//public class PrimeSquare {
//    public static void main(String[] args) {
//        List<Integer>l=List.of(3,4,632,5,2,3,5,6);
//        l.stream()
//                .filter(PrimeSquare::isPrime)
//                .map(i-> i*i)
//                .forEach(System.out::println);
//    }
//    public static boolean isPrime(int x){
//        if(x<2){
//            return false;
//        }
//        for(int i=2;i<Math.sqrt(i);i++){
//            if(x%i==0){
//                return false;
//            }
//
//        }
//        return true;
//
//    }
//}
//

