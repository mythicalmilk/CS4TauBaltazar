/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tau04.taubaltazar.java;

/**
 *
 * @author TAU
 */
public class Tau04TauBaltazarJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String name1 = "John";
        int ageJohn = 26;
        int heightJohn = 180;
        
        String name2 = "James";
        int ageJames = 34;
        int heightJames = 165;
        
        String name3 = "Jerry";
        int ageJerry = 45;
        int heightJerry = 170;
        
        int totalAge = ageJohn + ageJames + ageJerry;
        boolean isTaller = heightJohn > heightJames;
        boolean isOlder = ageJames > ageJerry;
        System.out.println("Person 1:");
        System.out.println("Name:" + name1);
        System.out.println("Age:" + ageJohn);
        System.out.println("Height:" + heightJohn);
        
        System.out.println("Person 2:");
        System.out.println("Name:" + name2);
        System.out.println("Age:" + ageJames);
        System.out.println("Height:" + heightJames);
        
        System.out.println("Person 3:");
        System.out.println("Name:" + name3);
        System.out.println("Age:" + ageJerry);
        System.out.println("Height:" + heightJerry);
        
        System.out.println("Total age of the 3 people:" + totalAge);
        // (operation: sum)
        System.out.println("John is taller than James:" + isTaller);
        // (operation: comparison)
        System.out.println("James is older than Jerry:" + isOlder);
        // (operation: comparison)
    }
    
}
