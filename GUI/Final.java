class Final {
	public static void main(String[] args){
		String a = "apples" ;
		String b = "mack";
		String c = "MACK";
		
		System.out.println("Length of "+ a + " is "+ a.length());
		
		if(a.equals("apples")){
			System.out.println("It equals apples!!");
		}
		
		if(b.equalsIgnoreCase(c)){
			System.out.println("It matches!!!");
		}
	}
}