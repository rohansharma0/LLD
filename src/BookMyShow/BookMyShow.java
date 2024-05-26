package BookMyShow;

import java.util.ArrayList;
import java.util.List;

public class BookMyShow {

    MovieController movieController;
    TheatreController theatreController;

    BookMyShow(){
        movieController = new MovieController();
        theatreController = new TheatreController();
    }

    public static void main(String[] args) {
        BookMyShow bookMyShow = new BookMyShow();

        bookMyShow.initialize();

        //user1
        bookMyShow.createBooking(City.Bangalore , "Baahubali");
        //user2
        bookMyShow.createBooking(City.Bangalore , "Baahubali");
    }

    private void initialize() {
        createMovies();
        createTheatre();
    }

    private void createTheatre() {
        Movie avengerMovie = movieController.getMovieByName("Avengers");
        Movie baahubali = movieController.getMovieByName("Baahubali");

//        Theatre inoxTheatre = new Theatre();
//        inoxTheatre.setTheatreId(1);
//        inoxTheatre.setScreens(createScreen());
//        inoxTheatre.setCity(City.Bangalore);
//        List<Show> inoxShows = new ArrayList<>();
//        Show inoxMorningShow = createShows(1 , inoxTheatre.getScreens().get(0) , avengerMovie , 8);
//        Show inoxEveningShow = createShows(2 , inoxTheatre.getScreens().get(0) , baahubali , 16);
//        inoxShows.add(inoxMorningShow);
//        inoxShows.add(inoxEveningShow);
//        inoxTheatre.setShows(inoxShows);
//
//        Theatre prvTheatre = new Theatre();
//        prvTheatre.setTheatreId(1);
//        prvTheatre.setScreens(createScreen());
//        prvTheatre.setCity(City.Bangalore);
//        List<Show> pvrShows = new ArrayList<>();
//        Show pvrMorningShow = createShows(1 , inoxTheatre.getScreens().get(0) , avengerMovie , 8);
//        Show pvrEveningShow = createShows(2 , inoxTheatre.getScreens().get(0) , baahubali , 16);
//        pvrShows.add(pvrMorningShow);
//        pvrShows.add(pvrEveningShow);
//        prvTheatre.setShows(inoxShows);
    }

    private void createMovies() {

    }

    private void createBooking(City city , String movieName){

    }
}
