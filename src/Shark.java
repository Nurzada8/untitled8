public class Shark extends Animal {

String color;

    public Shark(String name, String color) {
        super(name);
        this.color = color;
    }

    public void getAttack() {
        System.out.println(name+ " attack to small fishes");
    }

    @Override
    public void getEat() {
        System.out.println("shark can eat fishes");
    }

    @Override
    public String toString() {
        return "Shark:  "+super.toString()+
                " color: "+color;

    }
}
