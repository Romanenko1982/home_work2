package local;

public class Main {

    public static void main(String[] args) {

        Person dima = new Person();
        System.out.println("Имя - " + dima.name + "\nВозраст - " + dima.age + "\nРост - " +
            dima.height + "см" + "\nВес - " + dima.getWeight() + " кг");
        System.out.println(
            "------------------------------------------------------------------------------------------");

        Person adultDima = new Person("Дмитрий", 25, Person.Pol.MAN, 185, 70, "white");
        System.out
            .println("Имя - " + adultDima.name + "\nВозраст - " + adultDima.age + " лет" + "\nРост - " +
                adultDima.height + " см" + "\nВес - " + adultDima.getWeight() + " кг");
        System.out.println(
            "------------------------------------------------------------------------------------------");

        Person youngDima = new Person();
        youngDima.name = "Димочка";
        youngDima.setColorHair("белый");
        youngDima.setWeight(3);
        youngDima.setHeight(50);
        youngDima.age = 2;
        System.out.println("Имя - " + youngDima.name + "\nВес равен - " + youngDima.getWeight() +
            " кг" + "\nРост равен - " + youngDima.getHeight() + " см" + "\nЦвет волос - " + youngDima
            .getColorHair());
        System.out.println(
            "------------------------------------------------------------------------------------------");

        System.out.println(dima);
        System.out.println(adultDima);
        System.out.println(youngDima);
        System.out.println(
            "------------------------------------------------------------------------------------------");

        youngDima.grow(2);
        System.out.println(youngDima);
        adultDima.grow(6);
        System.out.println(adultDima);
        dima.grow(10);
        System.out.println(dima);
        System.out.println(
            "------------------------------------------------------------------------------------------");

        System.out.println(youngDima.speak(1));
        System.out.println(dima.speak(5));
        System.out.println(adultDima.speak(25));
        System.out.println(
            "------------------------------------------------------------------------------------------");

        System.out.printf(youngDima.toEatOrNotToEat() +
            ", т.к. твой индекс массы тела равен " + "%.2f", youngDima.getBodyMassIndex());
        System.out.println();
        System.out.printf(dima.toEatOrNotToEat() + ", т.к. твой индекс массы тела равен " +
            "%.2f", dima.getBodyMassIndex());
        System.out.println();
        System.out.printf(adultDima.toEatOrNotToEat() + ", т.к. Ваш индекс массы тела равен " +
            "%.2f", adultDima.getBodyMassIndex());
        System.out.println();
        System.out.println(
            "------------------------------------------------------------------------------------------");

        Person lola = new Person("Лола", 35, Person.Pol.WOMAN, 168, 58);
        System.out.println(lola.toEatOrNotToEat());
        System.out.println(lola.name + " носит волосы цвета " + lola.hairColor());
        System.out.println(
            "------------------------------------------------------------------------------------------");
    }
}
