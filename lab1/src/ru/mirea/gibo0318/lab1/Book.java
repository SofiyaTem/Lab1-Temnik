package ru.mirea.gibo0318.lab1;

public class Book {
    private String author;
    private int price;

    public Book(String a, int p) {
        author = a;
        price = p;
    }

    public Book(String a) {
        author = a;
        price = 0;
    }
    public Book() {
        author = "Bulgakov";
        price = 200;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor(String author) {
        return author;
    }

    public int getPrice() {
        return price;
    }

    public String toString() {
        return this.author + " book has a price in " + this.price;
    }

    public void DiscountAmount() {
        System.out.println("The book whose author is " + author + " has a discount amount " + (price*10)/100);
}
}