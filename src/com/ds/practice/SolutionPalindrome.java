package com.ds.practice;

public class SolutionPalindrome {

public static void main(String args[]) {
		
		int x = 10;
		System.out.println(isPalindrome(x));
		
	}


public static boolean  isPalindrome(int x) {
    
	boolean result = false;
    if(x<0){
        return result;
    }else if(x%10==0){
        return result;
    }else{
    int updatedX = 0;
    	int res =x;
       while(x>0){
           updatedX= updatedX *10+x%10;
           System.out.println(updatedX +" and "+res);
           x=x/10;
        }
        
        
     if(updatedX==res){
         return true;
     }   
        
    }
 return result; 
}


	}
