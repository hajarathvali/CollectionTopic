package com.slokam.collections;

public class Deloitte {
	
	public static void main(String[] args) {
		
		try {
			go();
		
			
		}
		catch(Exception e) {
			System.out.println("1");
		}
		catch(Error e) {
			System.out.println("2");
		}
		catch(Throwable t) {
			System.out.println("3");
		}
		
	}

	 static void go() {  //       
		//go();
		
	}

}

// Exception flow   
// normal termination
// abnormal "


/*static block -- 2
static method  --- 3
static variable ---1 */
