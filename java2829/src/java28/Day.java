package java28;

import java.util.Date;

public class Day extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			Date date = new Date();
			System.out.println("날짜: " + date);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				//인터럽트(방해, 중단) : esc, ctrl+c, power-off
			}
		}
	}
}
