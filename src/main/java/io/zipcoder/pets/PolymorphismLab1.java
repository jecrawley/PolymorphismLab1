package io.zipcoder.pets;

import java.util.*;
import java.util.Scanner;

/**
 * Created by jamescrawley on 9/26/16.
 */
public class PolymorphismLab1 {

    public static void main(String[] args) {

        int petCount;
        Scanner scanner = new Scanner(System.in);
        String petType;
        String petName;

        List<Pet> pets = new ArrayList<Pet>();

        System.out.println("How many pets do you have?");
        petCount = scanner.nextInt();

        for (int i = 0; i < petCount; i++) {
            System.out.println("What kind of pet is it?");
            petType = scanner.next();
            switch (petType.toLowerCase()) {
                case "dog":
                    pets.add(new Dog());
                    break;
                case "cat" :
                    pets.add(new Cat());
                    break;
                case "hamster":
                    pets.add(new Hamster());
                    break;
                default:
                    System.out.println("We don't support such animals, you're getting a dog.");
                    pets.add(new Dog());
            }
            System.out.println("What is the pet's name?");
            petName = scanner.next();
            (pets.get(i)).setName(petName);

        }

        for (Pet pet : pets) {
            System.out.println("My name is " + pet.getName() + ". I say " + pet.speak() + ".");
        }
    }
}
