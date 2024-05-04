package org.example.e134;
/*
Returns:

```
an integer
```

Name:

```
countVowels
```

Parameters:

```
a String called s
```

Purpose:

```
count the number of vowels in the string s.  Assume s is all lowercase.
```

Examples:

```
countVowels("obama") ==> 3
countVowels("happy friday! i love weekends") ==> 9


 */
public class E134StaticKeyword {

    int num1;
    String s;

   static int countVowels(String s){
      //  s.replaceAll("[^aeiou]","");
      //  int count=s.length();
        //for (int i = 0; i <s.length()-1 ; i++) {
       int count=0;
       for (int i = 0; i <s.length() ; i++) {
           if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
               count++;
           }



       }


        return count;

        }

    public static void main(String[] args) {

        int result1=countVowels("obama");
        int result2=countVowels("happy friday! i love weekends");
        System.out.println(result1);
        System.out.println(result2);

    }


}



