package OPPs._01_UserDefinedDataType;


import java.util.Scanner;
class Student{ // self data type.
  String name;
  int rno;
  double cgpa;

}

public class _01_Basics {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Student s1 = new Student();  // declaration
    s1.name = "Abhishek Moral";
    s1.rno = 12345678;
    s1.cgpa = 7.0;

    Student s2 = new Student();  // declaration
    s2.name = "Tanisha";
    s2.rno = 12345678;
    s2.cgpa = 9.0;

    Student s3  = new Student();  // declaration
    s3.name = " Chanchal";
    s3.rno = 12345678;
    System.out.println("Enter thr cgpa of chanchal : ");
    s3.cgpa = sc.nextDouble();
    System.out.println(s3.name+", "+s3.cgpa+", "+s3.rno);
    }
}
