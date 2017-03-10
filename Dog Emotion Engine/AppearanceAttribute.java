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
public class AppearanceAttribute implements Attribute{
    private String physicalPart;
    private int appearanceNum;
    
    private String[] bodyApp = {"Forward body position", "Body Orientation leaning towards/into", "Body orientation of forward and backwards",
        "Rounded, lowered posture", "Braced or rounded posture/ leaning away"};
        
    private String[] generalMuscleApp = {"Lack of tension", "Relaxed Muscles", "Face/Body Tention"};
        
    private String[] lipsApp = {"Lips loose", "Tightened Lip Commissures", "Lips Pulled"};
        
    private String[] eyesApp = {"Eyes blinking and soft"," Orientation of eyes and nose", "Dilated Pupils, Whale Eyes",
        "Dilated pupils, looking away, squinting or whale eyes"};
        
    private String[] headApp = {"Head tilt", "Lowered Head", "Hiding(face)"};
        
    private String[] earsApp = {"Ears hanging relaxed", "Ears alert", "Erect ears, without tention",
        "Ears Flattened", "Ears Down/ Back", "Ears back", "Ears Variable"};
        
    private String[] tailApp = {"Lowered Tail", "Tail tucked"};
        
    private String[] legsApp = {"Brace front leg"};
        
    private String[] backApp = {"Rounded Back"};
        
    private String[] tongueApp = {"Tongue flick\n", "Lip Licking/ Tongue Flick",
        "Lip Licking, \"Spatual\" tongue", "Hyper-Salivation"};
        
    private String[] pawApp = {"Sweaty paw prints/ lifted paw", "Paw lift"};
    
    public AppearanceAttribute(String physicalPart, int appearanceNum) {
        this.physicalPart = physicalPart;
        this.appearanceNum = appearanceNum;
    }
    
    public String attributeType() {
        return "Appearance";
    }
    
    public String physicalPart() {
        return physicalPart;
    }
    
    public String attributeCode() {
        return physicalPart + appearanceNum;
    }
    
    public String attributeDescription() {
        switch (physicalPart) {
            // Check for null during code review lol
            case "Body":
                return bodyApp[appearanceNum];
            case "GeneralMuscle":
                return generalMuscleApp[appearanceNum];
            case "Lips":
                return lipsApp[appearanceNum];
            case "Eyes":
                return eyesApp[appearanceNum];
            case "Head":
                return headApp[appearanceNum];
            case "Ears":
                return earsApp[appearanceNum];
            case "Tail":
                return tailApp[appearanceNum];
            case "Legs":
                return legsApp[appearanceNum];
            case "Back":
                return backApp[appearanceNum];
            case "Tongue":
                return tongueApp[appearanceNum];
            case "Paw":
                return pawApp[appearanceNum];
        }
        
        return "None, Error";
    }
}
