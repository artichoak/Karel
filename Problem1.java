package lab_1.individual_lab;
import kareltherobot.*; 


/**
 * @author :  Apurva OAK
 * Karel places the beepers from vertical to horizontal
 *  turnLeft(); 
 *  move();
 *  putBeeper();
 *  pickBeeper();
 */
public class Problem1 extends Robot
{
    public Problem1(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void rearrangeBeepers() {
       move();
       move();
       turnLeft(); 
       move();
       pickBeeper();
       move();
       pickBeeper();
       turnLeft();
       turnLeft();
       move();
       move();
       move();
       pickBeeper();
       move();
       pickBeeper();
       turnLeft();
       turnLeft();
       move();
       move();
       turnLeft();
       move();
       putBeeper();
       move();
       putBeeper();
       turnLeft();
       turnLeft();
       move();
       move();
       move();
       putBeeper();
       move();
       putBeeper();
       turnLeft();
       turnLeft();
       move();
       move();
       turnLeft();
       turnLeft();
       turnLeft();
    }
   
}