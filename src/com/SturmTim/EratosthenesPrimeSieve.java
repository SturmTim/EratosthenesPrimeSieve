/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.SturmTim;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author tsturm18
 */
public class EratosthenesPrimeSieve implements PrimeSieve{

    
    public static void main(String[] args) {
        
    }

    @Override
    public boolean isPrime(int p) {
        return true;
    }

    @Override
    public void printPrimes() {
        
        
    }
    
    public void getPrimeArray(){
        Scanner scanner =new Scanner(System.in, "Windows-1252");
        System.out.println("Bis zu welcher Obergrenze wollen Sie die Primzahlen wissen?");
        int og = Integer.parseInt(scanner.nextLine());
        
        List<Integer> isprime = new ArrayList<>();
        List<Integer> notprime = new ArrayList<>();
        
        for (int i = 2; i <= og; i++) {
            if(notprime.contains(i)){
            }
            else{
                isprime.add(i);
            }
            
        }
    }
    
}
