public class Snake extends Animal {

	private boolean poisonous;
	
	public Snake (String friendlyName, String latinName, boolean poisonous) {
		
		super (latinName, friendlyName);
		this.poisonous = poisonous;
		}
	
	@Override
	public String getInfo() {
		String poison;
		if (poisonous){
			poison =" as " ;
		}else{
			poison = " not as ";
		}
		return " The snake \"" + super.getFriendlyName()+ " /lat: " + super.getLatinName() +"\" is" + poison + "poisonous as your mother-in-law. \n" ;
	}
}