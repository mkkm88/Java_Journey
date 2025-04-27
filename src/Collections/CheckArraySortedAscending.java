package Collections;
import java.util.ArrayList;
import java.util.Scanner;

public class CheckArraySortedAscending {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // create an arrayList
        ArrayList<Integer> numbers = new ArrayList<>();

        // ask for size
        System.out.print(STR. "Enter the number of elements : ");
        int size = sc.nextInt();

        // take input elements
        for (int i=0; i<size; i++) {
            System.out.print(STR. "Enter element \{i+1} : ");
            numbers.add(i, sc.nextInt());
        }

        System.out.println(numbers);
        // check id arrayList is sorted
        boolean isSorted = true;
        for (int i=0; i<numbers.size()-1; i++) {
            if (numbers.get(i) > numbers.get(i+1)) {
                isSorted = false;
                break;
            }
        }

        if (isSorted) {
            System.out.println(STR. "The arrayList is sorted in ascending order");
        } else {
            System.out.println(STR. "The arrayList is not sorted in ascending order");
        }
    }
}
