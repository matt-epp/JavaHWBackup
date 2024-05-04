package org.example.e141;
/*
Create the maxValue method that will accept int array and return return the maximum value in the array.

Method should visible every class in any package

**Output:**

```
22
 */
public class E141AccessModifiers {

    int[] arr;

   static public int maxValue(int[]arr){
       int max=0;
       for (int i = 1; i < arr.length; i++) {
           if(arr[i]>(arr[i-1]) && arr[i]>max){
               max=arr[i];

           }else{
               max=(arr[i-1]);
           }
       }return max;

    }
    public static void main(String[] args) {
    int [] ar={10, 4,8,22,16};
    int result1=maxValue(ar);
        System.out.println(result1);
    }
}
