package com.codedifferently;

public class TriangleLoops {

    public static String getRow(int numberOfStars) {
        StringBuilder sb = new StringBuilder();
        String width = "";

        for(int i=0; i <= numberOfStars-1; i++) {
            sb.append("*");
        }
        width = sb.toString();
        
        return width;
    }

    public static String getTriangle(int numberOfRows) {
        StringBuilder sb = new StringBuilder();
        String triangle = "";

        for(int i=0; i < numberOfRows-1; i++) {
            for(int j=0; j <= i; j++) {
                sb.append("*");
            }
            sb.append("\n");
        }
        triangle = sb.toString();

        return triangle;
    }

    public static String getSmallTriangle() {
        StringBuilder sb = new StringBuilder();
        String triangle = "";
        int numberOfRows = 5;

        for(int i=0; i < numberOfRows-1; i++) {
            for(int j=0; j <= i; j++) {
                sb.append("*");
            }
            sb.append("\n");
        }
        triangle = sb.toString();

        return triangle;
    }

    public static String getLargeTriangle() {
        StringBuilder sb = new StringBuilder();
        String triangle = "";
        int numberOfRows = 10;

        for(int i=0; i < numberOfRows-1; i++) {
            for(int j=0; j <= i; j++) {
                sb.append("*");
            }
            sb.append("\n");
        }
        triangle = sb.toString();

        return triangle;
    }
}
