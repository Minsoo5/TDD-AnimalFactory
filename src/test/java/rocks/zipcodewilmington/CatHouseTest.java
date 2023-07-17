package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    CatHouse catHouse = new CatHouse();
    Date date = new Date();

    @Test
    // TODO - Create tests for `void add(Cat cat)`


    public void addCatTest() {
        //Given
        Cat cat = new Cat("Tabby", date, 2233);
        CatHouse.add(cat);

        //When
        Cat actualCat = cat;
        Cat expectedCat = CatHouse.getCatById(2233);

        //Then
        Assert.assertEquals(actualCat, expectedCat);

    }

    @Test
    // TODO - Create tests for `void remove(Integer id)`
    public void removeIntTest() {
        //Given
        Cat cat = new Cat("Tabby", date, 2233);
        CatHouse.add(cat);

        //When
        CatHouse.remove(2233);
        Cat expectedCat = null;
        Cat actualCat = CatHouse.getCatById(2233);

        //Then
        Assert.assertEquals(expectedCat, actualCat);

    }

    @Test
    // TODO - Create tests for `void remove(Cat cat)`
    public void removeCatTest() {
        //Given
        Cat cat = new Cat("Tabby", date, 2233);
        CatHouse.add(cat);

        //When
        CatHouse.remove(cat);
        Cat expectedCat = null;
        Cat actualCat = CatHouse.getCatById(2233);

        //Then
        Assert.assertEquals(expectedCat, actualCat);

    }

    @Test
    // TODO - Create tests for `Cat getCatById(Integer id)`
    public void getCatByIdTest() {
        //Given
        Cat cat = new Cat("Tabby", date, 2233);
        CatHouse.add(cat);

        //When
        Cat expectedCat = cat;
        Cat actualCat = CatHouse.getCatById(2233);

        //Then
        Assert.assertEquals(expectedCat, actualCat);

    }

    @Test
    // TODO - Create tests for `Integer getNumberOfCats()`
    public void getNumberOfCatsTest() {
        //Given
        Cat cat = new Cat("Tabby", date, 2233);
        CatHouse.add(cat);

        //When
        int expectedInt = 1;
        int actualInt = CatHouse.getNumberOfCats();

        //Then
        Assert.assertEquals(expectedInt, actualInt);

    }

}
