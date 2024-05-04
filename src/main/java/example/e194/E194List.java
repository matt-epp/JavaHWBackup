package org.example.e194;
/*
For you to do:

Create a method that takes a list as a paramter removes an element if it starts with letter
A from given List and return new List then in the main method print that list.

**Output:**

```
[USA, Kazakhstan, Pakistan, Russia]
 */


import java.util.ArrayList;
import java.util.List;

public class E194List {

    List removeLetter(List<String> letter){
        /*
        for (int i = 0; i < letter.size(); i++) {
            if (letter.get(i).startsWith("A"));
            letter.remove(i);
            i++;


        }  */
       letter.removeIf(x->x.startsWith("A"));
       return letter;

    }
    public static void main(String[] args) {
        List <String> letter=new ArrayList<>();
        letter.add("America");
        letter.add("USA");
        letter.add("Kazakhstan");
        letter.add("Pakistan");
        letter.add("Russia");


  E194List obj = new E194List();
  obj.removeLetter(letter);
        System.out.println(letter);
    }
}
