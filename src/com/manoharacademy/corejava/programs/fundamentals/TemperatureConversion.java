package com.manoharacademy.corejava.programs.fundamentals;

public class TemperatureConversion {
    //http://www.mathsisfun.com/temperature-conversion.html
    
    public static void main(String[] args) {
        /*
        Fahrenheit to Celsius:   (°F − 32) x 5/9 = °C
        Celsius to Fahrenheit:   (°C × 9/5) + 32 = °F        
        */
        
      
        
        double fahrenheitTemperature = 212;
        double celsiusTemperature =  ((fahrenheitTemperature - 32) * (5.0 / 9));
        System.out.printf("%5.2f F = %5.2f  C\n", fahrenheitTemperature,celsiusTemperature);
        
        celsiusTemperature = 37;
        fahrenheitTemperature =  ((celsiusTemperature * 9 / 5) + 32) ;
        System.out.printf("%5.2f C = %5.2f F", celsiusTemperature, fahrenheitTemperature);
        
        
        
        
    }
    
}
