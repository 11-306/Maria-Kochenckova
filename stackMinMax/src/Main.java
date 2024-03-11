

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackMinMax s = new StackMinMax(10);

        s.push(3);
        System.out.println("макс: " + s.getMax());
        System.out.println("мин: " + s.getMin());
        s.push(8);
        System.out.println("макс: " + s.getMax());
        System.out.println("мин: " + s.getMin());
        s.push(1);
        System.out.println("макс: " + s.getMax());
        System.out.println("мин: " + s.getMin());
        s.push(5);
        System.out.println("макс: " + s.getMax());
        System.out.println("мин: " + s.getMin());
        s.push(9);
        System.out.println("макс: " + s.getMax());
        System.out.println("мин: " + s.getMin());

        s.pop();

        System.out.println("макс: " + s.getMax());
        System.out.println("мин: " + s.getMin());

        System.out.println("последний элемент: " + s.lastElem());

        s.pop();
        s.pop();

        System.out.println("последний элемент: " + s.lastElem());
    }
}