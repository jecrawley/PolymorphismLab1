package io.zipcoder.pets;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by jamescrawley on 9/26/16.
 */
public class JamesPetTest {

    Pet hamster = new Hamster();
    Pet dog = new Dog();
    Pet cat = new Cat();

    @Test
    public void dogSpeakTest () {

        assertEquals("Dogs should say \"Woof woof\".", "Woof woof", dog.speak());

    }

    @Test
    public void catSpeakTest () {


        assertEquals("Dogs should say \"meow\".", "meow", cat.speak());

    }

    @Test
    public void hamsterSpeakTest () {

        assertEquals("Dogs should say \"squeak\".", "squeak", hamster.speak());


    }

    @Test
    public void nameTest () {
        dog.setName("Benny");
        assertEquals("The name should be Benny", "Benny", dog.getName());
    }

}
