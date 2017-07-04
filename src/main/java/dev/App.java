package dev;

import java.util.Scanner;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	int c,d,e,f,g;
        System.out.println( "***** Application Opérateurs *****" );
        Scanner question = new Scanner(System.in) ;
        
        System.out.println( "Veuillez saisir le premier nombre..." );
        int a=question.nextInt();
        
        System.out.println( "Veuillez saisir le second nombre..." );
        int b=question.nextInt();
        
        c=a+b;
        System.out.println( a+" + "+b+" = "+c );
        d=a-b;
        System.out.println( a+" - "+b+" = "+d);
        e=a*b;
        System.out.println( a+" * "+b+" = "+e);
        f=a/b;
        System.out.println( a+" / "+b+" = "+f);
        g=a%b;
        System.out.println( a+" % "+b+" = "+g);
        
        
    }
}
