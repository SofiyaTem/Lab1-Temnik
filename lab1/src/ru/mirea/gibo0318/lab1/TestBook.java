package ru.mirea.gibo0318.lab1;

public class TestBook {
    public static void main(String[] args) {
        Book b1 = new Book("Dostoevsky", 340);
        Book b2 = new Book("Pushkin", 250);
        Book b3 = new Book("Lermontov");
        b3.setPrice(290);
        System.out.println(b1);
        b1.DiscountAmount();
        b2.DiscountAmount();
        b3.DiscountAmount();
    }
}
