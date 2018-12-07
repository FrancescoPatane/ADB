package it.fpmf.acquariumdb.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Family {
	
	@Id 
	@GeneratedValue( strategy=GenerationType.IDENTITY )
	private Long id;
	@Column(nullable = false, unique=true)
	private String name;
	@Column(length = 5000)
	private String description;
	@JsonIgnore
	@OneToMany(mappedBy = "family")
	private List<Fish> fishes;
	
	public Family() {
		super();
	}
	
	public Family(Long id, String name, String description) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Fish> getFishes() {
		return fishes;
	}

	public void setFishes(List<Fish> fishes) {
		this.fishes = fishes;
	}
	
	
	
	
	
	

}
