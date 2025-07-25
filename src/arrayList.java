//| Method                              | Description                                           |
//| ----------------------------------- | ----------------------------------------------------- |
//| `add(E e)`                          | Adds an element                                       |
//| `addAll(Collection<? extends E> c)` | Adds all elements from another collection             |
//| `remove(Object o)`                  | Removes a specific element                            |
//| `removeAll(Collection<?> c)`        | Removes all matching elements from another collection |
//| `clear()`                           | Removes all elements                                  |
//| `contains(Object o)`                | Checks if element exists                              |
//| `containsAll(Collection<?> c)`      | Checks if all elements from another collection exist  |
//| `isEmpty()`                         | Checks if the collection is empty                     |
//| `size()`                            | Returns number of elements                            |
//| `iterator()`                        | Returns an iterator for looping                       |
//| `toArray()`                         | Converts collection to array                          |
import java.util.*;
public class arrayList {
    public static void main(String[] args){
        Collection<String> names = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();

        names.add("Java");
        names.add("Python");
        names.add("C++");

        System.out.println("Size: " + names.size());             // 3
        System.out.println("Contains Python? " + names.contains("Python"));  // true

        names.remove("C++");
        System.out.println("After removing: " + names);         // [Java, Python]

        names.clear();
        System.out.println("Is empty? " + names.isEmpty());     // true


        // add element
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);

        // Get element
        int element =list.get(0);
        System.out.println(element);

        // add element in between
        list.add(1,6);
        System.out.println(list);

        // set element
        list.set(0,5);
        System.out.println(list);
    }
}
