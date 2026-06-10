 public class Program {
        public static void main(String[] args) {
            Animal myAnimal = new Animal();
            Dog myDog = new Dog();
            Object obj = myDog;
            Animal anotherAnimal = myDog;

            System.out.println("myAnimal is a " + myAnimal.getClass().getName());
            System.out.println("myDog is a " + myDog.getClass().getName());
            System.out.println("obj is a " + obj.getClass().getName());
            System.out.println("anotherAnimal is a " + anotherAnimal.getClass().getName());
        }
    }