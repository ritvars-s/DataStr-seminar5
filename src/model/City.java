package model;

public class City {
	private String title;
	private float areaKm2;
	private String postalCode;
	private Country country;
	
	public String getTitle() {
		return title;
	}
	public float getAreaKm2() {
		return areaKm2;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public Country getCountry() {
		return country;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	public void setAreaKm2(float areaKm2) {
		this.areaKm2 = areaKm2;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public void setCountry(Country country) {
		this.country = country;
	}

	public City() {}
	public City(String newTitle, float newAreaKm2, String newPostalCode, Country newCountry) {
		setAreaKm2(newAreaKm2);
		setCountry(newCountry);
		setPostalCode(newPostalCode);
		setTitle(newTitle);
	}
	
	public String toString() {
		return country + ": " + title + " (" + postalCode + ") (" + areaKm2 + ")";
	}
	
}
