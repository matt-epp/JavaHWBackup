package org.example.e74;

import java.util.Scanner;

/*
Create an int array of integers with a size of 5 and input values with Scanner.

Don't print prompt questions for a user.

Using loop print out each element of the array that should look like the output below
Input:

1

2

3

4

5

```
Output:
```

```
10
```

```
20
```

```
30
```

```
40
```

```
50
 */
public class E74Arrays {
    public static void main(String[]args){

        int[] num = new int[5];

        for (int i = 0; i < 5; i++) {

            Scanner scan = new Scanner(System.in);
            num[i] = scan.nextInt();

        }
        // for (int j = 0; j < 5; j++) {
//System.out.println((num[j]) * 10);
        for(int n:num){
            System.out.println(n*10);
        }
    }
}