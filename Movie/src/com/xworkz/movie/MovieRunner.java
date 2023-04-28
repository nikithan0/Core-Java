package com.xworkz.movie;

import com.xworkz.movie.dao.MovieDao;
import com.xworkz.movie.dto.MovieDto;

public class MovieRunner {

	public static void main(String[] args) {
		MovieDao dao = new MovieDao();
		
		MovieDto dao1 = new MovieDto("Beast","Pooja","Vijay",1500000000, "Nelson", 250L);
		dao.create(dao1);
		
		MovieDto dao2 = new MovieDto("Sita ramam", "Mrunal Thakur", "Dulquer Salmaan", 1345600, "Vishal Chandrashekar", 98L);
		dao.create(dao2);
		
		MovieDto dao3 = new MovieDto(null, "Keerthi ", "Vijay", 12000000, "Atlee Kumar", 150L);
		dao.create(dao3);
		
		
		
		MovieDto[] info = dao.readInfo();
		for(int i=0; i<info.length; i++) {
			if(info[i]!=null) {
			System.out.println(info[i]);
			}
		}
		
	}

}
