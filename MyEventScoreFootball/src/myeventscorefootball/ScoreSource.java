/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myeventscorefootball;
import java.util.ArrayList;

/**
 *
 * @author GUS
 */
public class ScoreSource {
   private ArrayList<ScoreListener> mySub;
    
    public ScoreSource() {
        mySub = new ArrayList<>();
    }
    
    public void addScoreListener(ScoreListener sl) {
        mySub.add(sl);
    }
    
    public void setScoreLine(String score) {
        fireScoreEvent(new ScoreEvent(this, score));
    }
    
    public void fireScoreEvent(ScoreEvent evt) {
        mySub.forEach(sl -> {
            sl.scoreChange(evt);
        });
    }
}