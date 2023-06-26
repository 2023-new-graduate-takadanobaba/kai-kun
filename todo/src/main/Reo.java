package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// import javax.sql.rowset.spi.SyncResolver;

public class Reo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("名前を入力してください");
        String input = scanner.nextLine();
        System.out.println("こんにちは" + input + "さん");
        List<String> reoList = new ArrayList<>();

        while (true) {
            System.out.println("好きな食べ物を入力してください");
            String food = scanner.nextLine();
            if (food.isEmpty()) {
                break;

            }
            reoList.add(food);
        }
        if (!reoList.isEmpty()) {
            System.out.print("好きな食べ物は");
            for (int i = 0; i < reoList.size(); i++) {
                System.out.print(reoList.get(i));
                if (i < reoList.size() - 1) {
                    System.out.print("と");
                }

            }
            System.out.print("です");
        }
    }
}
