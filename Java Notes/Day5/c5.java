class  Parent{
	void property() {
		System.out.println("Gold , Car , Land , Property");
		
	}
	
	void marry() {
		System.out.println("Marry Yuvraj");
	}
}

class Child extends Parent{
	void marry() {
		System.out.println("Marry Alia and Katrina");
	}
}

class Main{
	public static void main(String[] args) {
		System.out.println("Rang badaldeta hain parent ka beta!");
		Parent girgit = new Child();
		girgit.property();
		girgit.marry();
	}
}