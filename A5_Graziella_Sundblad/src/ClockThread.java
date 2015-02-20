import java.awt.*;

import java.util.*;

public class ClockThread extends Thread {

  String currentTime;
  Label labelToChange;
  boolean keepGoing = true;

  ClockThread(Label lbl){
    super();
    labelToChange = lbl;
  } // end constructor

  public void stopLooping(){
    keepGoing = false;
  } // end stopLooping

  public void run(){
    while (keepGoing){
    	try {
			Thread.sleep(900);
		} catch (InterruptedException e) {
		
			e.printStackTrace();
		}
      currentTime = String.valueOf(new Date());
      labelToChange.setText(currentTime);
    } // end while loop
  } // end run

} // end class def
