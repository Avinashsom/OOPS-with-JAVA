//composition means one class contain or uses the object of other class.
//"Has A Relationship";

//as like as inheritance;

class Engine {
    void start() {
        System.out.println("Engine is start");
    }
}

class car {
    Engine engine = new Engine();

    void startCar(){
        engine.start();
    }
}