package com.connect.model;

import java.util.Date;

public class Movie {
	private int movie_id;
	private String movie_name;
	private Date release_date;
	public int getMovie_id() {
		return movie_id;
	}
	public void setMovie_id(int movie_id) {
		this.movie_id = movie_id;
	}
	public String getMovie_name() {
		return movie_name;
	}
	public void setMovie_name(String movie_name) {
		this.movie_name = movie_name;
	}
	public Date getRelease_date() {
		return release_date;
	}
	public void setRelease_date(Date release_date) {
		this.release_date = release_date;
	}
	public Movie(int movie_id, String movie_name, Date release_date) {
		super();
		this.movie_id = movie_id;
		this.movie_name = movie_name;
		this.release_date = release_date;
	}
	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	} 
	
}
