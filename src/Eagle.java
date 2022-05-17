public class Eagle extends Animal {
    String eyes;

    public Eagle(String name, String eyes) {
        super(name);
        this.eyes = eyes;
    }

    @Override
    public void getEat() {
        System.out.println(name+ " can eat meat");
    }

    public void getFly() {
        System.out.println(name+ " flying on the sky");

    }

    @Override
    public String toString() {
        return "Eagle{" + super.toString()+
                "eyes='" + eyes + '\'' +
                "} " ;
    }
}



