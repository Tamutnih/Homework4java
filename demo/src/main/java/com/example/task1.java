
// 1. Пусть дан LinkedList с несколькими элементами. 
// Реализуйте метод, который вернет “перевернутый” список.
package com.example;

import java.util.LinkedList;
import java.util.*;

public class task1 {
    public static void main(String[] args) {

        LinkedList<Integer> linkedli = new LinkedList<Integer>();

        linkedli.add((1));
        linkedli.add((2));
        linkedli.add((3));
        linkedli.add((4));
        linkedli.add((5));
        System.out.print("Elements before reversing: " + linkedli);

        Collections.reverse(linkedli);

        System.out.print(" Elements after reversing: " + linkedli);
    }
}
