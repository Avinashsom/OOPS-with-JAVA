//what is it?
//inhertance allows us to inherit the method and field of other class in another class.
//for code reusable and make relationship in between classes.


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