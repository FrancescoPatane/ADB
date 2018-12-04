package it.fpmf.acquariumdb.model.pojo;

import it.fpmf.acquariumdb.model.enumeration.WaterType;

public class FishPojo {
	
	private String name;
	private String family;
	private String description;
	private Integer size;
	private Integer minVolume;
	private WaterType waterType;
	
	public FishPojo() {
		super();
	}

	public FishPojo(String name, String family, String description, Integer size, Integer minVolume, WaterType waterType) {
		super();
		this.name = name;
		this.family = family;
		this.description = description;
		this.size = size;
		this.minVolume = minVolume;
		this.waterType = waterType;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFamily() {
		return family;
	}

	public void setFamily(String family) {
		this.family = family;
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
	
	
	
	

}
