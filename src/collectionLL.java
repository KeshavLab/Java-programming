// Linked List using Collection framework

import java.util.*;
public class collectionLL {
    public static void main(String[] args){
        //Initialize  the linkedlist using ollection framework
        LinkedList<String> list= new LinkedList<>();
        list.addFirst("a");
        list.addFirst("is");
        System.out.println(list);
        list.addFirst("This");
        list.addLast("list");
        System.out.println(list);
        System.out.println(list.size());

        // traverse the list
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" "+"->");
        }
        System.out.println("null");

        list.removeFirst();
        System.out.println(list);

        list.remove(2);
        System.out.println(list);


    }
}
