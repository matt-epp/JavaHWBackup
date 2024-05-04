package org.example.e182;
/*
Create the a Person class with the following:

Class Variables

firstname
lastname
birthmonth
birthday
birthyear
String ssn
Constructor

The main constructor should take in all values and assign them to their respective private class variables

Methods

Create a public getters to access all the variables.

Create a public method called formatBirthday, which will return a String composed of their birthday
in mm/dd/yyyy format.
For example, if birthmonth=3, birthday=22, birthyear=2000, it should return the String "3/22/2000"

in Main Class.

Instantiate and object of Person and provide values. follows below outputs for values.

using getter and method print them separately.

Note: Read carefully the steps.

**Output:**

```
John
Doe
10/25/1900
123-45-6789
 */
class Person{
    private String firstname;
    private String lastname;
    private int birthmonth;
   private int birthday;
    private int birthyear;
    private String ssn;

    Person(String firstname,String lastname,int birthmonth,int birthday,int birthyear,String ssn){
        this.firstname=firstname;
        this.lastname=lastname;
        this.birthmonth=birthmonth;
        this.birthday=birthday;
        this.birthyear=birthyear;
        this.ssn=ssn;


    }

    public void getFirstName(){
        System.out.println(firstname);

    }
    public void getLastName(){
        System.out.println(lastname);

    }
    public void getBirthMonth(){
        System.out.println(birthmonth);


    }
    public void getBirthDay(){
        System.out.println(birthday);

    }
    public void getBirthYear(){
        System.out.println(birthyear);

    }
    public void getSsn(){
        System.out.println(ssn);

    }
    public void formatBirthday(){
        System.out.println(birthmonth+"/"+birthday+"/"+birthyear);
    }
}
public class E182Encapsulation {
    public static void main(String[] args){

        Person obj=new Person("John","Doe",10,25,1900,"123-45-6789");
        obj.getFirstName();
        obj.getLastName();
        obj.formatBirthday();
        obj.getSsn();
    }
}

