package machine;

import java.util.Scanner;

public class UserInterface {

    private Scanner scanner;

    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
    }

    int water = 400;
    int milk = 540;
    int coffeeBeans = 120;
    int coffee = 9;
    int money = 550;

    MachineManager machine = new MachineManager(water, milk, coffeeBeans, coffee, money);
    Scanner sc = new Scanner(System.in);
    public void start() {
        while (true) {

            System.out.println("Write action (buy, fill, take, remaining, exit):");
            String command = scanner.nextLine();
            System.out.println();
            if (command.equals("exit")) {
                break;
            }

            if (command.contains("buy")) {
                System.out.println("What do you want to buy? 1 - " +
                        "espresso, 2 - latte, 3 - cappuccino:");
                String buy = scanner.nextLine();
                System.out.println();
                machine.haveResources();
                if (buy.equals("1")) {
                    machine.buyEspresso();
                }
                if (buy.equals("2")) {
                    machine.buyLatte();

                }
                if (buy.equals("3")) {
                    machine.buyCappuccino();
                }

            }

            if (command.equals("fill")) {
                System.out.println("Write how many ml of water do you want to add:");
                int water = sc.nextInt();

                System.out.println("Write how many ml of milk do you want to add:");
                int milk = sc.nextInt();

                System.out.println("Write how many grams of coffee beans do you want to add:");
                int coffeeBeans = sc.nextInt();

                System.out.println("Write how many disposable cups of coffee do you want to add:");
                int coffee = sc.nextInt();
                machine.fillMachine(water, milk, coffeeBeans, coffee);

            }
            if (command.equals("take")) {
                System.out.println("I gave you " + "$" + machine.getMoney());
                machine.takeFrom();
            }

            if (command.equals("remaining")) {
                System.out.println(machine);
            }
        }
    }
}



