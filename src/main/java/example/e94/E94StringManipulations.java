package org.example.e94;
/*
- Create a String given="I love Java classes at Syntax"
- Retrieve 2 Strings using substring method from given String and print them

**Expected Output:**

```
classes at Syntax
```

```
I love Java
```
 */
public class E94StringManipulations {
    public static void main(String[] args) {
        String given = "I love Java classes at Syntax";
        System.out.println(given.substring(12,given.length()));
        System.out.println(given.substring(0,11));


    }
}
