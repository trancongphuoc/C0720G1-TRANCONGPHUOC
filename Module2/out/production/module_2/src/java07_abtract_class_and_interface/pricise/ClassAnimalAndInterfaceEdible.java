package java07_abtract_class_and_interface.pricise;

public class ClassAnimalAndInterfaceEdible {
    public static abstract class Animal {
        abstract String makeSound();
    }

    public interface Edible {
        String howToEat();
    }

    public static class Tiger extends Animal {
        public String makeSound() {
            return "Tiger: roarrrrr";
        }

    }

    public static class Chicken extends Animal implements Edible {
        public String makeSound() {
            return "Chicken: cuccucucuc";
        }

        public String howToEat() {
            return "Chicken could be fried";
        }
    }

    public static abstract class Fruit implements Edible {
    }

    public static class Orange extends Fruit {
        @Override
        public String howToEat() {
            return "Orange could be juiced";
        }
    }

    public static class Apple extends Fruit {
        @Override
        public String howToEat() {
            return "Apple could be slided";
        }
    }


    public static class Test {
        public static void main(String[] args) {
            Animal[] animals = new Animal[2];
            animals[0] = new Tiger();
            animals[1] = new Chicken();
            for (Animal animal : animals) {
                System.out.println(animal.makeSound());
                if (animal instanceof Chicken) {
                    Edible edibler = (Chicken) animal;
                    System.out.println(edibler.howToEat());
                }
            }


        }
    }

    public static class Testt {
        public static void main(String[] args) {
            Fruit[] fruits = new Fruit[2];
            fruits[0] = new Orange();
            fruits[1] = new Apple();
            for (Fruit fruit : fruits) {
                System.out.println(fruit.howToEat());
            }
        }
    }
}
