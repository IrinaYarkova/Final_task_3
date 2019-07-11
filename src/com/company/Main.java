package com.company;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("-$- Конвертер валют -$-");
        System.out.print("Введите курс доллара: ");
        float DollarRate = in.nextFloat();

        System.out.print("Введите колличество рублей: ");
        float Sum = in.nextFloat();

        float DollarSum = Sum / DollarRate;

        System.out.println(String.format("Итог: %(.2f$", DollarSum));
        in.close();
    }
}