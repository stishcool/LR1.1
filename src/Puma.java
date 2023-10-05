public class Puma extends Felidae{
    static int totalPuma =0;
    public Puma(String name){
        super(name, 600, -1, 70);
        Puma.totalPuma++;
    }
}
