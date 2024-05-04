package org.example.e190;

import java.util.LinkedList;
import java.util.List;

/*
Create Linked List that will store first 10 numbers of fibonacci series

Print number from Linked List 1 by 1 all in 1 line

**Output:**

```
0 1 1 2 3 5 8 13 21 34
 */
public class E190List {
    public static void main(String[] args){

        List<Integer> fib=new LinkedList<>();

            fib.add(0,0);
            fib.add(1,1);
            for(int i = 2; i < 10; i++)
               fib.add(fib.get(i-1) + fib.get(i-2)) ;
            for(int i : fib)
                System.out.print(i + " ");


    }

}
