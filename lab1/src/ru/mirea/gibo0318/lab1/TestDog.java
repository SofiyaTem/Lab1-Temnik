package ru.mirea.gibo0318.lab1;

public class TestDog {
    public static void main(String[] args) {
        Dog d1 = new Dog("Holy", 3);
        Dog d2 = new Dog("Bob", 4);
        Dog d3 = new Dog("Jessy");
        d3.setAge(1);
        System.out.println(d1);
        d1.intoHumanAge();
        d2.intoHumanAge();
        d3.intoHumanAge();
    }
}
