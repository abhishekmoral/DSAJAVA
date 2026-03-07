package OPPs._03_Constructors;


public class _04_ThisKeyWord {
    public static class Car {
        int price; // 0
        String name; // null


        Car(int price, String name) {
            this.name = name;
            this.price = price;

        }


        void print() {
            System.out.println(price + ",   " + name);
        }


    }

    public static void main(String[] args) {
        Car c1 = new Car(8000000, "Rubicon");
        c1.print();
    }

}