public class Main {
    public static void main(String[] args) {
        Animal Shark = new Shark("Barri", "blue");

        Animal Turtle = new Turtle("Terry", 9);

        Animal Eagle = new Eagle("Eagle", "black");

        Animal[] animals = {Shark, Turtle, Eagle};
        for (Animal animal : animals) {
            if (animal instanceof Shark) {
                System.out.println(animal);
                ((Shark) animal).getAttack();
            }
            if (animal.getClass().getName().equals("Turtle")){
                System.out.println(animal);
                animal.getEat();
                ((Turtle)animal).getSwimming();

            }
            if (animal instanceof  Eagle){
                System.out.println(animal);
                ((Eagle) animal).getFly();
            }
        }
    }
}
