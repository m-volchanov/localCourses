package lessons.lesson9.incapsulation.launch;

import lessons.lesson9.incapsulation.cars.Bmw;
import lessons.lesson9.incapsulation.cars.Honda;
import lessons.lesson9.incapsulation.cars.Opel;
import lessons.lesson9.incapsulation.cars.Skoda;

public class Main {

    public static void main(String[] args) {
        Bmw bmw = new Bmw();
        bmw.aboutCar();
        System.out.println(bmw.fuel);

        Honda honda = new Honda();
        honda.publicAboutCar();

        Skoda skoda = new Skoda();
        String model = skoda.getModel();
        System.out.println(model);

        Opel opel = new Opel();
        opel.setFuel("Diesel");
        opel.setModel("Omega");
        opel.showAllInfo();

        System.out.println(opel.getFuel() + " it is fuel");
        opel.showAllInfo();

        Opel opel1 = new Opel();
        opel1.showAllInfo();
    }
}
