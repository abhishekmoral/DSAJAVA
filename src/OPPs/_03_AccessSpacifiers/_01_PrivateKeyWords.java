package OPPs._03_AccessSpacifiers;

class Students {
    String name;
    private int rno = 87;
    double cgpa;

   private void print() {  // function can be private.
        System.out.println(name + ",    " + cgpa + ",   " + rno);

    }
    public void  P(){
        print();
    }


}

public class _01_PrivateKeyWords {

    public static void main(String[] args) {
        Students s1 = new Students();
        s1.P();
        s1.cgpa = 8.9;
        s1.name = "Chanchal";
        System.out.println(s1.name);
        s1.P();
        Students s2 = new Students();
        s2.name = " Abhishek Moral";
        s2.cgpa = 7.0;
        s2.P();

    }
}
