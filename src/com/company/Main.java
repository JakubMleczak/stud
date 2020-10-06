package com.company;
import javax.swing.JOptionPane;
public class Main {

    public static void main(String[] args) {
        //exc1
        System.out.println("Exc 1");
        int num1 = Integer.parseInt(
                JOptionPane.showInputDialog("NUMBER1:?"));
        int num2 = Integer.parseInt(
                JOptionPane.showInputDialog("NUMBER2:?"));
        System.out.println("SUM IS "+(num1+num2));
        System.out.println("Multiplication IS "+(num1*num2));
        System.out.println("Subtraction IS "+(num1-num2));
        System.out.println("Reminder IS "+(num1%num2));

        double division = (double) num1/num2;
        System.out.println("Division IS "+division);

        //exc2
        System.out.println("Exc 2");
        int x=4;
        int y=5;
        int z=(x++)+y;
        System.out.println("Sum of x and y is: "+ z);
        System.out.println(" x is: "+ x);
        int total  = x+y+z;
        System.out.println("Total is "+ total);
        total -= (--x);
        System.out.println("Total now is "+ total);

        //exc3
        System.out.println("Exc 3");
        int n=5814;
        System.out.print(" The digits of "+ n + " are :");
        while(n>0)
        {
            System.out.print(n%10+", ");
            n/=10;
        }
        System.out.println("");

        //exc4
        System.out.println("Exc 4");
        int fahrenheit = Integer.parseInt(
                JOptionPane.showInputDialog("Temp in fahrenheit:?"));
       double celsius = (5*(fahrenheit-32))/9.0;
        System.out.println("Temp in fahrenheit is " + fahrenheit + " It is "+ celsius + " in celsius");

        //exc5
        System.out.println("Exc 5");
        int chirps = Integer.parseInt(
                JOptionPane.showInputDialog("Number of chirps per min"));
        double temp = 40+chirps/4.0;
        System.out.println("For "+ chirps+ " chirps per min temp is "+ temp);


    }
}
