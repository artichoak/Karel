package lab_1.individual_lab;
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class Problem3 extends Robot
{
    public Problem3(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void giveCarlBeeper() {
turnLeft();
        turnLeft();
        turnLeft();
        move();
        move();
        move();
        putBeeper();
        turnLeft();
        turnLeft();
        move();
        move();
        move();
        turnLeft();
        turnLeft();
        turnLeft();

        
    }
    
    public void pickAndMoveBeeper() {

   pickBeeper();
        turnLeft();
        move();
        move();
        putBeeper();
        turnLeft();
        turnLeft();
        move();
        move();
        turnLeft();

    }
   
}