package finances;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Finances {
//    final static File file = new File("accounts.txt");
    static ArrayList<Account> accounts = new ArrayList<>();
    static Account account1;
    static Account contributionAccount;

    public static void main(String[] args) throws InterruptedException {
        account1 = new Account(70000,0,32000, "Рублёвый");
        contributionAccount = new Account(100000,45325,0, "Вклад");
        accounts.add(0,account1);
        accounts.add(1,contributionAccount);
        menu(accounts);
    }

    public static void menu(List<Account> list) throws InterruptedException {
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
                    System.out.println(selectAccount().getScore() + "\n");
                    Thread.sleep(1000);
                    break;
                case 2:

                case 3:

                case 4:

                case 5:

                case 6:

                case 7:
                    printFigures(list);
                    break;
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
    static Account selectAccount() {
        System.out.println("Выберите счёт: ");
        System.out.println("1 - Основной");
        System.out.println("2 - Вклад");

        Account accountChoise;
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        switch (num) {
            case 1:
                accountChoise = account1;
                break;
            case 2:
                accountChoise = contributionAccount;
                break;
            default:
                System.out.println("Введите правильное значение");
                return selectAccount();
        }
        return accountChoise;
    }


}
