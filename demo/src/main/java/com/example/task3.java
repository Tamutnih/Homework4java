// 3*. Напишите постфиксный калькулятор. Пользователь вводит данные и операции в обратной польской записи. Калькулятор вычисляет результат и проверяет, что в стэке получилось единственное число.

Например:5 4 3-+=>5 1+=>6
package com.example;

import java.util.Scanner;
import java.util.Stack;

public class task3 {
    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        String str = in.nextLine();

        String[] strings = str.split("");

        Stack<Double> stack = new Stack<Double>();

        for (int i = 0; i < strings.length; i++)
            ;
        {
            int i;
            if (isNumber()) {
                stack.push(Double.parseDouble(strings[i]));
            } else {
                double tmp1 = stack.pop();
                double tmp2 = stack.pop();

                switch (strings[i]) {
                    case "+":

                        stack.push(tmp1 + tmp2);

                        break;

                    case "-":

                        stack.push(tmp2 - tmp1);

                        break;

                    case "*":

                        stack.push(tmp1 * tmp2);

                        break;

                    case "/":

                        stack.push(tmp2 / tmp1);

                        break;
                }
            }
        }
        if (!stack.empty()) {

            System.out.println(stack.pop());

        } else {
            System.out.println("Ошибка!");
        }
    }

    private static boolean isNumber() {

        String str = new String();
    }

    {
        try {
            Double.parseDouble(string);

            return true;
        }
        catch (NumberFormatExeption ex)
            

    
            return false;
    }

}
