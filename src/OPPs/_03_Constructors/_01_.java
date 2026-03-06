package OPPs._03_Constructors;

public class _01_ {
    public static class Car{
        int seats; // 0
        String name; // null
        double length; // 0.0
        Car(){ // default constructor

        }
        Car(int x , String y, double z){
            seats = x;
            length= z;
            name = y;
        }
        void  print(){
            System.out.println(seats+",  "+length+",   "+name);
        }


    }

    public static void main(String[] args ) {
        Car c1 = new Car(5,"Rubicon", 5.99);
        c1.seats = 7;
        c1.print();

    }
}
