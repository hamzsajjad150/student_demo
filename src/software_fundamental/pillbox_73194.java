/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package software_fundamental;

/**
 *
 * @author khanh
 */
public class pillbox_73194 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char [] pillbox = new char[7];
        pillbox[0] = 'D';
        pillbox[1] = 'r';
        pillbox[2] = '.';
        pillbox[3] = 'J';
        pillbox[4] = 'a';
        pillbox[5] = 'v';
        pillbox[6] = 'a';
        
        char [] pillbox1 = {'w','e','e','k','e','n','d'};
        
        for (int i = pillbox.length - 1; i >=0; i--){
            System.out.print(pillbox[i]);
        }
        System.out.println();
    }
    
}
