package ru.makhmutov.lab.task2;

import java.lang.reflect.Method;
import java.util.Arrays;

public class ReflectionMain {

    /**
     * This program by using Reflection API prints the
     * interface of Code class (method headers, return value types
     * and parameter data types)
     *
     * @param args Array with parameters of the program
     */
    public static void main(String[] args) {
        Class<?> cls = Code.class;
        Method[] methods = cls.getDeclaredMethods();
        for (Method method : methods)
            System.out.println(method.getReturnType() + " "
                    + method.getName() + " "
                    + Arrays.toString(method.getParameterTypes()));
    }
}
