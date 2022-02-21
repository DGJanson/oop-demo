package nl.acm.datahub.oopdemo.list;

import java.util.List;

/**
 * This class shows how polymorphism can be used to make writing code easier
 * Instead of writing a printer for both an ArrayList and a LinkedList, we only write one for the parent class: List
 * Note that we specifically use a List of Integers here. We could generalize this even further, but that is a bit
 *   too complicated right now. If you are interested google "generics" in java (or other languages)
 */
public class ListPrinter {

    public static void printListStatic (List<Integer> listToPrint) {
        System.out.println("Printing list:");
        for (Integer itp : listToPrint) {
            System.out.println(itp);
        }
    }

    public void printList (List<Integer> listToPrint) {
        System.out.println("Printing list:");
        for (Integer itp : listToPrint) {
            System.out.println(itp);
        }
    }
}
