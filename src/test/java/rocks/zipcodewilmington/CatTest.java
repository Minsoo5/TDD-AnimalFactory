package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;
import java.util.Date;


/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    Date date = new Date(02/01/2020);

    @Test
    // TODO - Create tests for `void setName(String name)`
    public void setNameTest() {
        //Given
        Cat cat = new Cat("Tabby", date, 2233);
        cat.setName("Tabby the 2nd");
        //When
        String expectedName = "Tabby the 2nd";
        String actualName = cat.getName();

        //Then
        Assert.assertEquals(expectedName, actualName);

    }

    @Test
    // TODO - Create tests for `speak`
    public void speakTest() {
        //Given
        Cat cat = new Cat("Tabby", date, 2233);

        //When
        String expectedSpeak = "meow!";
        String actualSpeak = cat.speak();

        //Then
        Assert.assertEquals(expectedSpeak, actualSpeak);

    }

    @Test
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    public void setBirthDateTest() {
        //Given
        Cat cat = new Cat("Tabby", date, 2233);
        Date newDate = new Date(01/01/2021);
        cat.setBirthDate(newDate);

        //When
        Date expectedDate = newDate;
        Date actualDate = cat.getBirthDate();

        //Then
        Assert.assertEquals(expectedDate, actualDate);

    }

    @Test
    // TODO - Create tests for `void eat(Food food)`
    public void eatTest() {
        //Given
        Cat cat = new Cat("Tabby", date, 2233);
        Food cheese = new Food();
        cat.eat(cheese);

        //When
        int expectedFood = 1;
        int actualFood = cat.getNumberOfMealsEaten();

        //Then
        Assert.assertEquals(expectedFood, actualFood);


    }

    @Test
    // TODO - Create tests for `Integer getId()`
    public void getIdTest() {
        //Given
        Cat cat = new Cat("Tabby", date, 2233);

        //When
        int expectedId = 2233;
        int actualId = cat.getId();

        //Then
        Assert.assertEquals(expectedId, actualId);

    }

    @Test
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    public void animalInheritanceTest() {
        //Given
        Cat cat = new Cat("Tabby", date, 2233);

        //When


        //Then
        Assert.assertTrue(cat instanceof Animal);
    }

    @Test
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    public void mammalInheritanceTest() {
        //Given
        Dog dog = new Dog("Snoopy", date, 2233);

        //When


        //Then
        Assert.assertTrue(dog instanceof Mammal);

    }

    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }



}
