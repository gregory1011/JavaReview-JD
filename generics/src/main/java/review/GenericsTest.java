package review;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest {

    public static void main(String[] args) {


        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student("Mike", 101));
        studentList.add(new Student("Joe", 102));
        studentList.add(new Student("Max", 103));


        List<Teacher> teacherList = new ArrayList<>();


        teacherList.add(new Teacher("Eric", 201));
        teacherList.add(new Teacher("David", 202));

        printInfo(studentList);
//        printInfo(teacherList);
    }


    // write a method that takes a list of students and prints each student object and total count of students

    public static void printInfo(List<Student> studentList){

        for (Student student : studentList) {

            System.out.println(student);
        }

        System.out.println(studentList.size());

    }

    public static void printInfo2(List<Teacher> teacherList){

        for (Teacher teacher : teacherList) {

            System.out.println(teacher);
        }

        System.out.println(teacherList.size());
    }

}
