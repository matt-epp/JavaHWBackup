package org.example.e138;
/*
In AnotherClass declare a private, default, protected, public methods and have them each return the name of
the what access modifier they are using.

All methods should be accessible by class name

Call methods of Another class inside Main class

**Expected Output:**

```
default
```

```
protected
```

```
public
 */
public class E138AccessModifiers {

       static private void privateMethod(){
              System.out.println("This is Private Method");

       }
       static void defaultMethod(){
              System.out.println("default");
       }
       static protected void protectedMethod(){
              System.out.println("protected");
       }
       static public void publicMethod (){
              System.out.println("public");

       }

       public static void main(String[] args) {
             // privateMethod();
              defaultMethod();
              protectedMethod();
              publicMethod();
       }
}
