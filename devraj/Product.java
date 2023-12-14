package na.devraj;

import java.util.*;
import java.util.stream.Collectors;

public class Product {
    public Product(int id,String name){
        this.id=id;
        this.name=name;
    }
    private int id;
    private String name;

    public Product() {

    }

    @Override
    public String toString() {
        return id+ " "+ name;
    }

    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name) throws NameNotValidException{
        if(name.isBlank() || name== null){
            throw new NameNotValidException("Emter a valid name");
        }
        else{
            this.name=name;
        }
    }



    class NameNotValidException extends Exception{
         NameNotValidException(String message) {
             super(message);
         }

    }

    public static void main(String[] args)  throws NameNotValidException{
        List<Product> productList=new ArrayList<>();
        Product p1=new Product(1,"chips");
        Product p2=new Product(2,"oreo");
        Product p3=new Product(3,"sandwich");
        Product p4=new Product(4,"cool lip");
        Product p5=new Product(5,"munch");
        Product p6=new Product();
        p6.setName("");
        System.out.println(p6);


        //Sorted List via Name
        List<Product>sort=new ArrayList<>();
        sort=productList.stream()
                .sorted(Comparator.comparing(Product::getName).reversed())
                        .collect(Collectors.toList());
        System.out.println(sort);


        //filter list Starting with s
        List<Product>f=productList.stream()
                .filter(p->p.getName().startsWith("s")|| p.getName().startsWith("S"))
                .collect(Collectors.toList());
        System.out.println(f);








    }


}
