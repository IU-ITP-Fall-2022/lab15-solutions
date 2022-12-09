package ru.makhmutov.lab.task2;

public class Code {

    // a private field
    private String value;

    // a public constructor
    public Code() { value = "Nothing is there yet"; }

    // getter for value
    public String getValue()  {
        return value;
    }

    // setter for value
    public void setValue(String newValue)  {
        value = newValue;
    }

    // private method
    private void printToTerminal() {
        System.out.println(value);
    }

}
