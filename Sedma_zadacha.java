import java.util.Scanner;

public class Sedma_zadacha {

	public static void main(String[] args) {
		
		
		        Scanner sc = new Scanner (System.in);
		        String line=sc.nextLine();
		        
		        String [] lineArgs = line.split(" ");
		        rotateArray(lineArgs);
		        printArray(lineArgs);
		    }

		     static String [] rotateArray(String lineArgs[]){ 
		         String temp;
		        for (int j=lineArgs.length-1, i=0; j>i ; j-- , i++) {
		            temp=lineArgs[j];
		            lineArgs[j]=lineArgs[i];
		            lineArgs[i]=temp;
		        }
		        return lineArgs;
		    }

		    static void printArray(String lineArgs[]){ 
		    	for (int i = 0; i <lineArgs.length ; i++) {
		            System.out.printf(lineArgs[i]+" ");
		        }
		    }
		

	}


