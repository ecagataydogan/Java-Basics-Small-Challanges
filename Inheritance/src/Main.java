public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();
        Dog dog2 = new Dog();
        doAnimalStuff(dog,"fast");
        doAnimalStuff(animal,"slow");

        Dog yorkie = new Dog("Yorkie",15);
        doAnimalStuff(yorkie,"fast");
        Dog retriever = new Dog("Labrador retriever" , 65, "Floppy" , "Swimmer");
        doAnimalStuff(retriever,"Slow");

    }

    public static void doAnimalStuff(Animal animal,String speed) {
        System.out.println(animal);
        animal.makeNoise();
        animal.move(speed);
        System.out.println("_ _ _ _");
    }
}
