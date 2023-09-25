public class Animal {
    static int totalAnimals, totalCat, totalDog, totalTiger, totalLynx, totalPuma, totalCheetah = 0;
    String name;
    int runLimit;
    int swimLimit;
    public Animal(String name, int runLimit, int swimLimit){
        this.name = name;
        this.runLimit = runLimit;
        this.swimLimit = swimLimit;
        Animal.totalAnimals++;
    }
    public void run(int distance){
        if (distance <=  runLimit){
            System.out.println(name + " пробежал " + distance + "м");
        } else {
            System.out.println(name + " не может пробежать такую дистанцию");
        }
    }
    public void swim(int distance){
        if ((distance <= swimLimit)&&(distance > 0)){
            System.out.println(name + " проплыл " + distance + "м");
        } else if (swimLimit == 0){
            System.out.println(name + " не умеет плавать");
        }
        else {
            System.out.println(name + " не может проплыть такую дистанцию");
        }
    }
}
