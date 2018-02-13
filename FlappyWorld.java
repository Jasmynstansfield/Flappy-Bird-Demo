import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
import javax.swing.JOptionPane;
import java.util.List;

/**
 * Write a description of class MyWorld here.
 * 
 * jasmynstansfield
 * feburary 6, 2018
 */
public class FlappyWorld extends World
{
<<<<<<< HEAD
=======
    
>>>>>>> 4a003a755ada0e3cc9f13300555f27091d7aad72
    private int pipeCounter;
    private int flappyCounter;
    
    private String playerName;
    
    private boolean gameStart = false;
    
    private Score scoreBoard;
    
    private String[] leaderNames;
    private int[] leaderScores;
    
    /**
<<<<<<< HEAD
     * FlappyWorld is the constructor of objects of type FlappyWorld
=======
     * FlappyWorld is the constructor for objects of type FlappyWorld
>>>>>>> 4a003a755ada0e3cc9f13300555f27091d7aad72
     * 
     * @param There are no parameters
     * @return An instance of type FlappyWorld
     */
    public FlappyWorld()
    {
        
        super(600, 400, 1);
        
        setPaintOrder( Score.class, GameOver.class, BottomPipe.class, TopPipe.class, FlappyBird.class);
        
<<<<<<< HEAD
        populateWorld(); 
=======
        populateWorld();
>>>>>>> 4a003a755ada0e3cc9f13300555f27091d7aad72
        
        gameStart = false;
        
        leaderNames = new String[10];
        leaderScores = new int[10];
<<<<<<< HEAD
    
        //sets scores to -1
        for( int i = 0; i < leaderScores.length; i++ )
        {
            leaderScores[i] = -1;
        }
    
        //starts scenario when a new FlappyWorld is created
        Greenfoot.start();
    
}

/**
 * PopulateWorld is going to add objects to our world to prepare the game
 * 
 * @param There are no parameters
 * @return Nothing is returned
 */
private void populateWorld()
{
    scoreBoard = new Score();
    
    //x-coordinate= 50 pixles from left, y-coordinate= height of world / 2
    addObject( new FlappyBird(), 50, getHeight() /2 );
    addObject( new Ground(), getWidth() /2, 375);
    addObject( scoreBoard, getWidth() /2, getHeight() - 20);
    
    pipeCounter = -100;
    flappyCounter = -10;

}

/**
 * act is thw code that is run on each iteration of the at cycle
 * 
 * @param There are no parameters
 * @return Nothing will be returned
 */
public void act()
{
    final int FIRST_PIPE = 290;
    
    if (gameStart == false ) 
    {
        playerName = JOptionPane.showInputDialog( null, "Please enter your name:", "Player Name", JOptionPane.QUESTION_MESSAGE);
        scoreBoard.setPlayerName( playerName );
        
        gameStart = true;
        
        showText("Get ready to play!\nUse the spacebar to control Flappy Bird!", getWidth()/2, getHeight()/2);
        //delays running of code for 100 act cycles
        Greenfoot.delay(100);
        showText( "3", getWidth()/2, getHeight()/2);
        //60 act cycles per second
        Greenfoot.delay(60);
        showText( "2", getWidth()/2, getHeight()/2);
        Greenfoot.delay(60);
        showText( "1", getWidth()/2, getHeight()/2);
        Greenfoot.delay(60);
        showText( "Go!", getWidth()/2, getHeight()/2);
        Greenfoot.delay(30);
        //empty string, get rid of previous text
        showText( "", getWidth()/2, getHeight()/2);
    } 
    else 
    {
        if( getObjects( FlappyBird.class ).size() > 0){
            pipeCounter++;
            
            if( pipeCounter % 100 == 0)
            {
                createPipes();
            }
            
            if( pipeCounter >= FIRST_PIPE)
            {
                if( flappyCounter % 100 == 0)
                {
                    scoreBoard.countScore();
                }
                
                flappyCounter ++;
            }
            
        }
        //flappyBird.class size = 0
        else 
        {
            showText("Press enter for a new game or\npress L for the leaderboard", getWidth()/2, 25);
            checkKeyPress();
        }
    }
}

/**
 * createPipes adds pipes at th edge of the world and randomizes their height
 * 
 * @param
 * @return
 */
private void createPipes()
{
    int topPipeHeight = Greenfoot.getRandomNumber( getHeight() /2 );
    
    TopPipe newTop = new TopPipe();
    BottomPipe newBottom = new BottomPipe();
    
    newTop.getImage().scale( newTop.getImage().getWidth(), topPipeHeight );
    newBottom.getImage().scale( newBottom.getImage().getWidth(), topPipeHeight + 200 );
    
    addObject (newTop, getWidth(), 0 );
    addObject (newBottom, getWidth(), getHeight() );
}

/**
 * checkKeyPress checks wheather the user wants to start a new game or display leaderboard
 * 
 * @param There are no parameters
 * @return Nothing will be returned
 */
private void checkKeyPress()
{
    if( Greenfoot.isKeyDown( "enter" ))
    {
        reset();
    }
    
    else if( Greenfoot.isKeyDown( "l" ))
    {
        displayLeaderboard();
    }
}

/**
 * reset will reset the game snd allows user to play again
 * 
 * @param There are no parameters
 * @return Nothing will be returned
 */
private void reset()
{
    //null is not specific to what object we want, all objects
    List allObjects = getObjects( null );
    
    removeObjects( allObjects );
    
    populateWorld();
    
    //need false to ask the user's name again (if statement above)
    gameStart = false;
    
    //location that displays leaderboard, if you press enter after seeing leadrboard
    showText("", getWidth() /2 - 25, getHeight() /2 + 25);
    
    //where we said "press enter or l..."
    showText("", getWidth() / 2, 25);
}

/**
 * displayLeaderboard will show the player the leaderboard in String.format
 * 
 * @param There are no parameters
 * @return Nothing will be returned
 */
private void displayLeaderboard()
{
    List allObjects = getObjects( null );
    
    /**% = placeholder, like x in math
    *15 = the amounf of spaces it can take up from the right
    *s = type of data on placeholder, string
    *space = space
    *first place holder = name
    *second = a nice space
    *third = score
    */
    String leaderBoard = String.format( "%15s %5s %5s\n", "Name", "", "Score");
    
    removeObjects( allObjects );
    
    //length of array, 10
    for( int i = 0; i < leaderScores.length; i ++ )
    {
        //leaderboard = leaderboard + ___
        //leaderNames = array
        leaderBoard += String.format( "\n%15s %5s %5s", leaderNames[i], "", leaderScores [i] );
    }
    
    showText( leaderBoard, getWidth() /2 - 25, getHeight() /2 + 25 );
}


/**
 * updateLeaderBoard will update the leaderboard
 * 
 * @param There are no parameters
 * @return Nothing will be returned
 */
public void updateLeaderBoard ()
{
    int currentScore = scoreBoard.getScore();
    int indexToPlace = -1;
    
    //starting at right side of array, 0-9, 0 = high, 9 = low
    //i = index, place in array
    for( int i = leaderScores.length - 1; i >= 0 && currentScore > leaderScores[i]; i-- )
    {
        indexToPlace = i;
    }
    
    if( indexToPlace != -1 )
    {
        //lenght = 10, -2 = 8, imdex of 8
        //index bigger or equal to index to place
        for( int i = leaderScores.length - 2; i >= indexToPlace; i-- )
        {
            leaderNames[i+1] = leaderNames[i];
            leaderScores[i+1] = leaderScores[i];
        }
        
        leaderNames[indexToPlace] = playerName;
        leaderScores[indexToPlace] = currentScore;
    }
}
=======
        
