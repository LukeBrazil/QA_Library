package com.qa.library;

public class Movie extends LibraryItem{
	private int movieLength;
	private String publisher;

	public Movie(String name, int condition, int movieLength, String publisher) {
		super(name, condition);
		this.movieLength = movieLength;
		this.publisher = publisher;
		// TODO Auto-generated constructor stub
	}


	public int getMovieLength() {
		return movieLength;
	}

	public void setMovieLength(int movieLength) {
		this.movieLength = movieLength;
	}


	public String getPublisher() {
		return publisher;
	}


	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}


	@Override
	public String toString() {
		return "Movie [movieLength=" + movieLength + ", publisher=" + publisher + ", getName()=" + getName()
				+ ", getId()=" + getId() + ", getCondition()=" + getCondition() + "]";
	}
	
}
