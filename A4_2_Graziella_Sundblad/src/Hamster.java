public class Hamster extends Mammal{
	
	private boolean poops;
	
	public Hamster(String friendlyName,String latinName, int gestationTime, boolean poops){
		super(latinName, friendlyName,gestationTime);
		this.poops = poops;
	}
	
	public boolean getPoops(){
		return poops;
	}

	public String getInfo() {
	  String poopingMachine;
		if(this.getPoops()==true){
			poopingMachine = "The hamster \""+this.getFriendlyName()+" /lat: "+this.getLatinName()+"\" gestates for "+this.getGestationTime()+" months and is a real pooping machine.\n";
		}else{
			poopingMachine = "The hamster \""+this.getFriendlyName()+" /lat: "+this.getLatinName()+"\" gestates for "+this.getGestationTime()+" months and is truly constipated.\n";
		}
	  return poopingMachine;
	}

}