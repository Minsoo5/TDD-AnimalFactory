package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {

    @Test
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`

    public void createDogTest() {
        //Given
        Date date = new Date();
        Dog dog = new Dog("Snoopy",  date, null );

        String expectedName = "Snoopy";
        Date expectedDate = date;
        Integer expectedId = null;

        //When
        String actualName = dog.getName();;
        Date actualDate = dog.getBirthDate();
        Integer actualId = dog.getId();

        //Then

        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedDate, actualDate);
        Assert.assertEquals(expectedId, actualId);
    }

    @Test
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`
    public void createCatTest() {
        //Given
        Date date = new Date();
        Cat cat = new Cat("Tabby",  date, null );

        String expectedName = "Tabby";
        Date expectedDate = date;
        Integer expectedId = null;

        //When
        String actualName = cat.getName();;
        Date actualDate = cat.getBirthDate();
        Integer actualId = cat.getId();

        //Then

        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedDate, actualDate);
        Assert.assertEquals(expectedId, actualId);
    }
}
