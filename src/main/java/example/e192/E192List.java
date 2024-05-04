package org.example.e192;
/*
Create a Linked List that will store all prime numbers from 1 to 100

Step 1. Create a method that will identify wether number is prime or not

Step 2. Add all prime numbers into Linked List

Print Linked List:

**Output:**

```
[2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97]```
 */


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class E192List {
    public static class PrimeMethod {
        public  boolean isPrime(int number) {
            if (number <= 1) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    return false;
                }
            }
            return true;

        }
    }

    public static void main(String[] args) {
/*
        List<Integer> prime = new LinkedList<>();
        for (int i = 1; i < 101; i++) {
            prime.add(i);
        }

        // int num = 57;
        //    boolean isPrime = true;
        for (int i = 0; i < prime.size(); i++) {
         //   for (int j = 2; j < prime.get(i); i++) {
//if (prime.get(i) % j == 0) {
            //        prime.remove(i);
//  prime.forEach(x->x/ prime.get(x));
                }

            }
        }
        System.out.println(prime);

 */    List<Integer> primeList = new ArrayList<>();
E192List obj =new E192List();
        for (int i = 2; i <= 100; i++) {
            if (PrimeMethod.isPrime(i)){
                primeList.add(i);
            }
        }
        System.out.println(primeList);

    }
    }




