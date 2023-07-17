package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {

    Date date = new Date(04/01/1968);
    @Test
    // TODO - Create tests for `void add(Dog dog)`
    public void addTest() {
        //Given
        DogHouse.clear();
        Dog dog = new Dog("Doggy", date, 2233);
        DogHouse.add(dog);

        //When
        int expectedNumDog = 1;
        int actualNumDog = DogHouse.getNumberOfDogs();

        //Then
        Assert.assertEquals(expectedNumDog, actualNumDog);

    }

    @Test
    // TODO - Create tests for `void remove(Integer id)`
    public void removeByIdTest() {
        //Given
        DogHouse.clear();
        Dog dog = new Dog("Doggy", date, 2233);
        DogHouse.remove(2233);

        //When
        int expectedNumDog = 0;
        int actualNumDog = DogHouse.getNumberOfDogs();

        //Then
        Assert.assertEquals(expectedNumDog, actualNumDog);


    }

    @Test
    // TODO - Create tests for `void remove(Dog dog)`
    public void removeByDogTest() {
        //Given
        DogHouse.clear();
        Dog dog = new Dog("Doggy", date, 2233);
        DogHouse.remove(dog);

        //When
        int expectedNumDog = 0;
        int actualNumDog = DogHouse.getNumberOfDogs();

        //Then
        Assert.assertEquals(expectedNumDog, actualNumDog);


    }

    @Test
    // TODO - Create tests for `Dog getDogById(Integer id)`
    public void getDogByIdTest() {
        //Given
        DogHouse.clear();
        Dog dog = new Dog("Doggy", date, 2233);
        Dog dog2 = new Dog("Doggy", date, 2234);
        DogHouse.add(dog);
        DogHouse.add(dog2);

        //When
        Dog expectedDog = dog;
        Dog actualDog = DogHouse.getDogById(2233);

        //Then
        Assert.assertEquals(expectedDog, actualDog);
    }

    @Test
    // TODO - Create tests for `Integer getNumberOfDogs()`
    public void getNumberOfDogsTest() {
        //Given
        DogHouse.clear();
        Dog dog = new Dog("Doggy", date, 2233);
        Dog dog2 = new Dog("Doggy", date, 2234);
        DogHouse.add(dog);
        DogHouse.add(dog2);

        //When
        int expectedNumDog = 2;
        int actualNumDog = DogHouse.getNumberOfDogs();

        //Then
        Assert.assertEquals(expectedNumDog, actualNumDog);

    }

    @Test
    public void testGetNumberOfDogs() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);

        // Then
        DogHouse.getNumberOfDogs();
    }
}
