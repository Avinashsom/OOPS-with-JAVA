//what is it ?
//Abstraction means incomplete by design.

//it is hidding the main implementation of methods, it gives instance and use it.
//It is used whenwe want to create a base class or method whose complete implementation is left for child classes.

abstract class Animal {}
//we can't create direct object of abstract class;

Animal animal = new Animal();//Error
//. it show error.
//Because abstact class represent the general concept rather than complette object.


abstract class Animal {

    void eat(){
        System.out.println("|Eating");
    }

    abstract void sound();
}

class Dog extends Animal {

    @Override
    void sound(){
        System.out.println("Dog is Bark");
    }
}

class Lion extends Animal {
    @Override
    void sound(){
        System.out.println("Lion is Roar");
    }
}

class Main {
    public static void main(String []args){
        Dog dog = new Dog();

        dog.sound();
        dog.eat();
    }
}