System.out.println("Helooo github codeSpaces");

/// what is oops
/*
OOP can organise the code in a better way and make it more reusable and maintainable.
 */


// WHAT IS CLASS?
// A class is a bluePrint or template for creating objects.

Class Car {
    String name;
    String color;

    void start() {
        System.out.println("Car is starting");
    }
}

Class Main {
    public static void main(String[] args) {

        // HERE WE ARE CREATING AN OBJECT OF CLASS CAR
        Car myCar = new Car();
        myCar.name = "Toyota";
        myCar.color = "Red";
        myCar.start();
    }
}