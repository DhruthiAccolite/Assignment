package com.connect.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.connect.model.Movie;

@Repository
public class Customer implements CustomerInterface {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Override
	public List<Movie> viewCustomers() {
		
			return jdbcTemplate.query("select * from movie",(rs,i)->{
				return new Movie(rs.getInt("movie_id"),
						rs.getString("name"),
						rs.getDate("release_date")
						);
			});
		}
	}

