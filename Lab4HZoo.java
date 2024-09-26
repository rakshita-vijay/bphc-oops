
public class Lab4HZoo {
  public static void main(String[] args) {
    // Lab4IAnimal animal = new Lab4IAnimal(); // cannot be instantiated because it is abstract
    // Lab4JSwim swim = new Lab4JSwim(); // cannot be instantiated because it is abstract
    // Lab4KFly fly = new Lab4KFly(); // cannot be instantiated because it is abstract

    Lab4LFish fish = new Lab4LFish();
    fish.eat();
    fish.makeSound();
    fish.swim();
    fish.breatheUnderwater();

    System.out.println();

    Lab4MBird bird = new Lab4MBird();
    bird.eat();
    bird.makeSound();
    bird.fly();
    bird.layEggs();
  }
}
