package main.java;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Suzi {
    public static void main(String[] args) throws Exception {
        System.out.println("数字を入力してください");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        try {
            double number = Double.parseDouble(str);
            System.out.println(number);
        } catch (NumberFormatException e) {
            System.out.println("数字以外が入力されました");

        }
    }
}
