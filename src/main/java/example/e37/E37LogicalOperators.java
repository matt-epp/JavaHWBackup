package org.example.e37;

import java.util.Scanner;

public class E37LogicalOperators {
    /*
    Take 2 boolean inputs from a user:



"Are you thirsty?"

"Are you sleepy?"

If user is thirsty and not sleepy--> drink=water

If user is thirsty and sleepy--> drink=coffee

If user is not thirsty and sleepy --> drink=tea

Otherwise drink="nothing"

Output:
```
Looks like you need to drink \_\_\_
     */
    //Note: When you are done with coding comment these two prints to successfully pass your test

    //System.out.println("Are you thirsty?");
    // System.out.println("Are you sleepy?");

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       // System.out.println("Are you thirsty?");
        boolean thirsty = scan.nextBoolean();
     //  System.out.println("Are you sleepy?");
        boolean sleepy = scan.nextBoolean();

        if (thirsty && !sleepy) {
            System.out.println("Looks like you need to drink water");
        } else if (thirsty && sleepy) {
            System.out.println("Looks like you need to drink coffee");
        } else if (!thirsty && sleepy) {
            System.out.println("Looks like you need to drink tea");
        } else {
            System.out.println("Looks like you need to drink nothing");

        }

    }
}
