package task4;

import java.util.Formatter;

public class Receipt {
    private double total = 0;
    private Formatter formatter = new Formatter(System.out);

    public void printTitle(int length) {
        formatter.format("%-" + length*3 + "s %" + length + "s %"+ length*2 + "s\n", "Item", "Qty", "Price");
        formatter.format("%-" + length*3 + "s %" + length + "s %"+ length*2 + "s\n", "----", "---", "-----");
    }

    public void print(String item, int qty, double price, int lenth) {
        formatter.format("%-" + lenth*3 + "." + lenth*3 + "s %" + 5 + "d %" + lenth*2 + ".2f\n", item, qty, price);
        total += price;
    }

    public void printTotal(int length) {
        formatter.format("%-" + 3*length + "s %" + length + "s %" + 2*length + ".2f\n",  "Tax", "", total * 0.6);
        formatter.format("%-" + 3*length + "s %" + length + "s %" + 2*length + ".2s\n", "", "", "-----");
        formatter.format("%-" + 3*length + "s %" + length + "s %" + 2*length + ".2f\n", "Total", "", total * 1.06);
    }

    public static void main(String[] args) {
        int length = 5;
        Receipt receipt = new Receipt();
        receipt.printTitle(length);
        receipt.print("Jack's Magic Beans", 4, 4.25, length);
        receipt.print("Princess Peas", 3, 5.1, length);
        receipt.print("Three Bears Porridge", 1, 14.29, length);
        receipt.printTotal(length);
    }
}
