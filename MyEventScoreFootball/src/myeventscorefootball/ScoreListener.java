/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myeventscorefootball;
import java.util.EventListener;
/**
 *
 * @author GUS
 */
public interface ScoreListener extends EventListener{
    public void scoreChange(ScoreEvent evt);
}