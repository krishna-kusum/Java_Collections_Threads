package com.prowessSoft.CollectionsFramework;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;

public class CollectionFrameworkTask4 {

    public static void main(String[] args){
        Queue<Integer> arrayDeque = new ArrayDeque<Integer>();

//        inserting 6 integers
        for(int i = 12; i>0; i-=2){
            arrayDeque.add(i);
        }

        Iterator<Integer> itr = arrayDeque.iterator();

        System.out.println("arrayDeque size "+arrayDeque.size());
        System.out.println("The arrayDeque contains elements: ");
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println("=======================");

//        removing integers
        int i = 2;
        System.out.println("Removing elements :");
        while (i>0){
            System.out.println(arrayDeque.peek());
            arrayDeque.poll();
            i--;
        }
        System.out.println("=======================");

        itr = arrayDeque.iterator();
        System.out.println("arrayDeque size "+arrayDeque.size());
        System.out.println("The arrayDeque elements left : ");
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println("=======================");
    }
}
