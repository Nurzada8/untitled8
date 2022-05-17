public class Animal{
    String name;
    public Animal(String name) {
        this.name = name;
    }
    public void getEat() {
        System.out.println(name + "eat plants");
    }
    @Override
    public String toString() {
        return
                "name: " + name ;


    }
}
