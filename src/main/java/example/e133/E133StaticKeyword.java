package org.example.e133;
/*
Returns:

```
an integer
```

Name:

```
countA
```

Parameters:

```
a String called s
```

Purpose:

```
count the number of occurrences of 'a' or 'A' within s
```

Examples:

```
countA("aaa") ==> 3
```

```
countA("aaBBdf8k3AAadnklA") ==> 6
```

Hint: How do you write a for loop to loop through every letter of a string?  You've done this multiple time
 */
public class E133StaticKeyword {

    String s;

    static int countA(String s){
       // String []arr=s.split("[.]");
        int count=0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) =='a' || s.charAt(i)=='A'){
                count++;

            }
        }return count;


    }
    public static void main(String[] args) {

        int result1 =countA("aaa");
        System.out.println(result1);
        int result2 =countA("aaBBdf8k3AAadnklA");
        System.out.println(result2);
    }
}

