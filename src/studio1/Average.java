package studio1;

import support.cse131.ArgsProcessor;

public class Average {

    public static void main(String[] args) {

        ArgsProcessor ap = new ArgsProcessor(args);
        int n1 = ap.nextInt("First number to be averaged?");
        int n2 = ap.nextInt("Second number to be averaged?");

        double average = (double) ( n1 + n2 ) / 2;

        System.out.println(average);
    }
}
