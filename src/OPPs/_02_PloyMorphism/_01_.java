package OPPs._02_PloyMorphism;

public class _01_ {
    public static class Dog {
        void speak() {
            System.out.println(" Bhau Bhau");
        }

    }

    public static class Cat {
        void speak() {
            System.out.println(" Meow Meaw ");

        }
    }

    public static class Lion {
        void speak() {
            System.out.println(" GRRRR ");

        }
    }

    public static class Human {
        void speak() {
            System.out.println(" Hello ");

        }
    }


    public static void main(String[] args) {
        Human h = new Human();
        Dog d = new Dog();
        Lion L = new Lion();
        h.speak();
        d.speak();
        L.speak();

    }
}


