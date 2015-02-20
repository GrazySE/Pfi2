public class Dog extends Mammal{
	
	private boolean stupid;
	
	public Dog(String friendlyName,String latinName, int gestationTime, boolean stupid){
		super(latinName,friendlyName, gestationTime);
		this.stupid = stupid;
	}
	
	public boolean getStupid(){
		return stupid;
	}

	public String getInfo() {
	  String dumb;
		if(this.getStupid()==true){
			dumb = "The dog \""+ this.getFriendlyName()+" /lat: " +this.getLatinName()+"\" gestates for "+this.getGestationTime()+" months and is freaking stupid.\n";
		}else{
			dumb = "The dog \""+ this.getFriendlyName()+" /lat: "+this.getLatinName()+"\" gestates for "+this.getGestationTime()+" months and is smarter than its owner.\n";
		}
	  return dumb;
	}

}