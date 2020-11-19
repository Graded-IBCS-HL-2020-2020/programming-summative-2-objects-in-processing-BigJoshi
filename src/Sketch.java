
/** MAKE SURE TO READ THE README CAREFULLY BEFORE YOU BEGIN EDITING THIS CODE */
import processing.core.PApplet;

public class Sketch extends PApplet {

    /*
     * SUMMATIVE REQUIRED Declare at least four balls, four bubbles, and four
     * snowflakes as instance variables. I have made the first ball for you.
     * 
     * SUMMATIVE OPTIONAL Use *arrays* to store the elements, rather than individual
     * variables.
     */

     Ball[] balls;
     Bubble[] bubbles;
     Snowflake[] snowflakes;


  
   public void settings() {
        size(500, 500);
    }

    /*
     * SUMMATIVE REQUIRED Initialize the balls, bubbles, and snowflakes using your
     * constructors inside of setup(). You must use a non-default-constructor at
     * least once and a default constructor at least once for each type.
     * 
     * I have done the first ball for you.
     */
    public void setup() {
        frameRate(30);
        balls = new Ball[]{new Ball(this), new Ball(this, 300, 100, 30, 10, 15, 15), new Ball(this), new Ball(this)};

        bubbles = new Bubble[]{new Bubble(this), new Bubble(this, 30, 20, 20), new Bubble(this), new Bubble(this)};

        snowflakes = new Snowflake[]{new Snowflake(this), new Snowflake(this, 75, 50, 10, 40, 20), new Snowflake(this), new Snowflake(this)};
        
       

    }

    public void draw() {
        background(100);

        /* SUMMATIVE REQUIRED Draw and move all balls, snowflakes, and bubbles */
        balls[0].drawBall();
        balls[0].moveBall();
        balls[1].drawBall();
        balls[1].moveBall();
        balls[2].drawBall();
        balls[2].moveBall();
        balls[3].drawBall();
        balls[3].moveBall();
        bubbles[0].drawBubble();
        bubbles[0].moveBubble();
        bubbles[1].drawBubble();
        bubbles[1].moveBubble();
        bubbles[2].drawBubble();
        bubbles[2].moveBubble();
        bubbles[3].drawBubble();
        bubbles[3].moveBubble();
        snowflakes[0].drawSnowflake();
        snowflakes[0].moveSnowflake();
        snowflakes[1].drawSnowflake();
        snowflakes[1].moveSnowflake();
        snowflakes[2].drawSnowflake();
        snowflakes[2].moveSnowflake();
        snowflakes[3].drawSnowflake();
        snowflakes[3].moveSnowflake();
    }

    /**
     * Convenience method to return a random color
     * 
     * @param transluscent if true, make the color transluscent, otherwise solid
     */
    public int randomColor(boolean transluscent) {
        int alpha;
        if (transluscent) {
            alpha = 125;
        } else {
            alpha = 255;
        }
        return color(random(0, 255), random(0, 255), random(0, 255), alpha);
    }

    /*
     * SUMMATIVE OPTIONAL Add a void method called mousePressed() that stops some or
     * all of the balls from moving when you click the mouse. (it will run
     * automatically when you click if the name is correct)
     * 
     * EXTRA CHALLENGE - can you make it so that only the ball you actually CLICKED
     * stops? (this is a major challenge - you can use the variables mouseX and
     * mouseY to see where the mouse was clicked.)
     */
    public void mousePressed() {
      balls[0].stop();
      balls[1].stop();
      balls[2].stop();
      balls[3].stop();
    }

    public void mouseReleased() {
      balls[0].start();
      balls[1].start();
      balls[2].start();
      balls[3].start();
    }

    public static void main(String[] args) {
        PApplet.main("Sketch");
    }
}
