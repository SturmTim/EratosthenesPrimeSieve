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
    int og = 0;
    List<Integer> ng = new ArrayList<>();

    public static void main(String[] args) {
        EratosthenesPrimeSieve eps = new EratosthenesPrimeSieve();
        eps.printPrimes();
        System.out.println("");
        eps.goldbachsche();
    }

    @Override
    public boolean isPrime(int p) {
        return !notprime.contains(p);
    }

    @Override
    public void printPrimes() {
        Scanner scanner = new Scanner(System.in, "Windows-1252");
        System.out.println("Bis zu welcher Obergrenze wollen Sie die Primzahlen wissen?");
        og = Integer.parseInt(scanner.nextLine());
        notprime.add(1);
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

    public void goldbachsche() {
        for (int i = 4; i <= og; i = i + 2) {
            ng.add(i);
        }
        for (Integer n : ng) {
            for (int i = 0; i < isprime.size() && isprime.get(i) < n; i++) {
                if (isPrime(n - isprime.get(i)) == true) {
                    System.out.println(n + " = " + isprime.get(i) + " + " + (n - isprime.get(i)));
                    break;
                }

            }
        }
    }

}
