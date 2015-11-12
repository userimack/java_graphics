class food {
	void eat () {
		System.out.println("This food is great!!");
	}
}


class tuna extends food {
	void eat (){
		System.out.println("This Tuna is great!!");
	}	
}

class potpie extends food {
	void eat() {
		System.out.println("This potpie is great!!");
	}
}

class PolymorphismProg1 {
	public static void main (String args[]){
		food f[] = new food[2];
		f[0] = new potpie();
		f[1] = new tuna();
		
		for(int x=0;x<2;x++)
			f[x].eat();
	}
}