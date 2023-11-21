import java.util.Scanner;
class Student{
    int rollno;
    String name;
    Student(int rollno, String name){
        this.rollno=rollno;
        this.name=name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollno=" + rollno +
                ", name='" + name + '\'' +
                '}';
    }
}
public class StudentTest{
    public static void main(String[] args){
        Student s1 = new Student(101, "Shreya");
        Student s2 = new Student(102,"happy");
        Student s3 = new Student(103,"laddu");
        Student[] students = new Student[3];
        students[0]=s1;
        students[1]=s2;
        students[2]=s3;


        for(int i=0; i<students.length; i++){
            System.out.println(students[i]);
        }
      //  System.out.println(Student[name]);
    }
}