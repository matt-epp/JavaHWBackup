package org.example.e164;

import java.io.File;

/*
Create a method hello() in parent class that will print "method in Parent class" then override that method is 3 Subclasses
implementing login to print "method in Child1/Child2/Child3 class"

In Main Class create 3 object of the child classes and store in into an array and call method hello():


**Output:**

```
method in Child1 class
method in Child2 class
method in Child3 class
```
 */
class Parent{
    void hello(){
        System.out.println("method in Parent class");
    }
}
class Child1 extends Parent{
    void hello(){
        System.out.println("method in Child1 class");
    }

}
class Child2 extends Parent{
    void hello(){
        System.out.println("method in Child2 class");
    }

}
class Child3 extends Parent {
    void hello() {
        System.out.println("method in Child3 class");
    }
}
public class E164MethodOverriding {
    public static void main(String[] args) {

        Parent [] arr={new Child1(),new Child2(),new Child3()};
        for (int i=0;i<arr.length;i++){
            Parent f=arr[i];
            f.hello();

        }
    }

}



