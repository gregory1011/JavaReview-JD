package review;

import java.util.List;

public class MyUtils {

    public static <T> void printInfo3(List<T> personList) {

        for (T person : personList) {

            System.out.println(person);
        }

        System.out.println(personList.size());
    }


    public static <T> T returnLastElement(List<T> personList) {

        return personList.get(personList.size() - 1);
    }
}
