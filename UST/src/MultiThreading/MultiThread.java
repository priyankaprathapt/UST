package MultiThreading;

public class MultiThread {

	public static void main(String[] args) {
		
	      new Thread(() -> { 
	         for(int i=1; i <= 5; i++) {
	            System.out.println("Child Thread: "+ i);
	            try {
	               Thread.sleep(500);
	            } catch(Exception e) {
	               e.printStackTrace();
	            }
	         }
	      }).start();
	      
	    
	      for(int j=1; j < 5; j++) {
	         System.out.println("Main Thread: "+ j);
	         try {
	            Thread.sleep(500);
	         } catch(Exception e) {
	            e.printStackTrace();
	         }
	      }
	   }

	}


