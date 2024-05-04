package org.example.e181;
/*
Create Class Account

Create the below variables:

acc_no;
name;
email;
double amount;
Create the getter/setter methods for each variable.

In Main Class and the main method.

Using setter methods assign the values as:

acc_no = 7560504000

name = Sumair

email = sumair@syntax.com

amount = 50000.0

Using getter methods print the values as below output.

**Output:**

```
7560504000 Sumair sumair@syntax.com 50000.0
 */

class Account{
    String acc_no;
    String name;
    String email;
    double amount;



    public void getAccountNum(){
        System.out.print(acc_no+" ");

    }
    public void getName(){
        System.out.print(name+" ");

    }
    public void getEmail(){
        System.out.print(email+" ");

    }
    public void getAmount(){
        System.out.print(amount+" ");

    }
    public void setAccountNum (String acc_no){
        this.acc_no=acc_no;

    }
    public void setName (String name){
        this.name=name;

    }
    public void setEmail (String email){
        this.email=email;

    }
    public void setAmount (double amount){
        this.amount=amount;

    }



}
public class E181Encapsulation {
    public static void main(String[] args){
Account obj=new Account();

                obj.setAccountNum("7560504000");
        obj.setName("Sumair");
        obj.setEmail("sumair@syntax.com");
        obj.setAmount(50000.0);
obj.getAccountNum();
        obj.getName();
        obj.getEmail();
        obj.getAmount();
    }

}


