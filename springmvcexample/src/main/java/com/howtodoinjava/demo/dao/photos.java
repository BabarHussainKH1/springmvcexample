package com.howtodoinjava.demo.dao;

class Camera {
	private int id;
	private String name;
	private int rover_id;
	private String full_name;
}

class Rover {
	private int id;
	private String name;
	private String landing_date;
	private String lounch_date;
	private String status;
}

public class photos {
	private Long id;
	private Long sol;
	private String earth_date;
	private String img_src;
	private Camera camera;
	private Rover rover;

	public photos() {
		super();
	}

	public photos(Long id, Long sol, String earth_date, String img_src, Camera camera, Rover rover) {
		super();
		this.id = id;
		this.sol = sol;
		this.earth_date = earth_date;
		this.img_src = img_src;
		this.camera = camera;
		this.rover = rover;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getSol() {
		return sol;
	}

	public void setSol(Long sol) {
		this.sol = sol;
	}

	public String getEarth_date() {
		return earth_date;
	}

	public void setEarth_date(String earth_date) {
		this.earth_date = earth_date;
	}

	public String getImg_src() {
		return img_src;
	}

	public void setImg_src(String img_src) {
		this.img_src = img_src;
	}

	public Camera getCamera() {
		return camera;
	}

	public void setCamera(Camera camera) {
		this.camera = camera;
	}

	public Rover getRover() {
		return rover;
	}

	public void setRover(Rover rover) {
		this.rover = rover;
	}

	@Override
	public String toString() {
		return "photos [id=" + id + ", sol=" + sol + ", earth_date=" + earth_date + ", img_src=" + img_src + ", camera="
				+ camera + ", rover=" + rover + "]";
	}

}