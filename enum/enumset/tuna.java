public enum tuna {
	mahendra("name","0"),
	mack("nick","1"),
	imack("nick","2"),
	userimack("nick","3"),
	codesurfer("hackerrank username","4");
	
	private final String desc;
	private final String year;
	
	tuna(String description, String yr) {
		desc = description;
		year = yr;
	}
	
	public String getDesc() {
		return desc;
	}
	
	public String getYear() {
		return year;
	}
}