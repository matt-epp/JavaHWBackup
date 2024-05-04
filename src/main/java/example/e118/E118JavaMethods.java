package org.example.e118;

/*
Write a method header on line two with the following specs:
Returns:
a String
Name:
spaceOut
Parameters:
a String
Then complete the method by programming the following behavior
Insert spaces after every character in the String s, then return the new string.
See below examples (note the space at the end as well).

```
Examples:
spaceOut("hello") ==> "h e l l o "
spaceOut("technology") ==> "t e c h n o l o g y "
 */






      /*  StringBuffer result;
        StringBuffer newString= new StringBuffer(str);
        for (int i = 0; i < newString.length(); i++)
          result = newString.append(i).append(" ");
           // newString= str.substring(i) + " " + str.charAt(i);
        return newString.toString();
*/


/*

class E118 {
    String s;
    StringBuffer [] splittedSub;
    void spaceOut(String s) {
       StringBuffer [] splittedSub;
splittedSub=s.split("[. ]");
      //  StringBuffer newString = s;
        for (int i = 0; i < splittedSub.length - 1; i++) {
            StringBuffer newString=(splittedSub[i]+" ");
            System.out.println(newString);
            // StringBuffer newString= s.replace(i, );

      //  s = newString.charAt(i).append(" ").toString();

        }


    }

}
*/
public class E118JavaMethods {
    void spaceOut(String str) {
        StringBuilder sb = new StringBuilder(str);
        for (int i = 1; i < sb.length(); i += 2)
            sb.insert(i, ' ');
        System.out.println(sb);

    }

    public static void main(String[] args) {
        E118JavaMethods obj1 = new E118JavaMethods();
        obj1.spaceOut("hello");
        obj1.spaceOut("technology");
    }




}


