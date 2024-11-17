/*Colllection framework=> Provides pre-built data structures (like ArrayList, HashSet, etc.).
Reduces the effort of writing complex data structure logic manually. */

//There are three primary types of collection interfaces: List , Set , and Map

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

class MyArrayList {
    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();// Declaration
        list.add(1);// for adding elements
        list.add(21);
        list.add(4);
        System.out.println(list);
        int element = list.get(0);// for accessing element by index
        System.out.println(element);
        list.add(1, 3);// adding element at any index
        list.add(4, 20);
        System.out.println(list);
        list.set(4, 21);// replacing element
        System.out.println(list);
        list.remove(0);// deleting element
        System.out.println(list);
        System.out.println(list.size());// length of arraylist
        // Collections.sort(list);
        System.out.println(list);

        // Adding 2 list
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(25);
        list2.add(91);
        System.out.println(list2);
        list.addAll(list2);// adding list of same type with other
        System.out.println(list);
        System.out.println(list2);
        list.remove(Integer.valueOf(21));// deleting elements
        System.out.println(list);
        System.out.println(list2);

        // Removing all elements from list
        list2.clear();
        System.out.println(list2);
        System.out.println(list.contains(18));// check whether value is present or not

        // Accessing ways of each element of list
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
        }
        for (Integer elemen : list)
            System.out.print("For each element is:" + elemen);

        // using iterator
        Iterator<Integer> it = list.iterator();
        while (it.hasNext())
            System.out.println(it.next());

    }
}
