package BookMyShow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TheatreController {
    Map<City, List<Theatre>> cityVsTheatre;
    List<Theatre> allTheatre;

    TheatreController() {
        cityVsTheatre = new HashMap<>();
        allTheatre = new ArrayList<>();
    }

    void addTheatre(Theatre theatre, City city) {
        allTheatre.add(theatre);
        List<Theatre> theatres = cityVsTheatre.getOrDefault(city, new ArrayList<>());
        theatres.add(theatre);
        cityVsTheatre.put(city, theatres);
    }

//    Map<Theatre, List<Show>> getAllShow(Movie movie, City city) {
//        Map<Theatre, List<Show>> theatreVsShows = new HashMap<>();
//        List<Theatre> theatres = cityVsTheatre.get(city);
//        for (Theatre theatre : theatres) {
//
//        }
//    }
}
