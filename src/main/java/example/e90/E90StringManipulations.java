package org.example.e90;
/*
Create a String named s1 = "hello"  check weather string is empty or not

Create a String named s2 = ""  check weather string is empty or not

**Expected Output:**

```
false
```

```
true
 */
public class E90StringManipulations {
    public static void main(String[] args) {
        String s1=new String("Hello");
        String s2=new String("");
        System.out.println(s1.isEmpty());
        System.out.println(s2.isEmpty());


    }
}
