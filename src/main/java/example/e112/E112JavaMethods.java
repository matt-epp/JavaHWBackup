package org.example.e112;
/*
Create a method in which you will be printing numbers from 1 to 10
Call the method in the main method

**Output:**

```
1
2
3
4
5
6
7
8
9
10
```
 */
class E112{
    void printNumbers(){
        for (int i = 1; i <11 ; i++) {
            System.out.println(i);

        }
    }

        }
public class E112JavaMethods {
    public static void main(String[] args) {
        E112 obj1=new E112();
        obj1.printNumbers();

    }
}
