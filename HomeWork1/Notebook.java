package org.example;


import java.util.Random;

public class Notebook implements Comparable<Notebook>{
    private double price;
    private int ram;
    public Brand brand;

    public Notebook() {
        this.price = randomPrice();
        this.ram = randomRam();
        this.brand = randomBrand();
    }

    private static Random random = new Random();
    private static double[] prices = {100, 200, 300, 400, 500, 600, 700, 800};
    private static int[] listRam = {4, 8, 16, 20, 24, 28, 32};

    public static double randomPrice() {
        return prices[random.nextInt(0, prices.length)];
    }
    public static int randomRam() {
        return listRam[random.nextInt(0, listRam.length)];
    }
    public static Brand randomBrand() {
        int result=new Random().nextInt(Brand.values().length);
        return Brand.values()[result];
    }

    @Override
    public int compareTo(Notebook o) {
            if (this.price == o.price) {
                if (this.ram == o.ram)
                    return Integer.compare(this.brand.getId(),o.brand.getId());
                return Integer.compare(this.ram, o.ram);
            }
            return Double.compare(this.price, o.price);
        }
    @Override
    public String toString() {
        return "Производитель: " + brand +
                ", Цена: " + price +
                ", Память: " + ram;
    }

    public static void main(String[] args) {

    }
}
