package com.techleads.app.lamda;

import java.util.List;

public class Movie {

	
	private String name;
	private String director;
	private String producer;
	private String result;
	
	
	public Movie(String name, String result) {
		super();
		this.name = name;
		this.result = result;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public Movie(String name, String director, String producer) {
		super();
		this.name = name;
		this.director = director;
		this.producer = producer;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getProducer() {
		return producer;
	}
	public void setProducer(String producer) {
		this.producer = producer;
	}
	
	public static void loadMovies(List<Movie> movies) {
		movies.add(new Movie("Aakaasam Nee Haddhu Ra","SUDHA KONGARA","EROS"));
		movies.add(new Movie("Colour Photo","Sandeep Raj","Reliance Digital"));
		movies.add(new Movie("Jaanu","Prem Kumar","24 Frames"));
		movies.add(new Movie("Ala Vaikunthapurramuloo","Trivikram","Geetha Arts"));
		movies.add(new Movie("Bheeshma ","Venki kudumula","PVR"));
		movies.add(new Movie("Nishabdham","Hemanth Madhukar","Indian Cinema"));
	}
	
}
