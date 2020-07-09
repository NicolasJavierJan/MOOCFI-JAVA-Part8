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

public class IOU {
    private HashMap<String, Double> IOU;
    
    public IOU(){
        this.IOU = new HashMap<>();
    }
    
    public void setSum(String toWhom, double amount){
        this.IOU.put(toWhom, amount);
    }
    
    public double howMuchDoIOweTo(String toWhom){
        double debt = this.IOU.getOrDefault(toWhom, 0.0);
        return debt;
    }
}
