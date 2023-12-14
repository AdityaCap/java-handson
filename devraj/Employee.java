package na.devraj;
import java.util.*;
import java.util.ArrayList;
import java.util.stream.Collectors;


public class Employee {
    public Employee(int id,String name){
        this.id=id;
        this.name=name;
    }
    private int id;
    private String name;

    public int getId(){
        return id;
    }
    public String getName(){

        return name;
    }
    @Override
    public String toString(){
        return "id ="+ id +" name="+name;
    }

    public static void main(String[] args) {
        List<Employee>e=new ArrayList<Employee>();
        e.add(new Employee(1,"Aditya"));
        e.add(new Employee(1,"Bala"));
        e.add(new Employee(2,"Devraj"));
        e.add(new Employee(3,"Ankit"));
        //Map<Integer,List<String>>m=new HashMap<>();
        Map<Integer, List<String>> m =
                e.stream()
                .collect(Collectors.groupingBy(Employee::getId,
                Collectors.mapping(Employee::getName,
                Collectors.toList())));
        String s="";
        String c="";
        if(s.equals("YEA"))
        //String q ="eff:few:ee";

        System.out.println(m);



    }
}
