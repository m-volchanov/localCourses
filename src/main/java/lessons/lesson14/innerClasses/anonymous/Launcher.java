package lessons.lesson14.innerClasses.anonymous;

public class Launcher {

    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.displayMassage(new Massage() {
            @Override
            public String helloMassage() {
                return "Hello guys";
            }
        });
    }
}
