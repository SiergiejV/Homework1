package by.itacademy.hw10.Task3;
import java.util.Stack;
public class Task3 {
    public static void main(String[] args)
    {
        Stack<String> stack = new Stack<String>();

        stack.push("30");
        stack.push("6");
        stack.push("2");
        stack.push("26");
        stack.push("19");
        stack.push("5");
        stack.push("15");
        stack.push("11");


        System.out.println("Размер стека " + stack.size());

        System.out.println("Верхний элемент " + stack.peek());


        stack.pop();

        System.out.println("Размер стека " + stack.size());

        System.out.println("Верхний элемент " + stack.peek());

    }
}


