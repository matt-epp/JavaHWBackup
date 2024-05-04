package org.example.e117;

/*
Create a method with the following specs:
Returns:
an integer
Name:
sumEvenToX
Parameters:
an integer called "x"
Purpose:
calculate the sum of the EVEN integers from 1 to x (including x)

```
Examples:
sumEvenToX(5) ==> 6
sumEvenToX(8) ==> 20
 */
class E117 {
    int x;

    int sumEvenToX(int x) {
        int sumEven = 0;
        for (int i = 1; i <= x; i++) {
            if (i % 2 == 0) {
                sumEven = sumEven + i;

            }

        }

        return sumEven;
    }
}

public class E117JavaMethods {
    public static void main(String[] args) {

        E117 obj1=new E117();
        int result1=obj1.sumEvenToX(5);
        System.out.println(result1);

        E117 obj2=new E117();
        int result2=obj2.sumEvenToX(8);
        System.out.println(result2);
    }

}
