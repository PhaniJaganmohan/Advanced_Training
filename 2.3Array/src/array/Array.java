package array;

public class Array {
	 public static void main(String[] args) {  
	        
	        int [] arr = new int [] {3, 2, 4, 5, 6, 4, 5, 7, 3, 2, 3, 4, 7, 1, 2, 0, 0, 0 };  
	        int sum = 0;  
	        int avg =0;
	        int temp , size;
	        size = arr.length-3;
	        //Loop through the array to calculate sum of elements  
	        for (int i = 0; i <= 14; i++) {  
	           sum = sum + arr[i];  
	        }  
	        System.out.println("Sum is :" + sum); 
	        arr[15]=sum;
	        System.out.println("sum of all elements form 0 to 14 and stored in elements is :"+arr[15]);
	        
	        for (int j=0; j<=size;j++) {
	        	avg=(sum / size);
	        	
	        }
	        	System.out.println("avg is :"+avg);
	        	arr[16]=avg;
	        	System.out.println("average of all numbers and stores at element 16 is : "+arr[16]);
	
	        for(int a =0 ; a<size; a++) {
	        	for(int b = a+1;b<size; b++) {
	        		if(arr[a]>arr[b]) {
	        			temp = arr[a];
	        			arr[a] = arr[b];
	        			arr[b] = temp;
	        			
	        		}
	        	}
	        }
	        System.out.println("small number is :"+arr[0]);
	        arr[17]=arr[0];
	        System.out.println("smallest value from the array and stores it at element 17 is : "+arr[17]);
	
	 
	 
	 }

}
