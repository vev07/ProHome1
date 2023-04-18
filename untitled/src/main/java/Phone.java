import java.util.Scanner;

public class Phone {
    private String number;
    private String model;
    private double weight;

    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }


    public String getNumber() {
        return number;
    }

    public String getModel() {
        return model;
    }

    public double getWeight() {
        return weight;
    }
    public static void receiveCall(Phone samsung) {
        System.out.println("You are  having to coll from " + samsung.getModel());

    }
    public static void getNumber2(Phone samsung) {
        System.out.println("_________________");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name");
        String name = scanner.nextLine();

        System.out.println("You are calling " + name + ", him number is : " +
                samsung.getNumber());

    }

    public static String printInfo(Phone samsung) {
        String info = samsung.getNumber() + "; " + samsung.getModel() + "; " +
                samsung.getWeight() + ".";
        return info;
    }

    public static void main(String[] args) {
        Phone samsung = new Phone("+4915000000","S 22", 0.102);
        Phone samsungA51 = new Phone("+4915111111","A 51", 0.116);
        Phone samsungM33 = new Phone("+4915222222","M 33", 0.131);

        System.out.println(printInfo(samsung));
        System.out.println(printInfo(samsungA51));
        System.out.println(printInfo(samsungM33));

        receiveCall(samsung);
        receiveCall(samsungA51);
        receiveCall(samsungM33);

        getNumber2(samsung);
        getNumber2(samsungA51);
        getNumber2(samsungM33);

    }
}
