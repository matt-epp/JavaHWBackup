package org.example.e131;
/*
Returns:

```
a String
```

Name:

```
thirdLetter
```

Parameters:

```
a String called s
```

Then complete the method by programming the following behavior

```
Returns every 3rd letter of the String s,
```

```
starting from the first letter.
See below examples.
```

Examples:

```
thirdLetter("hello there") ==> "hltr"
thirdLetter("technology") ==> "thly"
 */
public class E131StaticKeyword {

    static String s;
   // String []arr;

    static void thirdLetter(String s){
       // String []arr=s.split("[.]");

        for (int i = 0; i < s.length(); i+=3) {

                System.out.print(s.charAt(i));

           // }else{
            //    System.out.println();
            }System.out.println();

        }





    public static void main(String[] args) {
thirdLetter("hello there");
thirdLetter("technology");

    }
}
