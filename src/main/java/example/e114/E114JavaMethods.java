package org.example.e114;
/*
Step1: Create three methods that will accept 2 in parameters on integer type
Step2: Write the logic in methods to perform actions below:
The first method for multiplication
The second method for addition
The third method for subtraction
Step3: execute all methods
for the addition method add two numbers to make 30
for multiplication multiply two numbers to make 30
for Subtraction subtract two numbers to equal 20

**Output:**

```
Addition 30
Multiplication 30
Subtraction 20
 */
class E114{
    int num1;
    int num2;

    int addition(int num1,int num2){
        int sum=num1+num2;
        return sum;
    }
    int multiplication(int num1,int num2){
        int product=num1*num2;
        return product;
    }
    int subtraction(int num1,int num2){
        int difference=num1-num2;
        return difference;
    }

}
public class E114JavaMethods {
    public static void main(String[] args) {
        E114 obj1=new E114();
        int result1=obj1.addition(15,15);
        System.out.println("Addition "+result1+" ");

        E114 obj2=new E114();
        int result2=obj2.multiplication(6,5);
        System.out.println("Multiplication "+result2+" ");

        E114 obj3=new E114();
        int result3=obj3.subtraction(30,10);
        System.out.println("Subtraction "+result3+" ");



    }
}
