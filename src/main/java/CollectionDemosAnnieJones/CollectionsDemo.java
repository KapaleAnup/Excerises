package CollectionDemosAnnieJones;

import org.testng.annotations.Test;

import java.util.*;

public class CollectionsDemo {

   // @AssignmentOne
    public static void setDemo(){

        Set<String> fruit = new HashSet();
        fruit.add("Apple");
        fruit.add("Bannana");
        fruit.add("lemon");
        fruit.add("ornage");
        fruit.add("lemon");

//        System.out.println(fruit.size());
//        System.out.println(fruit);


        //set is unordered list

//        Iterator iterator = fruit.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }

//        for (String item:fruit
//             ) {
//            System.out.println(item);
//        }

        fruit.forEach(x -> System.out.println(x));

        fruit.forEach(e -> System.out.println(e));

    }


    @Test
    public void maps(){

        Map<String, Integer> fruitcalaries = new HashMap<>();
        fruitcalaries.put("apple",95);
        fruitcalaries.put("lemon",20);
        fruitcalaries.put("bannana",105);
        fruitcalaries.put("orange",45);
        fruitcalaries.put("lemon",17);


        System.out.println(fruitcalaries.size());
        System.out.println(fruitcalaries);
        System.out.println(fruitcalaries.get("lemon"));
        System.out.println(fruitcalaries.entrySet());
//        System.out.println(fruitcalaries.remove("orange"));
//        System.out.println(fruitcalaries);


        for (Map.Entry<String, Integer> entry: fruitcalaries.entrySet()
             ) {
            System.out.print("key = "+entry.getKey()+" ");
            System.out.print("value = "+entry.getValue()+" ,");

//            System.out.println("hash codes are : "+entry.hashCode());
        }
    }



}
