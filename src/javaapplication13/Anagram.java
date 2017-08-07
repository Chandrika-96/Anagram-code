/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication13;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.lang.String;


public class Anagram
{
    public static void main(String[] args)
    {
        //String[] str = new String[100];
       Scanner reader = new Scanner(System.in);  
        System.out.println("Enter a String  : ");
        String string1 = reader.nextLine(); 
        
        Scanner reader1 = new Scanner(System.in);
        System.out.println("Enter the Anagram: ");
        String anagram1 = reader1.nextLine();
        
      
       // String[] AnagramList;
       // String str3 = "EFGHI";
        //String str = "ABC";
        int n = anagram1.length();
         ArrayList<String> array1 = new ArrayList<String>();
        Anagram permutation = new Anagram();
        permutation.permutations(anagram1, 0, n-1,array1);
        System.out.println(array1);
        for(int i = 0;;i++){
        if(string1.contains(array1.get(i))){
            System.out.println("yes");
            break;
            
        }
        else{
            System.out.println("NO");
            break;
        }
        }
    }
 
 
    
    private void permutations(String anagram1, int l, int r, ArrayList<String> array1)
    {
     
        if (l == r){
            
            array1.add(anagram1);
             }
        else
        {
            for (int i = l; i <= r; i++)
            {
                
                anagram1 = swap(anagram1,l,i);
                permutations(anagram1, l+1, r,array1);
                anagram1 = swap(anagram1,l,i);
                
               
            }
        }
       
       
    }
 
  
    public String swap(String a, int p, int q)
    {
        char var1;
        char[] Array2 = a.toCharArray();
        var1 = Array2[p] ;
        Array2[p] = Array2[q];
        Array2[q] = var1;
        return String.valueOf(Array2);
    }
 
}

