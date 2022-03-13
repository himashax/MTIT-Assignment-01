package model;

import java.util.Date;

public class Movie {
	
	private int movieID;
	private String movieName;
	private String movieGenre;
	private String releasedDate;
	private double duration;
	
	public Movie() {}

	public Movie(int movieID, String movieName, String movieGenre, String releasedDate, double duration) {
		super();
		this.movieID = movieID;
		this.movieName = movieName;
		this.movieGenre = movieGenre;
		this.releasedDate = releasedDate;
		this.duration = duration;
	}

	public int getMovieID() {
		return movieID;
	}

	public void setMovieID(int movieID) {
		this.movieID = movieID;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getMovieGenre() {
		return movieGenre;
	}

	public void setMovieGenre(String movieGenre) {
		this.movieGenre = movieGenre;
	}

	public String getReleasedDate() {
		return releasedDate;
	}

	public void setReleasedDate(String releasedDate) {
		this.releasedDate = releasedDate;
	}

	public double getDuration() {
		return duration;
	}

	public void setDuration(double duration) {
		this.duration = duration;
	}
	
	@Override
	public String toString() {
		return "Movie [movieID=" + movieID + ", movieName=" + movieName + ", movieGenre=" + movieGenre
				+ ", releasedDate=" + releasedDate + ", duration=" + duration + "]";
	}
	
}
