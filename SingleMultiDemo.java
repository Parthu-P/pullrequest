package com.parthu;

public class SingleMultiDemo extends Thread {

	static SingleMultiDemo sd = null;

	public static void main(String[] args) {

		SingleMultiDemo sd1 = new SingleMultiDemo();
		SingleMultiDemo sd2 = new SingleMultiDemo();
		SingleMultiDemo sd3 = new SingleMultiDemo();
		sd1.start();
		sd2.start();
		sd3.start();
	}

	@Override
	public void run() {
		try {

			SingleMultiDemo.getInstance();
		} catch (Exception e) {
			e.printStackTrace();

		}
		super.run();
	}

	static SingleMultiDemo getInstance() {
		if (sd == null) {
			synchronized (SingleMultiDemo.class) {
				if (sd == null) {
					sd = new SingleMultiDemo();
					System.out.println(Thread.currentThread() + "excuted");
				}
			}
		}
		return sd;

	}

}
