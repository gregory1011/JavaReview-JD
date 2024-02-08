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

    }


    // write a method that takes a list of students and prints each student object and total count of students


}
