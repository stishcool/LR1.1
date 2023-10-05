public class Lynx extends Felidae {
    private int voiceH;
    static int totalLynx = 0;

    public Lynx(String name, int voiceH) {
        super(name, 400, -1, 65);
        this.voiceH = voiceH;
        Lynx.totalLynx++;
    }
    public void voice() {
        if (voiceH > 0) {
            System.out.println(name + " говорит рррррр ");
        } else {}
    }
}
