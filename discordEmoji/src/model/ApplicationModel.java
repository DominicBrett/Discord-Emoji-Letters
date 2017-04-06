/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import static java.lang.Character.isDigit;
import java.util.Scanner;

/**
 *
 * @author dominic
 */
public class ApplicationModel {
   
 
    
    String specialChars[] = {"*","!","@","#","$","%","^","&","*","()","\"{","}","_","[","]","|","?","/","<",">",",",".","="};
String numberWords[] = {":zero:", ":one:",":two:",":three:",":four:",":five:",":six:",":seven:",":eight:",":nine:"};

public String calculateEmojis(String input)
{
    String output = "";
    int charCount = 0;
for (int i = 0;i < input.length(); i++){
    
Boolean containsLetter = true;    
    String a = Character.toString(input.charAt(i));
    for(int d = 0; d < specialChars.length; d++)
    {   
    if(a.equals(specialChars[d]))
    {
        output += a;
        charCount++;
        containsLetter = false;
    }
    }
    
    if(isDigit(input.charAt(i)))
    {
        int e = Integer.parseInt(a);
        output += numberWords[e];
        charCount += (numberWords[e]).length();
        containsLetter = false;
    }
    
    
    if(containsLetter)
    {
   if (a.equals(" "))
    {
        output += "     ";
        charCount += ("     ").length();
    }
    else
    {
    output += ":regional_indicator_"; 
    output += a.toLowerCase(); 
    output += ": ";
    charCount += (":regional_indicator_" + a.toLowerCase() + ": ").length();
    if (charCount > 100)
    {
        charCount = 0;
        output += "\n";
    }
}
    }
   
}
 return output;
}
    private static ApplicationModel instance;
 public static ApplicationModel getInstance() {
        return instance;
    }

   
    public static void setInstance(ApplicationModel instance) {
        ApplicationModel.instance = instance;
    }

}