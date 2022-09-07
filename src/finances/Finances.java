package finances;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Finances {
//    final static File file = new File("accounts.txt");
    static ArrayList<Account> accounts = new ArrayList<>();
    static Account account1;
    static Account contributionAccount;

    public static void main(String[] args) {
        account1 = new Account(0,0,0, "Рублёвый");
        contributionAccount = new Account(0,0,0, "Вклад");
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
                    selectAccount();
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
/** Возможнос стоит сделать вывод сразу баланса каждого счёта */
    static int selectAccount() {
        System.out.println("Выберите счёт: ");
        System.out.println("1 - Рублёвый.Основной");
        System.out.println("2 - Вклад");

        int accountScore;
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        switch (num) {
            case 1:
                accountScore = account1.getScore();
                break;
            case 2:
                accountScore = contributionAccount.getScore();
                break;

            default:
                System.out.println("Введите правильное значение");
                return selectAccount();
        }
        return accountScore;
    }


}
