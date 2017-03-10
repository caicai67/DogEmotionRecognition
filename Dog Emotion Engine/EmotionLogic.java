/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dog.emotion.logic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Thomas
 */
public class EmotionLogic {
    public static class EmotionLogicEngine {
        public String currentEmotion;
        public ArrayList<String> listOfPossibleEmotions = new ArrayList<String>();
        public Map<String, String> emotionDictionary = new HashMap<String, String>();
        
        public void addAttribute(Attribute att) {
            // Actually, now I think about it, it doesn't even matter too much to have this if statement...
            if (att instanceof AppearanceAttribute) {
                listOfPossibleEmotions.add(emotionDictionary.get(att.attributeCode()));
            } else if (att instanceof BehavioralAttribute) {
                listOfPossibleEmotions.add(emotionDictionary.get(att.attributeCode()));
            }
            
            updateEmotion();
        }
        
        public void updateEmotion() {
            // Evaluate or revaluate the emotion
        }
        
        public String getCurrentEmotion() {
            return currentEmotion;
        }
        
        public void setEmotionDictionary() {
            emotionDictionary.put("0", "Confidence");
            emotionDictionary.put("1", "Confidence");
            emotionDictionary.put("2", "Confidence");
            emotionDictionary.put("3", "Companionship");
            emotionDictionary.put("4", "Cautious");
            emotionDictionary.put("5", "Stress Signals");
            emotionDictionary.put("6", "Stress Signals");
            emotionDictionary.put("7", "Stress Signals");
            emotionDictionary.put("8", "Stress Signals");
            emotionDictionary.put("9", "Stress Signals");
            emotionDictionary.put("10", "Anxiety & Avoidance");
            emotionDictionary.put("11", "Anxiety & Avoidance");
            emotionDictionary.put("12", "Anxiety & Avoidance");
            emotionDictionary.put("13", "Anxiety & Avoidance");
            emotionDictionary.put("14", "Smile");
            emotionDictionary.put("15", "Smile");
            
            emotionDictionary.put("Body0", "Confidence");
            emotionDictionary.put("Body1", "Companionship");
            emotionDictionary.put("Body2", "Cautious");
            emotionDictionary.put("Body3", "Fear");
            emotionDictionary.put("Body4", "Stress Signals");
            // Whenever | is included in the string, make sure to break it up
            emotionDictionary.put("GeneralMuscle0", "Relaxed & Neutral | Companionship");
            emotionDictionary.put("GeneralMuscle1", "Confidence");
            emotionDictionary.put("GeneralMuscle2", "Fear | Stress Signals");
            
            emotionDictionary.put("Lips0", "Relaxed & Neutral");
            emotionDictionary.put("Lips1", "Fear | Stress Signals");
            emotionDictionary.put("Lips2", "Smile");
            
            emotionDictionary.put("Eyes0", "Relaxed & Neutral");
            emotionDictionary.put("Eyes1", "Cautious");
            emotionDictionary.put("Eyes2", "Fear");
            emotionDictionary.put("Eyes3", "Stress Signals");
            
            emotionDictionary.put("Head0", "Curiosity");
            emotionDictionary.put("Head1", "Fear | Stress Signals");
            emotionDictionary.put("Head2", "Anxiety & Avoidance");
            
            emotionDictionary.put("Ears0", "Relaxed & Neutral");
            emotionDictionary.put("Ears1", "Confidence");
            emotionDictionary.put("Ears2", "Curiosity");
            emotionDictionary.put("Ears3", "Fear");
            emotionDictionary.put("Ears4", "Stress Signals");
            emotionDictionary.put("Ears5", "Anxiety & Avoidance");
            emotionDictionary.put("Ears6", "Smile");
            
            emotionDictionary.put("Tail0", "Cautious");
            emotionDictionary.put("Tail1", "Fear");
            
            emotionDictionary.put("Legs0", "Cautious");
            
            emotionDictionary.put("Back0", "Cautious");
            
            emotionDictionary.put("Tongue0", "Cautious");
            emotionDictionary.put("Tongue1", "Fear");
            emotionDictionary.put("Tongue2", "Stress Signals");
            emotionDictionary.put("Tongue3", "Stress Signals");
            
            emotionDictionary.put("Paw0", "Fear");
            emotionDictionary.put("Paw1", "Smile");
        }
    }
}
