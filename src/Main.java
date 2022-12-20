import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
      /*  List<String>testing=new ArrayList<>();
        testing.add("A");
        testing.add("B");
        testing.add("C");
        testing.add("D");
        testing.add("E");
        for (String el:testing){
            System.out.println(el);
        }
        System.out.println("--------------------------");
        for (int i = 0; i < testing.size() ; i++) {
            System.out.print(testing.get(i));

        }
        System.out.println("--------------------------");
        Iterator<String>it=testing.iterator();
        while (it.hasNext()){
            String el=it.next();
            System.out.println(el);
        }
        System.out.println("--------------------------");*/

        List<Integer> integerList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            integerList.add(i);
        }
        integerList.stream().forEach(System.out::print);
        for (Integer el : integerList) {
            System.out.println(el);
        }
   /*     for (Integer el:integerList) {
            if (el%2 !=0){
            integerList.remove(el);}
        }
   */
    /*    for (int i = 0; i <integerList.size() ; i++) {
            if (integerList.get(i)%2!=0){
                integerList.remove(integerList.get(i));
            }
        }


        System.out.println("--------------------------");
        for (Integer el : integerList) {
            System.out.println(el);
        }*/
        System.out.println("--------------------------");
        Iterator<Integer> it = integerList.iterator();
        while (it.hasNext()) {
            int el = it.next();
            if (el % 2 != 0) {
                it.remove();
            }
        }
        for (Integer el : integerList) {
            System.out.println(el);
        }
        System.out.println("--------------------------");

    }
}