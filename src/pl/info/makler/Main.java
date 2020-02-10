package pl.info.makler;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner myObj = new Scanner(System.in);
	String number = myObj.next();

	switch (number.length()){
        case 1:{
            if (number == "0") {
                System.out.println("1");
                break;
            }
        }
        case 2:{
            if (number.charAt(0)=='0' && number.charAt(1)=='0'){
                System.out.println("1");
                break;
            }
        }
        case 3:{
            if (number.charAt(2)=='0' && number.charAt(0)==number.charAt(1)){
                System.out.println("1");
                break;
            }
        }
        case 4:{
            if (number.charAt(0)==number.charAt(3) && number.charAt(1)==number.charAt(2)){
                System.out.println("1");
                break;
            }

        }
        default: {
            System.out.println("0");
        }
    }
    }
}
