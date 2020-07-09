/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nico
 */

import java.util.HashMap;
import java.util.ArrayList;

public class StorageFacility {
    private HashMap<String, ArrayList<String>> storageFacility;
    
    public StorageFacility() {
        this.storageFacility = new HashMap<>();
    }
    
    public void add(String unit, String item){
        this.storageFacility.putIfAbsent(unit, new ArrayList<>());
        this.storageFacility.get(unit).add(item);
    }
    
    public ArrayList<String> contents(String unit){
        return this.storageFacility.getOrDefault(unit, new ArrayList<>());
    }
    
    public void remove(String unit, String item){
        this.storageFacility.get(unit).remove(item);
        if (this.storageFacility.get(unit).size() == 0){
            this.storageFacility.remove(unit);
        }
    }
    
    public ArrayList<String> storageUnits(){
        ArrayList<String> units = new ArrayList<>();
        for (String unit : this.storageFacility.keySet()){
            if (this.storageFacility.get(unit).size() > 0){
                units.add(unit);
            }
        }        
        return units;
    }
}
