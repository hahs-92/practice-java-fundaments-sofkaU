package com.hahs.sofkau.domain;

public class Series  implements IDeliverable{
    private String title;
    private int seasonsNumber;
    private boolean delivered;
    private String author;


    public Series() {
        this.seasonsNumber = 3;
        this.delivered = false;
    }

    public Series(String title, String author) {
        this.title = title;
        this.author = author;
        this.seasonsNumber = 3;
        this.delivered = false;
    }

    public Series(String title, int seasonsNumber, boolean released, String author) {
        this.title = title;
        this.seasonsNumber = seasonsNumber;
        this.delivered = released;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getSeasonsNumber() {
        return seasonsNumber;
    }

    public void setSeasonsNumber(int seasonsNumber) {
        this.seasonsNumber = seasonsNumber;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }


    @Override
    public void deliver() {
        this.delivered = true;
    }

    @Override
    public void giveBack() {
        this.delivered = false;
    }

    @Override
    public boolean isDelivered() {
        return this.delivered;
    }


    @Override
    public IDeliverable compareTo(IDeliverable object) {
        if(this.getSeasonsNumber() < ((Series) object).getSeasonsNumber()) {
            return object;
        } else {
            return this;
        }
    }

    @Override
    public String toString() {
        return "Series{" +
                "title='" + title + '\'' +
                ", seasonsNumber=" + seasonsNumber +
                ", released=" + delivered +
                ", author='" + author + '\'' +
                '}';
    }
}
