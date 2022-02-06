package com.company;

public class Main {

    private static ClassName className;

    public static final String[] validClassName = new String[] { "C0318G", "A0318H", "P0318I"};
    public static final String[] invalidClassName = new String[] { "M0318G", "P0323A", "P03253I", "A0318H" };

    public static void main(String args[]) {
        className = new ClassName();
        for (String name : validClassName) {
            boolean isvalid = className.validate(name);
            System.out.println("Class name is " + name +" is valid: "+ isvalid);
        }
        for (String name : invalidClassName) {
            boolean isvalid = className.validate(name);
            System.out.println("Class name is " + name +" is valid: "+ isvalid);
        }
    }
}
