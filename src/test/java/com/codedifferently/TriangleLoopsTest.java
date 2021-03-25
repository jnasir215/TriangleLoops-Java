package com.codedifferently;

import org.junit.Assert;
import org.junit.Test;

public class TriangleLoopsTest {
    @Test
    public void getRow() {
        int width = 20;

        String expected = "********************";
        String actual = TriangleLoops.getRow(width);

        Assert.assertEquals(expected, actual);
    }


    @Test
    public void getTriangleTest1() {
        String expected =
                "*\n" +
                "**\n" +
                "***\n" +
                "****\n" +
                "*****\n" +
                "******\n" +
                "*******\n" +
                "********\n" +
                "*********\n";
        String actual = TriangleLoops.getTriangle(10);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getTriangleTest2() {
        String expected =
                "*\n" +
                "**\n" +
                "***\n" +
                "****\n";
        String actual = TriangleLoops.getTriangle(5);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetSmallTriangle() {
        String expected =
                "*\n" +
                "**\n" +
                "***\n" +
                "****\n";
        String actual = TriangleLoops.getSmallTriangle();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetLargeTriangle() {
        String expected =
                "*\n" +
                "**\n" +
                "***\n" +
                "****\n" +
                "*****\n" +
                "******\n" +
                "*******\n" +
                "********\n" +
                "*********\n";
        String actual = TriangleLoops.getLargeTriangle();
        Assert.assertEquals(expected, actual);
    }
}
