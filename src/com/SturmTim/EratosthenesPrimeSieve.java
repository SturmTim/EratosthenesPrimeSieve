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
public class EratosthenesPrimeSieve implements PrimeSieve {

    List<Integer> isprime = new ArrayList<>();
    List<Integer> notprime = new ArrayList<>();

    public static void main(String[] args) {
        EratosthenesPrimeSieve eps = new EratosthenesPrimeSieve();
        eps.printPrimes();
    }

    @Override
    public boolean isPrime(int p) {
        if (notprime.contains(p)) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public void printPrimes() {
        Scanner scanner = new Scanner(System.in, "Windows-1252");
        System.out.println("Bis zu welcher Obergrenze wollen Sie die Primzahlen wissen?");
        int og = Integer.parseInt(scanner.nextLine());

        for (int i = 2; i <= og; i++) {
            if (isPrime(i) == false) {
                notprime.add(i);
            } else {
                isprime.add(i);
                for (int j = i * i; j <= og; j = j + i) {
                    notprime.add(j);
                }
            }
        }
        int zeilenumbruch = 5;
        for (Integer integer : isprime) {
            if (zeilenumbruch == 0) {
                zeilenumbruch = 5;
                System.out.println("");
            }
            System.out.print(integer + ", ");
            zeilenumbruch = zeilenumbruch - 1;
        }

    }

}
