public class tunaToString {
	private String name;
	private PotPie date;
	
	public tunaToString(String theName,PotPie theDate) {
		name = theName;
		date = theDate;
	}
	
	public String toString() {
		return String.format("My name is %s & Date of Birth is %s",name,date);
	}
}