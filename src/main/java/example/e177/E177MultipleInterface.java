package org.example.e177;
/*
Create two interfaces

1. iOutputs - which has un-implemented method  display(double myResult)
2. iFunctions  - which has un-implemented method
   double adding(double firstNumber , double secondNumber);
   double subtracting(double firstNumber , double secondNumber);
   double multiply(double firstNumber , double secondNumber);
   double dividing(double firstNumber , double secondNumber);

   and also iFunctions inherits iOutputs


Now, write a class which will implement  the iFunctions and print the below output

Note : display () method is utilized to print the result

**Output:**

```
Result is ::: 120.0
Result is ::: 80.0
Result is ::: 2000.0
Result is ::: 5.0
 */
interface iOutputs{
    void display();
}
interface iFunctions extends iOutputs {


    double adding(double firstNumber , double secondNumber);
    double subtracting(double firstNumber , double secondNumber);
    double multiply(double firstNumber , double secondNumber);
    double dividing(double firstNumber , double secondNumber);

}
class Child implements iFunctions {
    double add;
    double multiply;
    double subtract;
    double divide;

    public double adding(double firstNumber , double secondNumber){
        return add=firstNumber+secondNumber;

    }
    public double subtracting(double firstNumber , double secondNumber){
       return subtract=firstNumber-secondNumber;

    }

    public double multiply(double firstNumber , double secondNumber){
        return multiply=firstNumber*secondNumber;

    }
    public double dividing(double firstNumber , double secondNumber){
       return divide=firstNumber/secondNumber;

    }
    public void display(){
        System.out.println("Result is ::: "+add);
        System.out.println("Result is ::: "+subtract);
        System.out.println("Result is ::: "+multiply);
        System.out.println("Result is ::: "+divide);

    }

}

public class E177MultipleInterface {

    public static void main(String[] args){
Child obj=new Child();
obj.adding(60.0,60.0);
obj.subtracting(160.0,80.0);
obj.multiply(20.0,100.0);
        obj.dividing(20.0,4.0);
        obj.display();
    }
}
