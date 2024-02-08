package review;

import java.util.List;

public class MyUtils<T> {

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






    public static void main(String[] args) {

//        MyUtils<Student> myUtils = new MyUtils<>();
//
//        myUtils.printInfo3();

//        MyUtils.returnLastElement()
    }
}
