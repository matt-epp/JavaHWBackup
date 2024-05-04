package org.example.e136;
/*
In each method write the logic accordingly like for private method write the logic in the println Statement as
"This is Private Method" accordingly for rest of the methods that have different access modifiers should
be a total of 4 outputs, please make sure they are in the same order that is printed below.

**Expected Output:**

```
This is Private Method
```

```
This is Default Method
```

```
This is Protected Method
```

```
This is Public Method
 */
public class E136AccessModifiers {

   static private void privateMethod(){
        System.out.println("This is Private Method");

    }
   static void defaultMethod(){
        System.out.println("This is Default Method");
    }
    static protected void protectedMethod(){
        System.out.println("This is Protected Method");
    }
    static public void publicMethod (){
        System.out.println("This is Public Method");

    }


    public static void main(String[] args) {
       privateMethod();
       defaultMethod();
       protectedMethod();
       publicMethod();

    }
}


