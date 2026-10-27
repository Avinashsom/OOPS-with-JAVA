//polymorphism Means "Many forms"

//The main idea of polymorphism is we write common code, but the different objects can behave differeent as they create.


class Animal {
    void eat(){
        System.out.println("|Eating");
    }
    void sound();
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
        Animal [] animals = {new Dog(),new Lion()};

        for(Animal animal : animals){
            animal.sound();
        }
    }
}