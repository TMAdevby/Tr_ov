package bl_belt.Nested_clsses.inner_class;

public class Car {
    String color;
    int doorCount;
    Car.Engine engine;

    public Car(String color, int doorCount){
        Engine e = new Engine(200);
        System.out.println(e.horsePower);
        this.color = color;
        this.doorCount = doorCount;
//        this.engine = this.new Engine(horsePower);
    }

    public void setEngine(Engine engine){
        this.engine = engine;
    }

//    void method(){
//        System.out.println(Engine.countOfObjects);
//        Car.Engine e = new Engine(200);
//        System.out.println(e.horsePower);
//    }

    @Override
    public String toString() {
        return "My car: {" +
                "color='" + color + '\'' +
                ", doorCount=" + doorCount +
                ", engine=" + engine +
                '}';
    }

    public class Engine{
        private int horsePower;

        public Engine(int horsePower) {
            this.horsePower = horsePower;
        }

        @Override
        public String toString() {
            return "My engine: {" +
                    "horsePower=" + horsePower +
                    '}';
        }
    }
}

class Test{
    public static void main(String[] args) {
//        Car.Engine engine = new Car.Engine(256);
        Car car = new Car("black",4);
        Car.Engine engine = car.new Engine(150);
        car.setEngine(engine);
        System.out.println(engine);
        System.out.println(car);

        Car.Engine engine3 = new Car("yellow",4).new Engine(200);

    }
}
