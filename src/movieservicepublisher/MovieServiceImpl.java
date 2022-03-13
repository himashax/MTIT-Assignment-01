package movieservicepublisher;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import model.Movie;

public class MovieServiceImpl implements IMovieService{

	List<Movie> movieList = new ArrayList<Movie>();
	
	@Override
	public void addMovie(String movieName, String movieGenre, String releasedDate, double duration) {
		
		int movieID = 0;
		
		if(!movieList.isEmpty()) {
			movieID = movieList.size() + 1;
		}else {
			movieID = 1;
		}
		
		movieList.add(new Movie(movieID, movieName, movieGenre, releasedDate, duration));
		System.out.println("Movie added succesfully to the list");
	}
	
	@Override
	public void viewMovieList() {
		
	System.out.println("========================== Movie List ==========================");
	for(int i=0;i<movieList.size();i++) {
		System.out.println("Title: " + movieList.get(i).getMovieName().toUpperCase());
		System.out.println("Genre: " + movieList.get(i).getMovieGenre());
		System.out.println("Released Date: " + movieList.get(i).getReleasedDate());
		System.out.println("Duration: " + movieList.get(i).getDuration());
		System.out.println("----------------------------");
	}	
	}

	@Override
	public void viewMovieDetails(String movieName) {
		
		Movie selectedMovie = new Movie();
		
		for(int i=0;i<movieList.size();i++) {
			if(movieList.get(i).getMovieName().equals(movieName)) {
				selectedMovie = movieList.get(i);
			}
		}
		
		System.out.println("Title: " + selectedMovie.getMovieName().toUpperCase());
		System.out.println("Genre: " + selectedMovie.getMovieGenre());
		System.out.println("Released Date: " + selectedMovie.getReleasedDate());
		System.out.println("Duration: " + selectedMovie.getDuration());
	}

	@Override
	public void rateMovie() {
		System.out.println("hi");
		
	}

	

	
	
	
	 

}