        for( int i = 0; i < leaderScores.length; i++ )
        {
            
            leaderScores[i] = -1;
        }
        
        //This starts your scenario when a new FlappyWorld is created
        Greenfoot.start();
    }
    
    /**
     * populateWorld is going to add objects to our world to prepare the game
     * 
     * @param No parameters
     * @return Nothing is returned
     */
    private void populateWorld()
    {
        scoreBoard = new Score();
        
        addObject( new FlappyBird(), 50, getHeight()/2 );
        addObject( new Ground(), getWidth()/2, 375 );
        addObject( scoreBoard, getWidth()/2, getHeight() - 20 );
        
        pipeCounter = -100;
        flappyCounter = -10;
    }
    
    /**
     * act is the code that is run on each iteration of the act cycle
     * 
     * @param There are no parameters
     * @return Nothing is returned
     */
    public void act()
    {
        final int FIRST_PIPE = 290;
        
        if( gameStart == false )
        {
            playerName = JOptionPane.showInputDialog( null, "Please enter your name:", "Player Name", JOptionPane.QUESTION_MESSAGE );
            scoreBoard.setPlayerName( playerName );
            
            gameStart = true;
            
            showText( "Get Ready To Play!\nUse the Space Bar to Control Flappy Bird!", getWidth()/2, getHeight()/2 );
            Greenfoot.delay(100);
            showText( "3", getWidth()/2, getHeight()/2 );
            Greenfoot.delay(60);
            showText( "2", getWidth()/2, getHeight()/2 );
            Greenfoot.delay(60);
            showText( "1", getWidth()/2, getHeight()/2 );
            Greenfoot.delay(60);
            showText( "Go!", getWidth()/2, getHeight()/2 );
            Greenfoot.delay(30);
            showText( "", getWidth()/2, getHeight()/2 );
        }
        else
        {
            if( getObjects( FlappyBird.class ).size() > 0 )
            {
                pipeCounter++;
                
                if( pipeCounter % 100 == 0 )
                {
                    createPipes();
                }
                
                if( pipeCounter >= FIRST_PIPE )
                {
                    if( flappyCounter % 100 == 0 )
                    {
                        scoreBoard.countScore();
                    }
                    
                    flappyCounter++;
                }
            }
            else
            {
                showText( "Press enter for a new game or \n press L for the leaderboard.", getWidth()/2, 25 );
                checkKeyPress();
            }
        }
    }
    
    /**
     * createPipes adds pipes at the edge of the world and randomizes their height
     * 
     * @param There are no parameters
     * @return Nothing is returned
     */
    private void createPipes()
    {
        int topPipeHeight = Greenfoot.getRandomNumber( getHeight() / 2 );
        
        TopPipe newTop = new TopPipe();
        BottomPipe newBottom = new BottomPipe();
        
        newTop.getImage().scale( newTop.getImage().getWidth(), topPipeHeight );
        newBottom.getImage().scale( newBottom.getImage().getWidth(), topPipeHeight + 200);
        
        addObject( newTop, getWidth(), 0 );
        addObject( newBottom, getWidth(), getHeight() );
    }
    
    /**
     * checkKeyPress checks whether the user wants to start a new game
     * or display the leaderboard
     * 
     * @param There are no parameters
     * @return Nothing is returned
     */
    private void checkKeyPress()
    {
        if( Greenfoot.isKeyDown( "enter" ) )
        {
            reset();
        }
        
        if( Greenfoot.isKeyDown( "l" ) )
        {
            displayLeaderBoard();
        }
    }
    
    /**
     * reset resets the game and allows the user to play a new game
     * 
     * @param There are no parameters
     * @return Nothing is returned
     */
    private void reset()
    {
        List allObjects = getObjects( null );
        
        removeObjects( allObjects );
        
        populateWorld();
        
        gameStart = false;
        
        showText( "", getWidth() / 2 - 25, getHeight() / 2 + 25 );
        
        showText( "", getWidth() / 2, 25 );
    }
    
    /**
     * displayLeaderBoard displays the leaderboard of the game in a
     * nicely formatted way
     * 
     * @param There are no parameters
     * @return Nothing is returned
     */
    private void displayLeaderBoard()
    {
        List allObjects = getObjects( null );
        
        String leaderBoard = String.format( "%15s %5s %5s\n", "Name", "", "Score" );
        
        removeObjects( allObjects );
        
        for( int i = 0; i < leaderScores.length; i++ )
        {
            leaderBoard += String.format( "\n%15s %5s %5s", leaderNames[i], "", leaderScores[i] );
        }
        
        showText( leaderBoard, getWidth() / 2 - 25, getHeight() / 2 + 25 );
    }
    
    /**
     * updateLeaderBoard updates the leaderboard
     * 
     * @param There are no parameters
     * @return Nothing is returned
     */
    public void updateLeaderBoard()
    {
        int currentScore = scoreBoard.getScore();
        int indexToPlace = - 1;
        
        for( int i = leaderScores.length - 1; i >= 0 && currentScore > leaderScores[i]; i-- )
        {
            indexToPlace = i;
        }
        
        if( indexToPlace != -1 )
        {
            for( int i = leaderScores.length - 2; i >= indexToPlace; i-- )
            {
                leaderNames[i+1] = leaderNames[i];
                leaderScores[i+1] = leaderScores[i];
            }
            
            leaderNames[indexToPlace] = playerName;
            leaderScores[indexToPlace] = currentScore;
        }
        
    }
    
>>>>>>> 4a003a755ada0e3cc9f13300555f27091d7aad72
}
