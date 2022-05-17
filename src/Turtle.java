public class Turtle extends Animal {
int age;

    public Turtle(String name, int age) {
        super(name);
        this.age = age;
    }

    public void getSwimming(){
        System.out.println("swimming in a water");

    }

    @Override
    public void getEat() {
        System.out.println(name+ " can eat insects");
    }

    @Override
    public String toString() {
        return "Turtle{" +
                "} " + super.toString()+
                "age=" + age ;
    }
}

