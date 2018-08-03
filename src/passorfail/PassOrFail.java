/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package passorfail;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class PassOrFail {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
            int[] weights=new int[4];
            for(int m = 0 ; m < 10; m++) {
		for (int i=0;i<4;i++) {
	            weights[i]=sc.nextInt();
	        }
	        int passCount=0;
	        int noStudent=sc.nextInt();
	        for (int i=0;i<noStudent;i++) {
                    int studentFinal=0;
	            for (int j=0;j<4;j++) {
	            	studentFinal+=sc.nextInt()*weights[j];
	            }
	            if (studentFinal>=5000) passCount++;
	        }
	        System.out.println(passCount);
	}
    }
}
