public class Dog extends Animal{
    public Dog(String name){
        super(name, 500 ,10);
        Animal.totalDog++;
    }
}
