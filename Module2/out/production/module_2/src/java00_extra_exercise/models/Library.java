package java00_extra_exercise.models;

import java00_extra_exercise.main.MainMenu;

public class Library {
    String idBook;
    String nameBook;
    String bookType;
    String author;
    String publishingYear;
    Double price;
    String description;

    public Library(String idBook, String nameBook, String bookType, String author, String publishingYear, Double price, String description) {
        this.idBook = idBook;
        this.nameBook = nameBook;
        this.bookType = bookType;
        this.author = author;
        this.publishingYear = publishingYear;
        this.price = price;
        this.description = description;
    }

    public Library() {

    }

    public String getIdBook() {
        return idBook;
    }

    public void setIdBook(String idBook) {
        this.idBook = idBook;
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public String getBookType() {
        return bookType;
    }

    public void setBookType(String bookType) {
        this.bookType = bookType;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(String publishingYear) {
        this.publishingYear = publishingYear;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Library{" +
                "idBook='" + idBook + '\'' +
                ", nameBook='" + nameBook + '\'' +
                ", bookType='" + bookType + '\'' +
                ", author='" + author + '\'' +
                ", publishingYear='" + publishingYear + '\'' +
                ", price='" + price + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    public String addInFile() {
        return idBook + MainMenu.COMA + nameBook + MainMenu.COMA +
                bookType + MainMenu.COMA + author + MainMenu.COMA +
                publishingYear + MainMenu.COMA + price + MainMenu.COMA + description;
    }
}
