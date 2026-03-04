package OPPs._01_UserDefinedDataType;

public class _02_ {
    public static class Car{
        int seats;  // attributes
        String name;
        double length;
        String type;
        void print(){
            System.out.println(seats+",  "+name+ ", "+length+",907 "+type);
        }
    }
    public  static void main(String[] args){
        Car c = new Car();
        c.seats =  5;
        c.length = 3.99;
        c.name = "Rubicon";
        c.type = "SUV";
        change(c);
        c.print();

    }

    private static void change(Car c) {
        c.seats = 7;
    }

}
