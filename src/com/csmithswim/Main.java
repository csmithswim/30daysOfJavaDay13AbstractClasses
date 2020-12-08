package com.csmithswim;
import java.util.*;

abstract class Book {
        String title;
        String author;

        Book(String title, String author) {
        this.title = title;
        this.author = author;
        }

abstract void display();
        }

// Declare your class here. Do not use the 'public' access modifier.
class MyBook extends Book{

    protected int price;

    MyBook(String title, String author, int price){
        super(title, author);
        this.title=title;
        this.author=author;
        this.price=price;
    }
    void display(){
        System.out.println("Title: "+title+"\nAuthor: "+author+"\nPrice: "+price);
    }

}
// Declare the price instance variable

/**
 *   Class Constructor
 *
 *   @param title The book's title.
 *   @param author The book's author.
 *   @param price The book's price.
 **/
// Write your constructor here

/**
 *   Method Name: display
 *
 *   Print the title, author, and price in the specified format.
 **/
// Write your method here

// End class

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String title = scanner.nextLine();
        String author = scanner.nextLine();
        int price = scanner.nextInt();
        scanner.close();

        Book book = new MyBook(title, author, price);
        book.display();
    }
}