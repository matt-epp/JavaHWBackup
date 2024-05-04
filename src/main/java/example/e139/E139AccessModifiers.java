package org.example.e139;

/*
reate a method that will be available to all classes in your project with following specifications:

Returns:

```
a String
```

Name:

```
alphabetical
```

Parameters:

```
a String called str
```

Purpose:

```
Return a string that is composed of each letter as long as the letter is later on in the alphabet
```

```
than its previous one.  You can assume actual parameters are lowercase.
See below examples.
```

Additional Info:

You can use < and > to compare characters (not Strings), where characters later on in the alphabet are "greater".  Examples:

```
'a' < 'b' ==> True
```

```
'a' < 'a' ==> False
```

```
'a' > 'b' ==> False
```

Examples:

```
alphabetical("hello") ==> "hlo"
```

```
alphabetical("software") ==> "stwr"
```

```
alphabetical("language") ==> "lnug"
```

**Expected Output:**

```
hlo
stwr
lnug
 */
public class E139AccessModifiers {

    void alphabetical(String str) {
        System.out.print(str.charAt(0));
        int count = 0;
        int count2 = 0;
        for (int i = 1; i < str.length() ; i++) {
            switch (str.charAt(i)) {
                case 'a':
                    count = 1;
                    break;
                case 'b':
                    count = 2;
                    break;
                case 'c':
                    count = 3;
                    break;
                case 'd':
                    count = 4;
                    break;
                case 'e':
                    count = 5;
                    break;
                case 'f':
                    count = 6;
                    break;
                case 'g':
                    count = 7;
                    break;
                case 'h':
                    count = 8;
                    break;
                case 'i':
                    count = 9;
                    break;
                case 'j':
                    count = 10;
                    break;
                case 'k':
                    count = 11;
                    break;
                case 'l':
                    count = 12;
                    break;
                case 'm':
                    count = 13;
                    break;
                case 'n':
                    count = 14;
                    break;
                case 'o':
                    count = 15;
                    break;
                case 'p':
                    count = 16;
                    break;
                case 'q':
                    count = 17;
                    break;
                case 'r':
                    count = 18;
                    break;
                case 's':
                    count = 19;
                    break;
                case 't':
                    count = 20;
                    break;
                case 'u':
                    count = 21;
                    break;
                case 'v':
                    count = 22;
                    break;
                case 'w':
                    count = 23;
                    break;
                case 'x':
                    count = 24;
                    break;
                case 'y':
                    count = 25;
                    break;
                case 'z':
                    count = 26;
                    break;

            }
            switch (str.charAt(i - 1)) {
                case 'a':
                    count2 = 1;
                    break;
                case 'b':
                    count2 = 2;
                    break;
                case 'c':
                    count2 = 3;
                    break;
                case 'd':
                    count2 = 4;
                    break;
                case 'e':
                    count2 = 5;
                    break;
                case 'f':
                    count2 = 6;
                    break;
                case 'g':
                    count2 = 7;
                    break;
                case 'h':
                    count2 = 8;
                    break;
                case 'i':
                    count2 = 9;
                    break;
                case 'j':
                    count2 = 10;
                    break;
                case 'k':
                    count2 = 11;
                    break;
                case 'l':
                    count2 = 12;
                    break;
                case 'm':
                    count2 = 13;
                    break;
                case 'n':
                    count2 = 14;
                    break;
                case 'o':
                    count2 = 15;
                    break;
                case 'p':
                    count2 = 16;
                    break;
                case 'q':
                    count2 = 17;
                    break;
                case 'r':
                    count2 = 18;
                    break;
                case 's':
                    count2 = 19;
                    break;
                case 't':
                    count2 = 20;
                    break;
                case 'u':
                    count2 = 21;
                    break;
                case 'v':
                    count2 = 22;
                    break;
                case 'w':
                    count2 = 23;
                    break;
                case 'x':
                    count2 = 24;
                    break;
                case 'y':
                    count2 = 25;
                    break;
                case 'z':
                    count2 = 26;
                    break;
            }

            if (count > count2) {
                System.out.print(str.charAt(i));

            } else if (count==count2){
                System.out.print("");
            }

        }

    }

    public static void main(String[] args) {


        String st = ("hello");
        String st2="software";
        String st3="language";
        E139AccessModifiers obj1 = new E139AccessModifiers();
        obj1.alphabetical(st);
        System.out.println();
        obj1.alphabetical(st2);
        System.out.println();
        obj1.alphabetical(st3);
        System.out.println();



    }

}