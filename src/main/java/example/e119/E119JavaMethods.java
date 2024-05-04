package org.example.e119;
/*
Write a method header with the following specs:
Returns:
a String
Name:
censorLetter
Parameters:
a String
a char
Then complete the method by programming the following behavior
Replace all instances of given character with a "*" within the given String.
See below examples.

```
Examples:
censorLetter("computer science",'e') ==> "comput*r sci*nc*"
censorLetter("trick or treat",'t') ==> "*rick or *rea*"
 */
class E119{
    String str;
    char c;
    String censorLetter(String str, char c){
       String newString= str.replace(c,'*');

        return newString;
    }
}
public class E119JavaMethods {
    public static void main(String[] args) {
E119 obj1=new E119();
String result1=obj1.censorLetter("computer science",'e');
        System.out.println(result1);

        E119 obj2=new E119();
        String result2=obj2.censorLetter("trick or treat",'t');
        System.out.println(result2);
    }

}
