package CountriesLab;

public class Country {

	private String countryName;
	private int populatiuon;
	
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public int getPopulatiuon() {
		return populatiuon;
	}
	public void setPopulatiuon(int populatiuon) {
		this.populatiuon = populatiuon;
	}
	public Country(String countryName, int populatiuon) {
		super();
		this.countryName = countryName;
		this.populatiuon = populatiuon;
	}
	public Country() {
		super();
	}
	@Override
	public String toString() {
		return "Country [countryName=" + countryName + ", populatiuon=" + populatiuon + "]";
	}
	
}
