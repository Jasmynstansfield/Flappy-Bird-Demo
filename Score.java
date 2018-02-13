import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class Score here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Score extends Actor
{
    private int score;
    private String name;
    private boolean scoreChanged;
    
    /**
<<<<<<< HEAD
     * Score is the constuctor of objects of type Score
=======
     * Score is the constructor of objects of type Score
>>>>>>> 4a003a755ada0e3cc9f13300555f27091d7aad72
     * 
     * @param There are no parameters
     * @return an object of type Score
     */
    public Score()
    {
        GreenfootImage scoreImage;
        
        score = 0;
        name = "";
        scoreChanged = false;
        
<<<<<<< HEAD
        scoreImage = new GreenfootImage( String.format("Name:%15s %5s Score:%12d", name, "", score), 30, Color.BLACK, Color.WHITE);
=======
        scoreImage = new GreenfootImage( String.format("Name:%15s %5s Score:%12d", name, "", score), 30, Color.BLACK, Color.WHITE );
>>>>>>> 4a003a755ada0e3cc9f13300555f27091d7aad72
        setImage( scoreImage );
    }
    
    /**
<<<<<<< HEAD
     * act is thw code that is run on each iteration of the at cycle
     * 
     * @param There are no parameters
     * @return Nothing will be returned
     */
    public void act() 
    {
        if( scoreChanged == true)
=======
     * act is the code that is run on each iteration of the act cycle
     * 
     * @param There are no parameters
     * @return Nothing is returned
     */
    public void act() 
    {
        // Add your action code here.
        if( scoreChanged == true )
>>>>>>> 4a003a755ada0e3cc9f13300555f27091d7aad72
        {
            display();
        }
    } 
    
    /**
     * countScore increases the score
     * 
     * @param There are no parameters
<<<<<<< HEAD
     * @return Nothing will be returned
     */
    public void countScore()
    {
        score ++;
=======
     * @return Nothing is returned
     */
    public void countScore()
    {
        score++;
>>>>>>> 4a003a755ada0e3cc9f13300555f27091d7aad72
        scoreChanged = true;
    }
    
    /**
<<<<<<< HEAD
     * setPlayerName changes the name displayed on leaderboard
     * 
     * @param playerName is the new player's name
     * @return Nothing will be returned
     */
    public void setPlayerName( String playerName )
    {
      name = playerName;
      scoreChanged = true;
=======
     * setPlayerName changes the name displayed on the leaderboard
     * 
     * @param playerName is the new player's name
     * @return Nothing is returned
     */
    public void setPlayerName( String playerName )
    {
        name = playerName;
        scoreChanged = true;
>>>>>>> 4a003a755ada0e3cc9f13300555f27091d7aad72
    }
    
    /**
     * getScore gets the current score for the player
     * 
     * @param There are no parameters
     * @return an integer representing the player's score
     */
    public int getScore()
    {
        return score;
    }
    
    /**
<<<<<<< HEAD
     * display displays the scoreboards image
     * 
     * @param There are no parameters
     * @return Nothing will be returned
     */
    private void display()
    {
        GreenfootImage newImage = new GreenfootImage( String.format("Name:%15s %5s Score:%12d", name, "", score), 30, Color.BLACK, Color.WHITE);
        setImage( newImage);
        scoreChanged = false;
    }
    
=======
     * display displays the Scoreboard's image
     * 
     * @param There are no parameters
     * @return Nothing is returned
     */
    private void display()
    {
        GreenfootImage newImage = new GreenfootImage( String.format("Name:%15s %5s Score:%12d", name, "", score), 30, Color.BLACK, Color.WHITE );
        setImage( newImage );
        scoreChanged = false;
    }
    
    
    
    
    
    
    
    
    
    
>>>>>>> 4a003a755ada0e3cc9f13300555f27091d7aad72
}
