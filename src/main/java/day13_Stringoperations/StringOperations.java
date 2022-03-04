package day13_Stringoperations;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class StringOperations
{
    public static void main(String[] args)
    {
        String val = " This is Java training sessions ";
        String val1 = "for Batch3";

        //To find the length of the string
        System.out.println(val.length());
        //To remove spaces to the beginning and ending of the string
        String removeSpaces = val.trim();
        System.out.println(removeSpaces);
        //To convert String to Lowercase letters
        String lowerCase = val.toLowerCase();
        System.out.println(lowerCase);
       // System.out.println(val.toLowerCase());
        //To convert String to uppercase letters
        String upperCase = val.toUpperCase();
        System.out.println(upperCase);
        //System.out.println(val.toUpperCase());
        //To retrieve part of String value (substring)
        String substring = val.substring(0,14);
        System.out.println(substring);
        //To replace a String portion
        String replaceString = val.replace("Java","Selenium");
        System.out.println(replaceString);
        //To check whether String contains(particular word)
        System.out.println(val.contains("Java"));
        //To check the Position of particular word(java)
        System.out.println(val.lastIndexOf("J"));
        //To check whether String is empty
        System.out.println(val.isEmpty());
        //To concat two Strings
        System.out.println(val.concat(val1));


    }
}
