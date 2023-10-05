public class Cat extends Felidae {
    public Cat(String name){
        super(name, 200 , 0, -1);
        Cat.totalCat++;
    }
    static int totalCat = 0;
}
