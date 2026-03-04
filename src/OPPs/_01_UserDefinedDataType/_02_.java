package OPPs._01_UserDefinedDataType;

public class _02_PassingClassesToMethods {
    public static class Car{
        int seats;
        String name;
        double length;
        String type;
    }
    public  static void main(String[] args){
        Car c = new Car();
        c.seats =  5;
        c.length = 3.99;
        c.name = "Rubicon";
        c.type = "SUV";
        change(c);
        System.out.println(c.seats);

    }

    private static void change(Car c) {
        c.seats = 7;
    }

}
