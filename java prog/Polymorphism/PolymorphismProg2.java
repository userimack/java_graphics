class Animals {
	public void noise(){
		System.out.println("Animals don't make noise!!");
	}
}


class Dog extends Animals{
	public void noise(){
		System.out.println("ruff");		
	}
}

class Cat extends Animals {
	public void noise(){
		System.out.println("Meow");
	}
}

class PolymorphismProg2 {
	public static void main(String args[])
	{
		Animals thelist[] = new Animals[2];
		Dog d = new Dog();
		Cat c = new Cat();
		
		thelist[0]=d;
		thelist[1]=c;
		
		for(Animals x:thelist){
			x.noise();
		}
	}
}
