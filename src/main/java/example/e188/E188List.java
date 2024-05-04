package org.example.e188;

import java.util.ArrayList;
import java.util.Scanner;

/*
Using Scanner class add 5 elements into ArrayList and then print all elements from that ArrayList
 all in 1 line

Numbers in:

4
62
8
5
4
**Output:**

```
4 62 8 5 4
 */
public class E188List {
    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);
        ArrayList<String> numbersIn=new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            numbersIn.add(scan.nextLine());
        }
        numbersIn.forEach(x-> System.out.print(x+" "));

}
}

