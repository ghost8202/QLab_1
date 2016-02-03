package Qlab1;

import java.util.concurrent.TimeUnit;

//Chris Hall
public class Qlab1 {

	public static void main(String[] args){
		int counter=0;
		while (counter<50){
		Frame f = new Frame();
		f.setVisible(true);
		f.pack();
		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		f.setVisible(false);
		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		counter++;
		}
		}
	}
