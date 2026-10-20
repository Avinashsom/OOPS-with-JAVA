System.out.println("Helooo github codeSpaces");

/// what is oops
/*
OOP can organise the code in a better way and make it more reusable and maintainable.
 */


// WHAT IS CLASS?
// A class is a bluePrint or template for creating objects.

// What is an object?
// An object is an instance of a class.

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
        Car myCar = new Car(); // this is object creation
        myCar.name = "Toyota";
        myCar.color = "Red";
        myCar.start();
    }
}


// what is feild?
// A field is a variable that is declared inside a class but outside of any method, constructor.
//like name and color are fields of class car.

// Types of fields
// 1. Instance fields:  belong to an object.
// 2. Static fields: belong to the class.
//3. Final fields: cannot be changed once they are initialized.


// what is method?
// A method is a block of code that performs a specific task. It is defined inside a class.
//  In the example above, the `start` method is called on the `myCar` object.

//what is constructor?
// It has the same name as the class and does not have a return type.
// A constructor is a special method that is called when an object is created.

Class Car {
    String name;
    String color;
    Private int price;

    Car(){
        this.price = 10000;
    }

    Car(String name, String color) {
        this.name = name;
        this.color = color;
    }

    void start() {
        System.out.println("Car is starting");
    }
}

Class Main {
    public static void main(String[] args) {

        // HERE WE ARE CREATING AN OBJECT OF CLASS CAR
        Car myCar = new Car("Toyota", "Red"); // this is object creation
        
        myCar.start();
    }
}
