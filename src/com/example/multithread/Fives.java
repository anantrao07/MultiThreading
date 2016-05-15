package com.example.multithread;

public class Fives  extends Thread{
	
	
	public void run(){
		
		tableOf5();
		
	}

	public void tableOf5(){
		
		for(int i = 1 ; i<=10 ; i++){
			
			System.out.println("5 X "+i + "=" + 5*i);
			
			
		}
	}
}
