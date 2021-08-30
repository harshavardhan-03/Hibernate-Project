package com.xworkz.bird.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "birds_table")
public class BirdEntity implements Serializable {

	@Column(name = "b_id")
	@Id
	private int id;
	@Column(name = "b_name")
	private String name;
	@Column(name = "b_scientificName")
	private String scientificName;
	@Column(name = "b_feather")
	private boolean feather;
	@Column(name = "b_color")
	private String color;
	@Column(name = "b_region")
	private String region;
	@Column(name = "b_life_span")
	private int ageLimit;
	@Column(name = "gender")
	private String gender;
	@Column(name = "b_fly")
	private boolean fly;
	@Column(name = "b_family")
	private String family;

	public BirdEntity() {
	}

	public BirdEntity(int id, String name, String scientificName, boolean feather, String color, String region, int ageLimit,
			String gender, boolean fly, String family) {
		this.id = id;
		this.name = name;
		this.scientificName = scientificName;
		this.feather = feather;
		this.color = color;
		this.region = region;
		this.ageLimit = ageLimit;
		this.gender = gender;
		this.fly = fly;
		this.family = family;
	}

	@Override
	public String toString() {
		return "BirdDTO [id=" + id + ", name=" + name + ", scientificName=" + scientificName + ", feather=" + feather + ", color=" + color
				+ ", region=" + region + ", ageLimit=" + ageLimit + ", gender=" + gender + ", fly=" + fly + ", family="
				+ family + "]";
	}

	@Override
	public int hashCode() {
		return 113;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (obj instanceof BirdEntity) {
			BirdEntity other = (BirdEntity) obj;
			if (this.name.equals(other.name) && this.scientificName.equals(other.scientificName)) {
				return true;
			}
		}
		return false;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getScientificName() {
		return scientificName;
	}

	public void setScientificName(String scientificName) {
		this.scientificName = scientificName;
	}

	public boolean isFeather() {
		return feather;
	}

	public void setFeather(boolean feather) {
		this.feather = feather;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public int getAgeLimit() {
		return ageLimit;
	}

	public void setAgeLimit(int ageLimit) {
		this.ageLimit = ageLimit;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public boolean isFly() {
		return fly;
	}

	public void setFly(boolean fly) {
		this.fly = fly;
	}

	public String isFamily() {
		return family;
	}

	public void setFamily(String family) {
		this.family = family;
	}
}