package io.zipcoder.pets;

import org.junit.Assert;
import org.junit.Test;


/**
 * Created by kevinoconnell on 9/26/16.
 */
public class KevinPetTest {

    @Test
    public void dogSpeakTest() {
        Pet dog = new Dog();
        String expected = "Woof woof";
        String actual = dog.speak();
        Assert.assertEquals("The dog says Woof woof", expected, actual);
    }

    @Test
    public void catSpeakTest() {
        Pet cat = new Cat();
        String expected = "meow";
        String actual = cat.speak();
        Assert.assertEquals("The cat says meow", expected, actual);
    }

    @Test
    public void hamsterSpeakTest() {
        Pet hamster = new Hamster();
        String expected = "squeak";
        String actual = hamster.speak();
        Assert.assertEquals("The hamster says squeak", expected, actual);
    }

    @Test
    public void nameTest() {
        Pet dog = new Dog();
        String expected = "Charles";
        dog.setName("Charles");
        String actual = dog.getName();
        Assert.assertEquals("The dog's name is Charles", expected, actual);
    }
}