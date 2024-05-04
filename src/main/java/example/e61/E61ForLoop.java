package org.example.e61;

public class E61ForLoop {
    /*
    Write a program that uses for loop to prints multiplication of number 3 from 1 to 10

**Output:**

```
3*1=3
...
     */
    public static void main(String[] args) {
        for(int i=1;i<11;i++){
            int num=3*i;
            System.out.println("3*"+i+"="+num);
        }

    }
}
