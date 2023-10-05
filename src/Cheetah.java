public class Cheetah extends Felidae{
    static int totalCheetah =0;
    public Cheetah(String name){
        super(name, 800, -1, 120);
        Cheetah.totalCheetah++;
    }
}
