package review;

import java.util.ArrayList;
import java.util.List;

public class MyUtils<T extends Person> {

    public void printInfo3(List<T> personList) {

        for (T person : personList) {

            System.out.println(person);
        }

        System.out.println(personList.size());
    }


    public T returnLastElement(List<T> personList) {

        return personList.get(personList.size() - 1);
    }


    // write a method that takes a list of objects and prints everyone's names one by one

    public void printNames(List<T> personList) {

        for (T person : personList) {

            System.out.println(person.getName());
        }
    }


    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student("Mike", 101));
        studentList.add(new Student("Joe", 102));
        studentList.add(new Student("Max", 103));

        MyUtils<Student> myUtils = new MyUtils<>();

        myUtils.printNames(studentList);
        myUtils.printInfo3(studentList);

//        MyUtils.returnLastElement()
    }
}
