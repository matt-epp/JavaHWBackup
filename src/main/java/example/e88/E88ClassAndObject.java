package org.example.e88;
/*
Create a Class Main
In this class, you should specify the following attributes: breed, name, color, and following behaviors: bark(), run(), play().
Create 3 different objects of it: Husky, Bulldog, Labrador with specific attributes and behaviors.

**Expected Output:**

```
The output of the program should be as following:
Husky can bark
Husky can run
Husky can play
Bulldog can bark
Bulldog can run
Bulldog can play
Labrador can bark
Labrador can run
Labrador can play
 */
/*class Main{

    Main (String dogBreed,String dogName,String dogColor){
        System.out.println(dogBreed+"can ");

        Main bark(){
            System.out.print("bark");
        }


        Main run(){
            System.out.print("run");
        }

        Main play(){
            System.out.println("play");
        }

        }
        }

*/
class Main{

    String breed;
    String color;
    String name;

    void bark(){
        System.out.println(breed+" can bark");
    }


    void run(){
        System.out.println(breed+" can run");
    }

    void play(){
        System.out.println(breed+" can play");
    }




}

public class E88ClassAndObject {


    public static void main(String[] args) {

        Main dog1=new Main();
        dog1.breed="Husky";

        Main dog2=new Main();
        dog2.breed="Bulldog";

        Main dog3=new Main();
        dog3.breed="Labrador";

        dog1.bark();
        dog1.run();
        dog1.play();

        dog2.bark();
        dog2.run();
        dog2.play();

        dog3.bark();
        dog3.run();
        dog3.play();


     /*

        System.out.println(dog1);
*/
    }
}
