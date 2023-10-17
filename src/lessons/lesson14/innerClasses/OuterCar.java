package lessons.lesson14.innerClasses;

public class OuterCar {

    public void beginOfTravel() {
        Inner_Electric inner_electric = new Inner_Electric();
        inner_electric.turnOfIgnition();

        Inner_Engine inner_engine = new Inner_Engine();
        inner_engine.startEngine();

    }

    private class Inner_Engine {
        public void startEngine() {
            System.out.println("Starting Engine");
        }
    }

    private class Inner_Electric {
        public void turnOfIgnition() {
            System.out.println("Turning on ignition");
        }
    }
}
