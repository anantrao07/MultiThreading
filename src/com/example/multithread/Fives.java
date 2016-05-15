package com.example.multithread;

public class Fives  extends Thread{
	
	
	public void run(){
		
		try{
			tableOf5();
		}catch(IllegalStateException ie){
			
			System.out.println("the thread encountered some error, exiting thread");
			ie.printStackTrace();
		}
	
		
	}

	public void tableOf5(){
		
		for(int i = 1 ; i<=10 ; i++){
			
			System.out.println("5 X "+i + "=" + 5*i);
			
			
		}
	}
}
