import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FlappyBird here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FlappyBird extends Actor
{
    private GreenfootImage image1 = new GreenfootImage("flappybird1.png");
    private GreenfootImage image2 = new GreenfootImage("flappybird2.png");
    private GreenfootImage image3 = new GreenfootImage("flappybird3.png");
    
<<<<<<< HEAD
    //delta y, change in y
    private double dy = 0;
=======
    private double dy = 0;
    
>>>>>>> 4a003a755ada0e3cc9f13300555f27091d7aad72
    /**
     * Act - do whatever the FlappyBird wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
<<<<<<< HEAD
        final double GRAVITY = 0.9;
        
        //if( getImage() == image2 )
        if( getImage().equals( image2  ))
        {
            setImage( image3 );
        }
        else if( getImage().equals( image2 ) )
=======
        // Add your action code here.
        final double GRAVITY = 0.9;
        
        if( getImage().equals(image2) )
        {
            setImage( image3 );
        }
        else if( getImage().equals(image3) )
>>>>>>> 4a003a755ada0e3cc9f13300555f27091d7aad72
        {
            setImage( image1 );
        }
        
        setFlappyRotation();
        
<<<<<<< HEAD
        //casting cutts off decimals
        //math.round method 
=======
>>>>>>> 4a003a755ada0e3cc9f13300555f27091d7aad72
        setLocation( getX(), (int)( getY() + dy ) );
        
        checkKeyPress();
        
        dy += GRAVITY;
        
<<<<<<< HEAD
        checkGameOver();
    }  
    
    /**
     * setFlappyRotation changes the rotaion of flappybird 
     * due to effects ofgravity
     * 
     * @param There are no parameters
     * @return nothing will be returned
     */
    private void setFlappyRotation()
    {
        //degrees goes clockwise
        if( dy > -5 && dy < 5 )
        {
            //10 degrees
            setRotation( 10 );  
        } 
        else if ( dy > 5 && dy > 10 )
        {
            setRotation( 25 ); 
        }
        else if( dy > 10 && dy < 13 )
        {
            setRotation( 45 ); 
        }
        else if( dy > 13 && dy < 15 )
        {
            setRotation( 65 ); 
        }
        else if( dy > 15 )
        {
            setRotation( 90 ); 
=======
        //checkGameOver();
    }    
    
    /**
     * setFlappyRotation changes the rotation of Flappy Bird
     * due to the effects of gravity
     * 
     * @param There are no parameters
     * @return Nothing is returned
     */
    private void setFlappyRotation()
    {
        if( dy > -5 && dy < 5 )
        {
            setRotation( 10 );
        }
        else if( dy > 5 && dy < 10 )
        {
            setRotation( 25 );
        }
        else if( dy > 10 && dy < 13 )
        {
            setRotation( 45 );
        }
        else if( dy > 13 && dy < 15 )
        {
            setRotation( 65 );
        }
        else if( dy > 15 )
        {
            setRotation( 90 );
>>>>>>> 4a003a755ada0e3cc9f13300555f27091d7aad72
        }
    }
    
    /**
<<<<<<< HEAD
     * checkKeyPress will check if the user hits spacebar, which will make
     * flappy bird "jump"
     * 
     * @param there are no Parameters
=======
     * checkKeyPress checks whether the user has pressed the space bar
     * which will make Flappy Bird "jump"
     * 
     * @param There are no parameters
>>>>>>> 4a003a755ada0e3cc9f13300555f27091d7aad72
     * @return Nothing is returned
     */
    private void checkKeyPress()
    {
<<<<<<< HEAD
        //make it start jumping
        final int BOOST_SPEED = -7;
        if( Greenfoot.isKeyDown( "space" ) )
=======
        final int BOOST_SPEED = -7;
        
        if( Greenfoot.isKeyDown("space") )
>>>>>>> 4a003a755ada0e3cc9f13300555f27091d7aad72
        {
            dy = BOOST_SPEED;
            setRotation( -15 );
            setImage( image2 );
        }
    }
<<<<<<< HEAD
 
     /**
     * checkGameOver checks if the user has hit a pipe or bottom of world
     * 
     * @param There are no parameters
     * @return Nothing will be returned
     */
    private void checkGameOver()
    {
        //Get a referace to you world
        //cast to a flappyworld object
=======
    
    /**
     * checkGameOver checks if the user has hit a pipe or the bottom
     * of the world
     * 
     * @param There are no parameters
     * @return Nothing is returned
     */
    private void checkGameOver()
    {
        //Get a reference to your world
>>>>>>> 4a003a755ada0e3cc9f13300555f27091d7aad72
        FlappyWorld world = (FlappyWorld)getWorld();
        Pipe hitting = (Pipe)getOneIntersectingObject(Pipe.class);
        
        if( getY() >= world.getHeight() - 1 || hitting != null )
        {
<<<<<<< HEAD
            world.addObject( new GameOver(), world.getWidth() / 2, world.getHeight() / 2 );
=======
            world.addObject( new GameOver(), world.getWidth()/2, world.getHeight()/2 );
>>>>>>> 4a003a755ada0e3cc9f13300555f27091d7aad72
            losingAnimation();
            world.updateLeaderBoard();
        }
    }
    
    /**
<<<<<<< HEAD
     * losingAnimation animates FlappyBird falling to ground when user loses
     * 
     * @param There are no parameters
     * @return Nothing will be returned
     */
    private void losingAnimation()
    {
        while ( getY() <= getWorld().getHeight() - 5 )
=======
     * losingAnimation animates Flappy Bird falling to the ground
     * when the user loses
     * 
     * @param There are no parameters
     * @return Nothing is returned
     */
    private void losingAnimation()
    {
        while( getY() <= getWorld().getHeight() - 5 )
>>>>>>> 4a003a755ada0e3cc9f13300555f27091d7aad72
        {
            setLocation( getX(), getY() + 5 );
            Greenfoot.delay(2);
        }
        
        getWorld().removeObject( this );
    }
<<<<<<< HEAD
}
    
=======
    
    
    
    
    
    
    
    
    
    
    
}
>>>>>>> 4a003a755ada0e3cc9f13300555f27091d7aad72
