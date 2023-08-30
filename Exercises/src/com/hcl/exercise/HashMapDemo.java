package com.hcl.exercise;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		
		HashMap<String,String> map= new HashMap<String,String>();
		
		map.put("A","Usha");
		
		map.put("B","Abhi");
		map.put("D","Virat");
		map.put("C","Shreya");
		map.put("F","Indu");
		map.put("F","Varsha");  
		
	
        System.out.println(map);
        
        map.remove("F");
        
        System.out.println(map);
        
	}

}
