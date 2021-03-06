package fixtures;

public abstract class Fixture {
	//Definition of fixture: 
//	means any physical property that is permanently attached to real property
	//Title for the fixture
	private String name;
	//a one sentence long description of a fixture
	private String shortDescription;
	//a paragraph long description of the thing
	private String longDescription;
	
	public Fixture(String name, String shortDescription, String longDescription) {
		this.name = name;
		this.shortDescription = shortDescription;
		this.longDescription = longDescription;
	}
		//Setter & Getters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	public String getLongDescription() {
		return longDescription;
	}

	public void setLongDescription(String longDescription) {
		this.longDescription = longDescription;
	}
	
	
	
	
}
