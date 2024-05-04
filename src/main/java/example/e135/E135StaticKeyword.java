package org.example.e135;

import org.example.e132.E132StaticKeyword;

/*
Returns:

```
a String
```

Name:

```
surround
```

Parameters:

```
a String called s
```

```
a String called search_term
```

Then complete the method by programming the following behavior

```
Return a new String built from s that has every instance of the search term surrounded by parentheses
See below examples.
```

Examples:

```
surround("abcabcabc",'c') ==> "ab(c)ab(c)ab(c)"
surround("technology",'o') ==> "techn(o)l(o)gy"
 */
public class E135StaticKeyword {

    public String surround (String s, String search_term){
        String builtFromS=s.replaceAll(search_term,search_term);
        System.out.println(builtFromS);
            return builtFromS;
    }

    public static void main(String[] args) {
        E135StaticKeyword testSurround=new E135StaticKeyword();
        testSurround.surround("abcabcabc","(c)");
        testSurround.surround("technology","(o)");
    }

}
/*
    String s;
     String search_term;
     String result;

     String surround(String s, char search_term) {


        for (int i = 0; i < s.length(); i++) {


        int index = s.indexOf(search_term);

       StringBuilder str = new StringBuilder(s);
    str.insert(index, "(").insert(index+2,")");
          System.out.println(str);
        }

            // for (int i = 0; i < str.length(); i++) {
            //      if(str.charAt(i)==(t)){
            //     System.out.print("("+t+")");

            //  }else{
            //      System.out.println(i);
            //  }




    public static void main(String[] args) {
        E135StaticKeyword obj1= new E135StaticKeyword();
      E135StaticKeyword.surround("abcabcabc",'c');
        System.out.println();
    }
    }
*/
