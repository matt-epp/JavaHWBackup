package org.example.e116;
/*
Create a method that will accept 2 numbers as parameters and return true if both numbers are even otherwise returned false
( Return false if one or both given numbers are not even)
Examples:
bothEven(4,6) ==> true
bothEven(3,4) ==> false
bothEven(-1,1) ==> false

**Output:**

```
false
 */
class E116{
    int num1;
    int num2;

    boolean isNumEvenOdd(int num1,int num2){
     boolean evenNum=true;
     if(num1%2!=0 || num2%2!=0)evenNum=false;

        return evenNum;

    }
}
public class E116JavaMethods {
    public static void main(String[] args) {
        E116 obj1= new E116();
       boolean result= obj1.isNumEvenOdd(-1,1);
        System.out.println(result);


    }
}


