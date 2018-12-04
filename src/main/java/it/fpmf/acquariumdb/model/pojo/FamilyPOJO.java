package it.fpmf.acquariumdb.model.pojo;


public class FamilyPOJO {
	
	private String name;
	private String description;
	
	
	public FamilyPOJO() {
		super();
	}


	public FamilyPOJO(String name, String description) {
		super();
		this.name = name;
		this.description = description;
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
	
	
	

}
