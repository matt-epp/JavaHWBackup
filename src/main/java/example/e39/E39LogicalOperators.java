package org.example.e39;

import java.util.Scanner;

/*
**For you to do:**

A school has following rules for grading system:
a. 1 to 25 - F
b. 25 to 45 - E
c. 45 to 50 - D
d. 50 to 60 - C
e. 60 to 80 - B
f. Above 80 - A
Ask the user to enter marks and print the corresponding grade.

**Example Output:**

```
Please enter your mark
```

```
Your grade is A
```

**Example Output:**

```
Please enter your mark
```

```
Please enter valid mark
 */
public class E39LogicalOperators {
    //Note: When you are done with coding comment these two prints to successfully pass your test
    //System.out.println("Please enter your mark");
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
    //    System.out.println("Please enter your mark");
        int mark = scan.nextInt();

        if (mark > 80) {
            System.out.println("Your grade is A");
        } else if (mark >= 60) {
            System.out.println("Your grade is B");
        } else if (mark >= 50) {
            System.out.println("Your grade is C");
        } else if (mark >= 45) {
            System.out.println("Your grade is D");
        } else if (mark >= 25) {
            System.out.println("Your grade is E");
        } else if (mark >= 1) {
            System.out.println("Your grade is F");


        } else {
            System.out.print("Please enter valid mark");
        }
    }
}
