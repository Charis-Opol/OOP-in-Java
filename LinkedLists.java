import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedLists {
    public static void main(String[] args) {
        LinkedList<String> testLinkedlist = new LinkedList<String>();

        testLinkedlist.add("Exercise 1");
        testLinkedlist.add("Exercise 2");
        testLinkedlist.add("Exercise 3");
        testLinkedlist.add("Exercise 4");
        testLinkedlist.add("Exercise 5");

        System.out.println(testLinkedlist);

        testLinkedlist.remove("Exercise 1");
        System.out.println(testLinkedlist);

        testLinkedlist.remove(0);
        System.out.println(testLinkedlist);

        LinkedList<String> employeesNames = new LinkedList<String>();
        employeesNames.add("John");
        employeesNames.add("Jane");
        employeesNames.add("Doe");
        employeesNames.add("Smith");
        employeesNames.add("Emily");
        employeesNames.add("Anna");
        ListIterator<String> iterator = employeesNames.listIterator();

        // Iterating through the new list
        System.out.println("The list iterator is as follows: ");
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        for (String name : employeesNames){
            System.out.println(name);   
        }

    }
}
