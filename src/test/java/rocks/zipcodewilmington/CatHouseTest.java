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
        Cat cat1 = new Cat("Tabby", date, 2233);
        CatHouse.add(cat1);

        //When
        Cat actualCat = cat1;
        Cat expectedCat = CatHouse.getCatById(2233);

        //Then
        Assert.assertEquals(actualCat, expectedCat);

    }

    @Test
    // TODO - Create tests for `void remove(Integer id)`
    public void removeIntTest() {
        //Given
        Cat cat2 = new Cat("Tabby", date, 223);
        CatHouse.add(cat2);

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
        Cat cat3 = new Cat("Tabby", date, 22);
        CatHouse.add(cat3);

        //When
        CatHouse.remove(cat3);
        Cat expectedCat = null;
        Cat actualCat = CatHouse.getCatById(22);

        //Then
        Assert.assertEquals(expectedCat, actualCat);

    }

    @Test
    // TODO - Create tests for `Cat getCatById(Integer id)`
    public void getCatByIdTest() {
        //Given
        Cat cat4 = new Cat("Tabby", date, 2233);
        CatHouse.add(cat4);

        //When
        Cat expectedCat = cat4;
        Cat actualCat = CatHouse.getCatById(2233);

        //Then
        Assert.assertEquals(expectedCat, actualCat);

    }

    @Test
    // TODO - Create tests for `Integer getNumberOfCats()`
    public void getNumberOfCatsTest() {
        //Given
        CatHouse.clear();
        Cat cat5 = new Cat("Tabby", date, 33);
        CatHouse.add(cat5);

        //When
        int expectedInt = 1;
        int actualInt = CatHouse.getNumberOfCats();

        //Then
        Assert.assertEquals(expectedInt, actualInt);

    }

}
