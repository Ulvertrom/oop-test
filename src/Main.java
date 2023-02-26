public class Main {
    public static void main(String[] args) {

        Animal myAnimal = new Animal("black", 2, false);
        System.out.println(myAnimal.getDescription());
        Dog myDog = new Dog();
        Bird myBird = new Bird();
        System.out.println(myDog.getDescription());
        System.out.println(myBird.getDescription());
    }
}