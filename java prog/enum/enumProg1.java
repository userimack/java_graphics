enum tuna {
	mack("nice","20"),
	imack("irc nick","19"),
	userimack("github username","20");
	
	private final String desc;
	private final String year;
	
	tuna (String description, String yr) {
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


class enumProg {
	public static void main(String args[]) {
		for(tuna people: tuna.values())
			System.out.printf("%s\t%s\t%s\n",people, people.getDesc(), people.getYear() );					
	}
}