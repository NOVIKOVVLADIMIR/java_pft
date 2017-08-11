package ru.stqa.pft.sandbox;


import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Владимир on 27.07.2017.
 */
public class PointTests {

    @Test
    public void testPoint() {
        Point p1 = new Point(3, 4);
        Point p2 = new Point(0, 0);


        Assert.assertEquals(p2.distance(p1), 5.0, "Correct");


    }

}