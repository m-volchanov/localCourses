package lessons.lesson14.innerClasses;

public class OuterCarStatic {

    static class Inner_Engine {
        public void startEngine() {
            System.out.println("Starting Engine");
        }
    }

    static class Inner_Electric {
        public void turnOfIgnition() {
            System.out.println("Turning on ignition");
        }
    }
}
