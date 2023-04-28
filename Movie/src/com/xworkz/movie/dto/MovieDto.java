package com.xworkz.movie.dto;

public class MovieDto {
	private String movieName;
	private String heroine;
	private String heroName;
	private int budget;
	private String director;
	private long collection;
	
	

	public MovieDto(String movieName, String heroine, String heroName, int budget, String director, long collection) {
	    super();
		this.movieName = movieName;
		this.heroine = heroine;
		this.heroName = heroName;
		this.budget = budget;
		this.director = director;
		this.collection = collection;
	}
	
	@Override
	public String toString() {
		return "MovieDto [movieName=" + movieName + ", heroine=" + heroine + ", heroName=" + heroName + ", budget="
				+ budget + ", director=" + director + ", collection=" + collection + "]";
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getHeroine() {
		return heroine;
	}

	public void setHeroine(String heroine) {
		this.heroine = heroine;
	}

	public String getHeroName() {
		return heroName;
	}
	
	public void setHeroName(String heroName) {
		this.heroName = heroName;
	}

	public int getBudget() {
		return budget;
	}

	public void setBudget(int budget) {
		this.budget = budget;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public long getCollection() {
		return collection;
	}

	public void setCollection(long collection) {
		this.collection = collection;
	}
	
	
}
