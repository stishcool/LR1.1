public class Main {

    public static void main (String[] args) {
        Cat cat1 = new Cat("Барсик");
        Dog dog1 = new Dog("Шарик");
        Tiger tiger1 = new Tiger("Лёва");
        Lynx lynx1 = new Lynx("Рысь");
        Puma puma1 = new Puma("Пума");
        Cheetah cheetah1 = new Cheetah("Гепард");

        Animal[] animals = {cat1, dog1, tiger1, lynx1, puma1, cheetah1};
        Felidae[] felidae = {cat1, lynx1, puma1, cheetah1};

        for (Animal animal : animals) {
            animal.run(150);
            animal.swim(10);
        }

        for (Felidae felidaeAnimal : felidae) {
            felidaeAnimal.speed();
        }
        System.out.println("Всего создано животных: " + Animal.totalAnimals);
        System.out.println("Количество кошек: " + Animal.totalCat);
        System.out.println("Количество собак: " + Animal.totalDog);
        System.out.println("Количество тигров: " + Animal.totalTiger);
        System.out.println("Количество рысей: " + Animal.totalLynx);
        System.out.println("Количество пум: " + Animal.totalPuma);
        System.out.println("Количество гепардов: " + Animal.totalCheetah);
    }

}