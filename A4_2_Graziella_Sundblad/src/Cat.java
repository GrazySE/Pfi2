public class Cat extends Mammal{
	
	private int numberLives;
	
	public Cat(String friendlyName, String latinName, int gestationTime, int numberLives){
		super(latinName, friendlyName, gestationTime);
		this.numberLives = numberLives;
	}
	
	public int getNbrOfLives(){
		return numberLives;
	}

	public String getInfo() {
		String catlives;
		if(this.getNbrOfLives()==1){
			catlives = "The cat \""+this.getFriendlyName()+" /lat: "+this.getLatinName()+"\" gestates for "+this.getGestationTime()+" months and has "+this.getNbrOfLives()+" life.\n";
		}else{
		    catlives = "The cat \""+this.getFriendlyName()+" /lat: "+this.getLatinName()+"\" nurses for "+this.getGestationTime()+" months and has "+this.getNbrOfLives()+" lives.\n";
		}
		return catlives;
	}

}