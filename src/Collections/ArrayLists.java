package Collections;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists {
    public static void main(String[] args) {
        // Declaration of an ArrayList
        ArrayList<Integer> list = new ArrayList<>();

        // add elements in arraylist
        list.add(1);
        list.add(3);
        list.add(2);
        list.add(5);

        System.out.println(list);

        // get elements from arraylist
        int element = list.get(3);
        System.out.println(element);

        // Add Element at a specific Index
        list.add(2, 8);
        System.out.println(list);

        // Set Element at a specific Index
        list.set(0, 6);
        System.out.println(list);

        // delete or remove elements from arraylist
        list.remove(1);
        System.out.println(list);

        // size of arraylist
        int size = list.size();
        System.out.println(size);

        // loops over arraylist
        for (int i=0; i<list.size(); i++) {
            System.out.print(list.get(i));
        }
        System.out.println();

        // sorting
        Collections.sort(list);
        System.out.println(list);
    }
}
