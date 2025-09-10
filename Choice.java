package duke;

import java.util.Arrays;

public class choice {

    public static void main(String[] args) {

        double tax = 0.2;

        System.out.println("Hello duke Shop App");

        System.out.println("Minimum price is : " + Clothing.minPrice);

        Customer C1;
        C1 = new Customer("Pinky", 3);

        Clothing item1 = new Clothing("blue jacket", 20.9, "M");
        Clothing item2 = new Clothing("Orange T-shirt", 9.5, "S");

        Clothing[] items = {item1, item2, new Clothing("green scarf", 5, "S"), new Clothing("Blue T-Shirt", 10.5, "S")};

        int measurement = 3;

        C1.addItems(items);

        System.out.println("Customer is " + C1.getName() + ", he wears '" + C1.getSize() + "'. ");
        for (Clothing item : C1.getItems()) {
            //System.out.println("items: " + item.getDescription() + ", " + item.getSize() + ", " + item.getPrice());
            System.out.println("item" + item);
        }

        System.out.println("total is " + C1.getTotalClothingCost());

        int average = 0;
        int count = 0;

        for (Clothing item : C1.getItems()) {
            if (item.getSize().equals("L")) {
                count++;
                average += item.getPrice();
            }
        }

        Arrays.sort(C1.getItems());

        for (Clothing item : C1.getItems()) {
            //System.out.println("items: " + item.getDescription() + ", " + item.getSize() + ", " + item.getPrice());
            System.out.println("item" + item);

        }
    }
}
