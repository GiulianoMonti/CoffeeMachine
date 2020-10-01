package machine;

public class MachineManager {
    private int coffee = 0;
    private int water = 400;
    private int milk = 540;
    private int coffeeBeans = 120;
    private int money = 550;
    private boolean have;
    private boolean haveMilk;
    private boolean haveWater;
    private boolean haveCoffeeBeans;
    private boolean haveCoffee;


    public MachineManager(int water, int milk, int coffeeBeans, int coffee, int money) {
        this.water = water;
        this.milk = milk;
        this.coffeeBeans = coffeeBeans;
        this.coffee = coffee;
        this.money = money;
        this.have = true;
        this.haveMilk = true;
        this.haveWater = true;
        this.haveCoffeeBeans = true;
        this.haveCoffee = true;
    }


    public int getCoffee() {
        return coffee;
    }

    public int getWater() {
        return water;
    }

    public int getMilk() {
        return milk;
    }

    public int getCoffeeBeans() {
        return coffeeBeans;
    }

    public int getMoney() {
        return money;
    }

    public void haveResources() {
        int w = this.water / 200;
        int m = this.milk / 50;
        int c = this.coffeeBeans / 15;


        int minimal = Math.min(w, Math.min(m, c));

        if (minimal <= this.coffee) {
            have = true;
        }
        if (this.water < 200) {
            haveWater = false;
            have = false;
        }
        if (this.milk < 75) {
            haveMilk = false;
            have = false;

        }
        if (this.coffeeBeans < 12) {
            haveCoffeeBeans = false;
            have = false;

        }


    }

    public void buyEspresso() {
        if (have) {
            System.out.println("I have enough resources, making you a coffee!");
            this.water = water - 250;
            this.coffeeBeans = coffeeBeans - 16;
            this.money = this.money + 4;
            this.coffee = coffee - 1;
        }
        if (!haveWater) {
            System.out.println("Sorry, not enough water");
        }
        if (!haveMilk) {
            System.out.println("Sorry, not enough milk");

        }
        if (!haveCoffeeBeans) {
            System.out.println("Sorry, not enough coffeeBeans");

        }
        if (!haveCoffee){
            System.out.println("Not enough disposable cups!");
        }
    }

    public void buyLatte() {
        if (have) {
            System.out.println("I have enough resources, making you a coffee!");
            this.water = water - 350;
            this.milk = milk - 75;
            this.coffee = coffee - 1;
            this.money = this.money + 7;
            this.coffeeBeans = coffeeBeans - 20;
        }
        if (!haveWater) {
            System.out.println("Sorry, not enough water");
        }
        if (!haveMilk) {
            System.out.println("Sorry, not enough milk");

        }
        if (!haveCoffeeBeans) {
            System.out.println("Sorry, not enough coffeeBeans");

        }
        if (!haveCoffee){
            System.out.println("Not enough disposable cups!");
        }
    }

    public void buyCappuccino() {
        if (have) {
            System.out.println("I have enough resources, making you a coffee!");
            this.water = water - 200;
            this.milk = milk - 100;
            this.coffeeBeans = coffeeBeans - 12;
            this.money = money + 6;
            this.coffee = coffee - 1;
        }
        if (!haveWater) {
            System.out.println("Sorry, not enough water");
        }
        if (!haveMilk) {
            System.out.println("Sorry, not enough milk");

        }
        if (!haveCoffeeBeans) {
            System.out.println("Sorry, not enough coffeeBeans");

        }
        if (!haveCoffee){
            System.out.println("Not enough disposable cups!");
        }

    }

    public void fillMachine(int water, int milk, int coffeeBeans, int coffee) {
        if (water >= 200) {
            this.water += water;
            haveWater = true;
        }
        if (milk >= 75) {
            this.milk += milk;
            haveMilk = true;
        }
        if (coffeeBeans >= 12) {
            haveCoffeeBeans = true;
            this.coffeeBeans += coffeeBeans;
        }
        if (coffee > 0) {
            haveCoffee = true;
            this.coffee += coffee;
        }
    }


    public void takeFrom() {
        this.money = 0;
    }


    @Override
    public String toString() {


        return "The coffee machine has:" + "\n" +
                this.water + " of water" + "\n" +
                this.milk + " of milk" + "\n" +
                this.coffeeBeans + " of beans" + "\n" +
                this.coffee + " of disposable cups" + "\n" +
               "$"+ this.money + " of money" + "\n";

    }
}
