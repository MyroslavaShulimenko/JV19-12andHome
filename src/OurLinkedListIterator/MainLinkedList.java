package OurLinkedListIterator;

public class MainLinkedList {
    public static void main(String[] args) {

        OurLinkedList<Integer> list = new OurLinkedList<>();
        list.append(5);
       // System.out.println(list.get(0));
       // System.out.println(list.size());
        list.append(15);
        list.append(2);
        list.append(10);
        list.append(117);
        list.append(20);
        list.append(30);

       // list.iterator().remove(); Итератор — это поведенческий паттерн проектирования, который даёт возможность последовательно обходить элементы составных объектов, не раскрывая их внутреннего представления.!!!!????
        for (Integer el: list){
            System.out.println(el);
        }


        }
//        OurList<String> strList = new OurLinkedList<>();


//        strList.append("aaa");
//        System.out.println(strList.get(0));
//        System.out.println(strList.containts("aaa"));
//        System.out.println(strList.containts("bbb"));
//
//        System.out.print("[");
//        for (int i = 0; i < list.size(); i++) {
//            System.out.print(list.get(i) + " ");
//        }
//        System.out.println("]");
//        System.out.println("-".repeat(50));
//        list.removeByiD(3);
//        System.out.print("[");
//        for (int i = 0; i < list.size(); i++) {
//            System.out.print(list.get(i) + " ");
//        }
//        System.out.println("]");
//        System.out.println("-".repeat(50));
//        list.removeByiD(0);
//        System.out.print("[");
//        for (int i = 0; i < list.size(); i++) {
//            System.out.print(list.get(i) + " ");
//        }
//        System.out.println("]");
//        System.out.println("-".repeat(50));
//        list.remove(117);
//        System.out.print("[");
//        for (int i = 0; i < list.size(); i++) {
//            System.out.print(list.get(i) + " ");
//        }
//        System.out.println("]");
//
//        System.out.println("-".repeat(50));
//        System.out.println(list.containts(15));
//        System.out.println(list.containts(115));


    }



