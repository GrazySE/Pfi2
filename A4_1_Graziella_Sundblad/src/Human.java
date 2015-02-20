
public class Human {
	
	private String name;
	private Dog dog;
	
	public Human(String name){
		this.name = name;
	}

	
	public String getName(){
		return name;
	}
	
	public void buyDog(Dog dog){
		this.dog = dog;
	}
	
	public String getInfo(){
		String text = "";
		if (dog != null){
			text = getName() + " äger en hund som heter " + dog.getName();
		}else{
			text = getName() + " äger tyvärr ingen hund";
		}
		return text;
	
		
		
	}
}