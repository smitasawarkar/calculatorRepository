package maveric.Calculator;

import java.util.Scanner;

public class Substraction {
	
	public static void main(String[] args){
        int inInt1;
        int inInt2;
        int outInt;
        
        Scanner in = new Scanner(System.in);
        
        inInt1 = in.nextInt();
        inInt2 = in.nextInt();
        outInt = inInt1 - inInt2;
        
        System.out.println(outInt);

    }

}
