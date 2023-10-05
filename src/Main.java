public class Main {

    public static void main(String[] args) {


        Animal[] animals = {
                new Cat("Барсик"),
                new Dog("Шарик"),
                new Tiger("Лёва"),
                new Lynx("Рысь", 80),
                new Puma("Пума"),
                new Cheetah("Гепард"),
                new Dog("Шарик2")};

        for (Animal animal : animals) {
            animal.run(150);
            animal.swim(10);
        }

        animals[0].swim(10);
        ((Lynx) animals[3]).voice();
        ((Felidae) animals[4]).speed();

        System.out.println("Всего создано животных: " + Animal.totalAnimals);
        System.out.println("Всего создано кошачьих: " + Felidae.totalFelidae);
        System.out.println("Количество кошек: " + Cat.totalCat);
        System.out.println("Количество собак: " + Dog.totalDog);
        System.out.println("Количество тигров: " + Tiger.totalTiger);
        System.out.println("Количество рысей: " + Lynx.totalLynx);
        System.out.println("Количество пум: " + Puma.totalPuma);
        System.out.println("Количество гепардов: " + Cheetah.totalCheetah);
    }
}
