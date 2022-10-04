/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q1ex3;

/**
 *
 * @author TAU
 */
public class Singer {
    String name;
    int noOfPerformances;
    double earnings;
    Song favoriteSong;
    int audience = 12;
    
    public void performForAudience(int audience){
        noOfPerformances += 1;
        earnings += 100*audience;
    }
    public void changeFavSong(){
    
    }
    public Singer(){
        System.out.print("A new singer has arrived.");
    }
    
}
