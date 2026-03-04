package OPPs._03_AccessSpacifiers;
class Students{
    String name;
    private int rno;
    double cgpa;

}

public class _01_PrivateKeyWords {

    public static void main(String[] args){
        Students  s1 = new Students();
        s1.cgpa = 8.9;
        s1.name = "Chanchal";
        System.out.println(s1.name);


    }
}
