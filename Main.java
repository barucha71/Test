import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;

import com.sun.jndi.toolkit.url.Uri;

import java.io.PrintStream;
import java.util.Optional;
 

//import javafx.scene.transform.Translate;
import sun.util.logging.resources.logging;

import java.util.Map.Entry; 
import java.util.Arrays;


public class Main {
	
	





	public static void main(String[] args) throws Exception  {
		
		
		
		
		
		
		 String csvFile = "C:/Users/dell/Desktop/Reviews.csv";
         BufferedReader br = null;
         String line = "";
         String cvsSplitBy = ",";
         List<String> x = new ArrayList<String>();
        //ist<String> y = new ArrayList<String>();
       //List<String> w = new ArrayList<String>();
       
      //   System.out.println("please wait for the 1000 most active users ");
       //  System.out.println("");


         
         
         for(int i=0;i<=2;i++){  
         br = new BufferedReader(new FileReader(csvFile));
         while ((line = br.readLine()) != null) {

             // use comma as separator
             String[] name = line.split(cvsSplitBy);

        if(i == 0 ){
             
             x.add(name[3]) ;
             
        }else if(i == 1){
        	
             x.add(name[1]) ;
        }else{
        	

             x.add(name[8]) ;
        }
             
        }
            

	
        //  create hashmap x
         
         
        	 
         Map<String,Integer> map= new HashMap<String,Integer>();
     	 
     	 
     	
     	 
     	for(String str : x){

	        if(map.containsKey(str)) {
	        	map.put(str,map.get(str) + 1);
	        }
	        else {
	        	map.put(str, 1);
	        }
	    }

	    int count = 0;
	    
	    for(int repatCount : map.values()){
	        if(repatCount > 1) {
	            count++;
	            
	        }
	    }
	    
	   
	
	    Map<String, Integer> sortedMap = sortByValue(map);
	    int county = 0 ;
	    
	    Iterator<Entry<String, Integer>> mapIterator = sortedMap.entrySet().iterator();
	    while (mapIterator.hasNext()) {
	    	county ++ ;
	    	System.out.println(county);
	        Entry<String, Integer> entry = mapIterator.next();
	        if (county <= 1000)
	        System.out.println(entry.getKey() + ": " + entry.getValue());
	    }   
	
	    if (i ==2){
	 	    
	    	
	 

	    	 System.out.println("##################### total active users = " + county + " #############################");
		  	 x.clear();
	    	
	    }
	    
	  
	   
	  	   System.out.println("##################### total active users = " + county + " #############################");
	  	 x.clear();
         }
	
	}
		
   	

	// }
	public static Map<String, Integer> sortByValue(Map map) {
		Map<String, Integer> sortedMap = new TreeMap<String, Integer>(new ValueComparator(map));
		sortedMap.putAll(map);
		return sortedMap;
	}
	
	
	
	
	
	
	 
}
	
		

	

		    
	
	

