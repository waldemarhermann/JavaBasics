package Generics;

import java.util.List;
import java.util.ArrayList;

public class Generics {

    public static void main(String [] args) {

        Integer[] intArray = {1, 2, 3, 4};
        Double[] doubleArray = {1.2, 2.3, 3.4, 4.5};
        Character[] charArray = {'a', 'b', 'c', 'd'};

        GenClass<Double> generic = new GenClass();
        generic.setObject(2.5);
        System.out.println(generic.getObject().getClass());

        GenClass<String> generic1 = new GenClass<String>();
        generic1.setObject("Hi");
        generic1.getObject();
        System.out.println(generic1.getObject());

    }

    public static <T> void auslesen(T[] typeArray) {
        for (T type : typeArray) {
            System.out.println(type.getClass());
        }
    }

}
