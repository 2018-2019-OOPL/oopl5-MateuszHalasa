/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl5;

/**
 *
 * @author student
 */
public class book {

    private final String title;
    private final String author;
    private final int pages;
    private final int year;
    public int price;

    public book(String t, String a, int pa, int y, int pr) {
        title = t;
        author = a;
        pages = pa;
        year = y;
        price = pr;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPages() {
        return pages;
    }

    public int getYear() {
        return year;
    }

    public int getPrice() {
        return price;
    }
}
