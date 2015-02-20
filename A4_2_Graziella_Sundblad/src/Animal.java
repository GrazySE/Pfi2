
public abstract class Animal {
	private String latinName;
	private String friendlyName;
	
	public Animal(String latinName, String friendlyName){
		setLatinName(latinName);
		setFriendlyName(friendlyName);
		
	}
	public abstract String getInfo();
	
	public String getLatinName(){
		return latinName;
		
	}
	public String getFriendlyName(){
		return friendlyName;
	}
	
	public void setLatinName(String latinName){
		this.latinName = latinName;
	}
	
	public void setFriendlyName(String friendlyName){
		this.friendlyName = friendlyName;
	}
	
	

}