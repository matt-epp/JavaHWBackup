package org.example.e126;
/*
Create a variable that will hold the count of all instances of the Main class

Create 3 Object of the class and print value of the count variable;
**Output:**

```
3
 */
public class E126Variables {

    static int count;

void objectCount(){
    count++;
}
    public static void main(String[] args) {
        E126Variables obj1=new E126Variables();
        obj1.objectCount();

        E126Variables obj2=new E126Variables();
        obj2.objectCount();

        E126Variables obj3=new E126Variables();
        obj3.objectCount();

        System.out.println(count);





    }

}
