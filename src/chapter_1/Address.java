package chapter_1;

public class Address {

    /**
     * Instructions:
     * Write, compile, and test a class that displays your full name, street address,
     * city, state, and zip code on three separate lines on the screen. Save the class as
     * Address.java.
     */

    public static void main (String[] args) {
        String fullName = "chobocoder";
        String streetAddress = "100 Main Street";
        String city = "New York";
        String state = "NY";
        int zipCode = 12346;

        System.out.println(fullName);
        System.out.println(streetAddress);
        System.out.println(city + " " + state + " " + zipCode);
    }
}
