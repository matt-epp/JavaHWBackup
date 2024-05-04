package org.example.e140;
/*
Create the maxLength method that will accept String array of words and return the word with the largest length.

Method should visible only within same package!

**Output:**

```
this is long
 */
public class E140AccessModifiers {
    String[] arr;
    String max;

     String maxLength(String[] arr) {

        String max = "max";
        for (int i = 1; i < arr.length; i++) {
            if (arr[i].length() > (arr[i - 1].length()) && arr[i].length() > max.length()) {
                max = arr[i];

            } else {
                max = (arr[i - 1]);
            }
        }
        return max;

    }

    public static void main(String[] args) {
        String[] arr = {"hello", "this is long", "goodbye"};
        E140AccessModifiers obj1=new E140AccessModifiers();
        String result1 = obj1.maxLength(arr);
        System.out.println(result1);
    }
}



