public class Dog extends Animal{
    static int totalDog = 0;
    public Dog(String name){
        super(name, 500 ,10);
        Dog.totalDog++;
    }
}
