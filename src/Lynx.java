public class Lynx extends Felidae {
    private int voiceH;

    public Lynx(String name, int voiceH) {
        super(name, 400, -1, 65);
        this.voiceH = voiceH;
        Animal.totalLynx++;
    }
    public void voice() {
        if (voiceH > 0) {
            System.out.println(name + " имеет громкость голоса " + voiceH + " дБ");
        } else {}
    }
}
