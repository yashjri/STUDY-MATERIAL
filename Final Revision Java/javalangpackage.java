//java lang is core package in java.
// it provides fundamental classes and utilities that are automatically import into every java code
//this package is essential and for importing basic functions
//some classes or sub package in java.lang
/*
 * MATH
 * SYSTEM
 * LOADER
 * CLASSLOADER
 * THROWABLE
 * VOID
 * STRICTMATH
 * SECURITYMANAGER
 * PROCESS 
 * STRING
 * STRINGBUFFER
 * STRINGBUILDER
 * ENUM
 * DOUBLE
 * FLOAT ETC
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.management.RuntimeErrorException;

public class javalangpackage {
    public static void main(String[] args) {
        double d1=3.114;
        System.out.println("The value of double is : "+d1);

        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        String str;
        int i;
        int sum=0;
        System.out.println("Enter number 0 to quit");
        do{
            try{
                str=br.readLine();
            }catch(IOException e){
                throw new RuntimeErrorException(e);
            }
            try{
                i= Integer.parseInt(str);
            }
            catch(NumberFormatException e){
                i=0;
            }
            sum +=i;
            System.out.println("current sum :" +sum);
        }while(i!=0);
    }
}
