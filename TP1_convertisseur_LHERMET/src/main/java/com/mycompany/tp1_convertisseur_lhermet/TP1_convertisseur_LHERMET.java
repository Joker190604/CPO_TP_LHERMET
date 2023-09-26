/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tp1_convertisseur_lhermet;

import java.util.Scanner;

/**
 *
 * @author sacha
 */
public class TP1_convertisseur_LHERMET {

    public static void main(String[] args) {
        Scanner sc ;
        sc= new Scanner(System.in );
        double deg;
        double TEMPERATURE;
        System.out.println("Entre un nombre");
        deg=sc.nextDouble();
        TEMPERATURE=deg+273.15;
        System.out.println("Température en Kelvin vaut "+TEMPERATURE+" Kelvin");
        
        System.out.println("CelciusVersKelvin\n"
                + "KelvinVersCelcius\n"
                +"FarenheitVersCelcius\n"
                +"CelciusVersFarenheit\n"
                +"FarenheitVersKelvin\n");
        CelciusVersKelvin(TEMPERATURE);
        KelvinVersCelcius(TEMPERATURE);
        FarenheitVersCelcius(TEMPERATURE);
        CelciusVersFarenheit(TEMPERATURE);
        FarenheitVersKelvin(TEMPERATURE);
    
                
          }
    
    public static double CelciusVersKelvin (double tCelcius) {
       double Kelvin;
        Kelvin=tCelcius+273.15; 
     return Kelvin;
   
}
    public static double KelvinVersCelcius (double TKelvin) {
       double Celcius;
        Celcius=TKelvin-273.15; 
     return Celcius;
   }
    public static double FarenheitVersCelcius (double tFarenheit) {
       double Celcius2;
        Celcius2=(tFarenheit-32)/3.8; 
     return Celcius2;
   }
    
   public static double KelvinVersFarenheit (double tKelvinVF) {
       double KelvinF;
        KelvinF=(tKelvinVF+32)*9/5+273.15; 
     return KelvinF;
   }
    public static double CelciusVersFarenheit (double tCelciusVF) {
       double Farenheit;
        Farenheit=tCelciusVF*9/5 + 32; 
     return Farenheit;
   }

    public static double FarenheitVersKelvin (double tFarenheitVK) {
       double KelvinF;
        KelvinF=(tFarenheitVK-32)/1.8+273.15; 
     return KelvinF;
   }

}
