package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {

    Date date = new Date(01/02/2003);
    @Test
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    public void dogConstructorTest () {
        //Given
        Dog dog = new Dog("Doggy", date, 2233);
        DogHouse.add(dog);

        //When
        String expectedDogName = "Doggy";
        Date expectedDogDate = date;
        int expectedDogId = 2233;

        String actualDogName = dog.getName();
        Date actualDogDate = dog.getBirthDate();
        int actualDogId = dog.getId();

        //Then
        Assert.assertEquals(expectedDogName,actualDogName);
        Assert.assertEquals(expectedDogDate, actualDogDate);
        Assert.assertEquals(expectedDogId, actualDogId);

    }

    @Test
    // TODO - Create tests for `speak`
    public void speakTest() {
        //Given
        Dog dog = new Dog("Doggy", date, 2233);

        //When
        String expectedSpeak = "bark!";
        String actualSpeak = dog.speak();

        //Then
        Assert.assertEquals(expectedSpeak, actualSpeak);

    }

    @Test
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    public void setBirthDateTest() {
        //Given
        Dog dog = new Dog("Doggy", date, 2233);
        Date newDate = new Date(01/05/2020);
        dog.setBirthDate(newDate);

        //When
        Date expectedDate = newDate;
        Date actualDate = dog.getBirthDate();

        //Then
        Assert.assertEquals(expectedDate, actualDate);

    }

    @Test
    // TODO - Create tests for `void eat(Food food)`
    public void eatTest() {
        //Given
        Dog dog = new Dog("Doggy", date, 2233);
        Food bone = new Food();
        dog.eat(bone);

        //When
        int expectedMealsEaten = 1;
        int actualMealsEaten = dog.getNumberOfMealsEaten();

        //Then
        Assert.assertEquals(expectedMealsEaten, actualMealsEaten);

    }

    @Test
    // TODO - Create tests for `Integer getId()`
    public void getIdTest() {
        //Given
        Dog dog = new Dog("Doggy", date, 2233);

        //When
        int expectedId = 2233;
        int actualId = dog.getId();

        //Then
        Assert.assertEquals(expectedId, actualId);

    }
    @Test
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    public void animalInheritanceTest() {
        //Given
        Dog dog = new Dog("Doggy", date, 2233);

        //When


        //Then
        Assert.assertTrue(dog instanceof Animal);

    }

    @Test
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    public void mammalInheritanceTest() {
        //Given
        Dog dog = new Dog("Doggy", date, 2233);

        //When


        //Then
        Assert.assertTrue(dog instanceof Mammal);

    }



    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }
}
