abstract class Felidae extends Animal {
    private int maxSpeed;
    public Felidae(String name, int runLimit, int swimLimit, int maxSpeed){
        super(name, runLimit, swimLimit);
        this.maxSpeed = maxSpeed;
    }
    public void speed(){
        if (maxSpeed > 0){
            System.out.println(name + " имеет максимальную скорость " + maxSpeed + "км/ч");
        } else {

        }
    }
}

