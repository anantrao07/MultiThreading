package com.example.multithread;

public class MThreads {

	public void displayEven(){
		
		int count = 1 ; 
		for(int i = 0; i <= 50 ; i++ ){
			
			
			if(i%2 ==0){
				count++;
				System.out.println(count + " even number is " + i  );
			}
		
		}
	}
	public static void main(String[] args) {
	
		
		Fives f = new Fives();
		f.start();
		MThreads mt = new MThreads();
		mt.displayEven();

	}

}
