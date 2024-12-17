package hwk_27.seasons;

/**
 * Author Waldemar Ilz
 * {code data} 14.12.2024
 */

public class SeasonApp {
    public static void main(String[] args) {
        for (Seasons season : Seasons.values()){
            System.out.println("Seasons: " + season);
            System.out.println("seasons.getRussianName(): " + season.getRussianName());
            System.out.println("seasons.getAverageTemperature: " + season.seasonsMethod());
            System.out.println(season.seasonsMethod());
            System.out.println("\n===================\n");


        }
    }
}
