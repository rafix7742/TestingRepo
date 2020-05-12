/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trycatchthowex;

/**
 *
 * @author Hamzi
 */
import java.util.Scanner;
public class TryCatchThowEx {

    /**
     * @param args the command line arguments
     */
    public static void ExceptionMethods(int a){
        if(a<6 ){
               throw new IllegalArgumentException("Try a vaild string");
                //the code does check for strings smaller than 6 but the loop breaks after
            }}
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner keyedInput = new Scanner(System.in);
        boolean[] valid = new boolean[6];
       valid[0]=false;
       //valid[1]=false;
       //valid[2]=false;
       //valid[3]=false;
       //valid[4]=false;
       //valid[5]=false;
       int invNum =0; 
       while (valid[0] ==false){
            System.out.println("Enter a String larger than 6 charcaters");
            String UserStr = keyedInput.nextLine();
            //String Val =String.valueOf(UserInt); 
          int i = UserStr.length();
            //System.out.println(i);
            ExceptionMethods (i);
            
            if(i>6 ){
                invNum = 1;
                
            }
            try{
               invNum = 2/invNum;
               valid[0]=true;
                System.out.println(invNum);
                if(i>6 ){
                invNum = 1;
                
            }
            }catch(ArithmeticException e){
                System.out.println("Try a valid String");
                System.out.println(invNum);
            }
        }
        
    }
    
}
