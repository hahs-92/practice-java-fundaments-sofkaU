package com.hahs.sofkau.main;

import com.hahs.sofkau.domain.IDeliverable;
import com.hahs.sofkau.domain.Series;
import com.hahs.sofkau.domain.VideoGame;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestSeries {
    public static void main(String[] args) {

        //1 - 2
        IDeliverable[] series = {
                new Series("GameOfThrones",10,true,"R.Martin"),
                new Series("Arcane",1,true,"LOL"),
                new Series("Vikings",6,false,"Racknac"),
                new Series("HowMetYourMother",12,false,"N.N"),
                new Series("PeakBlinders",5,false,"Jhon")
        };

        IDeliverable[] videoGames = {
                new VideoGame("Uncharted", 12,true, "Aventure","NaugthyDog"),
                new VideoGame("The Last Of Us", 15,true, "Action","NaugthyDog"),
                new VideoGame("Bloodborne", 50,false, "ARPG","FromSoftware"),
                new VideoGame("The Witchwer 3", 350,true, "RPG","CD Projekt Red"),
                new VideoGame("Red Dead Redemption 2 ", 250,false, "Aventure","Rock Star")
        };

        //3 - entregar algunos video juegos y series
        series[3].deliver();
        videoGames[2].deliver();


        //4 - numero de video juegos entregados
        int videoGamesDelivered = (int) Arrays.stream(videoGames)
                .filter(IDeliverable::isDelivered) //videoGame -> videoGame.isDelivered()
                .count();

        //numero de series entregadas
        int seriesDelivered = (int) Arrays.stream(videoGames)
                .filter(IDeliverable::isDelivered)
                .count();


        //5 -devolver los no entregados
        Arrays.stream(videoGames).forEach(videoGame -> {
            if(videoGame.isDelivered()) {
                videoGame.giveBack();
            }
        });

        Arrays.stream(series).forEach(s -> {
            if(s.isDelivered()) {
                s.giveBack();
            }
        });

        // 6 - series y video juegos con la mayor temporada | numero de horas estimadas
        IDeliverable seriesMostSeasons = Arrays.stream(series).reduce(IDeliverable::compareTo).get();
        IDeliverable videoGameMostHours = Arrays.stream(videoGames).reduce(IDeliverable::compareTo).get();


        //ouput
        System.out.println("El numero de series entregadas es :" +  seriesDelivered);
        System.out.println("El numero de JUegos entregados es : " +  videoGamesDelivered);

        System.out.println("La serie con mas temporadas es : " + seriesMostSeasons);
        System.out.println("El video juego con mas horas estimadas es :" + videoGameMostHours);
    }
}
