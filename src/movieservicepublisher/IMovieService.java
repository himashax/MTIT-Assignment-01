package movieservicepublisher;

import java.util.List;

import model.Movie;

public interface IMovieService {

	public void addMovie(String movieName, String movieGenre, String releasedDate, double duration);
	public void viewMovieList();
	public void viewMovieDetails(String movieName);
	public void rateMovie();
}
