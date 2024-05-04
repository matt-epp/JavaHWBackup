package org.example.e85;
/*
Write a program to print out the pattern:

**Expected output:**

```
1 2 3 4 5 6 7
```

```
1 2 3 4 5 6
```

```
1 2 3 4 5
```

```
1 2 3 4
```

```
1 2 3
```

```
1 2
```

```
1
```

```
1 2
```

```
1 2 3
```

```
1 2 3 4
```

```
1 2 3 4 5
```

```
1 2 3 4 5 6
```

```
1 2 3 4 5 6 7
 */
public class E85NestedForLoops {
    public static void main(String[] args) {

        for(int i=0;i<7;i++){
            for(int j=0;j<7-i;j++){
                System.out.print(j + 1 + " ");
            }
            System.out.println();
        }
//        for(int i=1;i<7;i++){
//            for(int j=0;j<1+i;j++){
//                System.out.print(j + 1 + " ");
//            }
//            System.out.println();
//        }

    }

    
}
