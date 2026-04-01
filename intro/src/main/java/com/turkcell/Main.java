package com.turkcell;

// Entrypoint
public class Main 
{
    public static void main(String[] args) 
    {
        System.out.println("Merhaba Turkcell, Java'ya hoş geldiniz!");

        // Programlama konseptleri

        // Scope Kavramı => {} kapsama alanı

        // Değişkenler (Variables)
        // Kodun akışında değer tutan isimli veriler.

        System.out.println(10);
        int X = 15; // Değişken tanımlandı. X ismine bir değer atandı.
        // Tanımlandıktan itibaren değişebilir, erişilebilir.
        System.out.println(X);
        X=20;
        System.out.println(X);
    }
    
} // Main classının kapsama alanı (sınır)
