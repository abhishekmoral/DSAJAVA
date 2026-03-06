package OPPs._03_Constructors;

public class _02_OverLoading {
    public static class Car {
        int price; // 0
        String name; // null
        int seats;
        Car() { // default constructor is not work is parameter wala is present.

        }

        Car(int x, String y) {
            price = x;

            name = y;
        }

        Car(int x, String y, int z ) {
            price = x;
            name = y;
            seats = z;
        }

        void print() {
            System.out.println(price+ ",   " + name+",   "+seats);
        }


    }

    public static void main(String[] args) {
        Car c1 = new Car(800000, "Rubicon");
        c1.print();

    }
}
