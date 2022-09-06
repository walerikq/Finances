package finances;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Finances {
//    final static File file = new File("accounts.txt");

    public static void main(String[] args) {
        ArrayList<Account> accounts = new ArrayList<>();
        Account account1 = new Account(0,0,0);
        Account contributionAccount = new Account(0,0,0);
        accounts.add(0,account1);
        accounts.add(1,contributionAccount);
        menu(accounts);
    }

    public static void menu(List<Account> list) {
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("Выберите нужный пункт меню:");
            System.out.println("1 - Баланс");
            System.out.println("2 - Пополнить баланс");
            System.out.println("3 - Указать расходы");
            System.out.println("5 - Выписка по счёту");
            System.out.println("6 - Создать новый счёт");
            System.out.println("7 - Выбрать счёт");

            System.out.println("0 - Выход.");

            int num = in.nextInt();
            switch (num) {
                case 0:
                    System.exit(0);
                case 1:

                case 2:

                case 3:

                case 4:

                case 5:

                case 6:

                case 7:
                    printFigures(list);
            }
        }
    }
    /**
     * метод для вывода фигур из списка
     */
    static void printFigures(List<Account> accounts) {
        int i = 1;
        for (Account f : accounts) {
            System.out.println(i + ". " + f);
            i++;
        }
    }


}
