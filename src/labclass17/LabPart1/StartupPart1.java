/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labclass17.LabPart1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Owner
 */
public class StartupPart1 {
    
    public static void main(String[] args) {
        
        List<String> carParts = new ArrayList<>();
        
        carParts.add("engine");
        carParts.add("frame");
        carParts.add("seats");
        carParts.add("gasoline");
        
        carParts.add(4, "wheels");
        
        //Cannot skip in a list
        //carParts.add(6, "windows");
                
        for(String c : carParts) {
            System.out.println(c);
        }
        System.out.println();
        
        for (int i = 0; i < carParts.size(); i++){
            carParts.set(i, carParts.get(i).concat(" is broken. Sorry."));
        }
        
        for(String c : carParts) {
            System.out.println(c);
        }
        
        System.out.println();
        
        carParts.set(0, "better engine");
        carParts.set(4, "wheels got stolen");
        
        for(String c : carParts) {
            System.out.println(c);
        }
        
        
        
    }
    
}
