package CSW25;

import java.time.*;  

public class LocalDateExample3 {  
  public static void main(String[] args) { 
	  
   // LocalDate date = LocalDate.of(2017, 1, 13); 
    
    LocalDate date = LocalDate.now();
    
    LocalDateTime datetime = date.atTime(1,50,9);  
    
    System.out.println(datetime);   
  }  
}  