public class Tiger extends Felidae{
    static int totalTiger =0;
    public Tiger(String name){
        super(name, 1000, -1, -1);
        Tiger.totalTiger++;
    }
}
