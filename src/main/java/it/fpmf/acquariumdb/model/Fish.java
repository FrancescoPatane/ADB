package it.fpmf.acquariumdb.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import it.fpmf.acquariumdb.model.enumeration.WaterType;

@Entity
public class Fish {
	
	@Id 
	@GeneratedValue( strategy=GenerationType.IDENTITY)
	private Long id;
	@Column(nullable = false, unique=true)
	private String name;
	@Column(length = 5000)
	private String description;
	private Integer size;
	private Integer minVolume;
	@Enumerated(EnumType.STRING)
	private WaterType waterType;
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "familiy_id")
	private Family family;
	
	
	
	public Fish() {
		super();
	}
	
	public Fish(Long id, String name, String description, Integer size, Integer minDimensions, Integer minVolume,
			WaterType waterType, Family family) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.size = size;
		this.minVolume = minVolume;
		this.waterType = waterType;
		this.family = family;
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
	public Integer getSize() {
		return size;
	}
	public void setSize(Integer size) {
		this.size = size;
	}
	public Integer getMinVolume() {
		return minVolume;
	}
	public void setMinVolume(Integer minVolume) {
		this.minVolume = minVolume;
	}
	public WaterType getWaterType() {
		return waterType;
	}
	public void setWaterType(WaterType waterType) {
		this.waterType = waterType;
	}
	public Family getFamily() {
		return family;
	}
	public void setFamily(Family family) {
		this.family = family;
	}
	
	
	
}
