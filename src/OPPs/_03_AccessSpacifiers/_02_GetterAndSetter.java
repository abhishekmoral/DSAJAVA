package OPPs._03_AccessSpacifiers;

public class _02_GetterAndSetter {
    static class Students {
        String name;
        private int rno = 87;
        double cgpa;

        private void print() {  // getter
            System.out.println(name + ",    " + cgpa + ",   " + rno);

        }
        int getRno(){ // this is the getter of roll no.
            return rno;
        }
        void setRno(int x){ // setter
            rno = x;
        }

//   if all data is private and getter and setter is apply is known as Encapsulation

    }

    public static void main(String[] args) {
        Students s1 = new Students();
        s1.print();
        s1.cgpa = 8.9;
        s1.name = "Chanchal";
        System.out.println(s1.name);
        s1.print();
        Students s2 = new Students();
        s2.name = " Abhishek Moral";
        s2.cgpa = 7.0;
        s1.setRno(90);
        s1.print();


    }
}
