package org.example.e108;
/*
create method and name as m1. Inside your method body add print statement as "m1 method implementation"
create another method and name as m2. Inside your method body add print statement as "m2 method implementation"
Call these two methods in the main method


**Expected Output**:

m1 method implementation
m2 method implementation
 */
public class E108JavaMethods {
    void m1(){
        System.out.println("m1 method implementation");
    }
    void m2(){
        System.out.println("m2 method implementation");
    }
    public static void main(String[] args) {
        E108JavaMethods obj1=new E108JavaMethods();
        obj1.m1();
        obj1.m2();



    }
}
