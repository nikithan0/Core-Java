package com.xworkz.movie.dao;

import com.xworkz.movie.dto.MovieDto;

public class MovieDao {
	
	MovieDto[] info = new MovieDto[9];
	 
	public boolean create (MovieDto movie) {
		if(movie != null ) {
		if(movie.getMovieName()!=null && movie.getHeroine()!=null) {
			System.out.println("The names are valid");
			
			if(movie.getMovieName().length()>3 && movie.getHeroine().length()>2) {
				System.out.println("The given sapce is valid ");
				
			for(int i=0; i<info.length; i++) {
				if(info[i] == null) {
					info[i] = movie;
					System.out.println("The name is created");
					return true;
				}
			}
				System.out.println("Name is not created");
				return false;
			} 
					System.out.println("The space is not valid");				
		}	
	}
		System.out.println("The names are not valid");
		return false;
	}
		
		public MovieDto[] readInfo() {
			return info;
		}
			
}
