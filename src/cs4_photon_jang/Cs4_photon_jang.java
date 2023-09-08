/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cs4_photon_jang;

/**
 *
 * @author SEAN JANG
 */
public class Cs4_photon_jang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String role1 = "Captain", role2 = "Swordsman", role3 = "Cook";
        String df1 = "Hito Hito no Mi - Model Nika", df2 = "None", df3 = "None";
        long bounty1 = 3000000000L, bounty2 = 1111000000L, bounty3 = 1032000000L;
        long sumBounty = bounty1 + bounty2 + bounty3;
        boolean compBounty = bounty2 > bounty1;
        long divBounty = bounty3 / 2;
        
        System.out.println("Monkey D. Luffy\nRole: " + role1 + "\nDevil Fruit: " + df1 + "\nBounty: " + bounty1 + "\n");
        System.out.println("Roronoa Zoro\nRole: " + role2 + "\nDevil Fruit: " + df2 + "\nBounty: " + bounty2 + "\n");
        System.out.println("Vinsmoke Sanji\nRole: " + role3 + "\nDevil Fruit: " + df3 + "\nBounty: " + bounty3 + "\n");
        System.out.println("Total bounty: " + sumBounty + " // (operation: arithmetic)");
        System.out.println("Zoro has a greater bounty than Luffy: " + compBounty + " // (operation: comparison)");
        System.out.println("Half of Sanji's bounty: " + divBounty + " // (operation: arithmetic)");
    }
    
}
