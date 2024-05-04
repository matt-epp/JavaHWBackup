package org.example.e129;
/*
Declare two static variables to hold
country name
continent
Create a method to display the value of static variables in the following format:
____ located on ____ continent
In the main method assign values to a static variable and execute method display

**Output:**

```
Morocco located on Africa continent
 */
public class E129StaticKeyword {
    static String countryName;
    static String continent;

    static void printData(){
        System.out.println(countryName+" located on "+continent+" continent");
    }


    public static void main(String[] args) {

        E129StaticKeyword.countryName="Morocco";
        E129StaticKeyword.continent="Africa";
        printData();


    }
}
