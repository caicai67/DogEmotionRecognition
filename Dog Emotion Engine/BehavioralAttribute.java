/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dog.emotion.logic;

/**
 *
 * @author Thomas
 */
public class BehavioralAttribute {
    private int behaviorNum;
    private String[] listBehavioral = {"Relaxed but concentrating", "Use of paws, nose, mouth", 
            "Engagement in activity", "Proximity", "Concentrating", "Scratching", "Panting",
            "Hair Loss", "Sniffing", "Yawning", "Move into pressure/Escape from pressure",
            "Fidgety(jumping, climbing, rolling", "Look Away", "Stress Signals", "Can be happy, submissive",
            "(Sit Position)"};
    
    public BehavioralAttribute(int behaviorNum) {
        this.behaviorNum = behaviorNum;
    }
    
    public String attributeCode() {
        return Integer.toString(behaviorNum);
    }
    
    public String attributeDescription() {
        return listBehavioral[behaviorNum];
    }
}
