package com.hahs.sofkau.domain;

public class VideoGame implements IDeliverable {
    private String title;
    private double estimatedHours;
    private boolean delivered;
    private String genre;
    private String company;


    public VideoGame() {
        this.estimatedHours = 10;
        this.delivered = false;
    }

    public VideoGame(String title, double estimatedHours) {
        this.title = title;
        this.estimatedHours = estimatedHours;
        this.delivered = false;
    }

    public VideoGame(
            String title,
            double estimatedHours,
            boolean delivered,
            String genre,
            String company
    ) {
        this.title = title;
        this.estimatedHours = estimatedHours;
        this.delivered = delivered;
        this.genre = genre;
        this.company = company;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getEstimatedHours() {
        return estimatedHours;
    }

    public void setEstimatedHours(double estimatedHours) {
        this.estimatedHours = estimatedHours;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
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
        if(this.getEstimatedHours() < ((VideoGame) object).getEstimatedHours()) {
            return object;
        } else {
            return this;
        }
    }

    @Override
    public String toString() {
        return "VideoGame{" +
                "title='" + title + '\'' +
                ", estimatedHours=" + estimatedHours +
                ", delivered=" + delivered +
                ", genre='" + genre + '\'' +
                ", company='" + company + '\'' +
                '}';
    }
}
