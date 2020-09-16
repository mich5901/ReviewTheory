package Part1;

import TurtleGraphics.*;
import BreezySwing.*;

public class ObjectExample {

    public static void main(String[] args) {
        Pen p1 = new StandardPen();

        /*multiline comment
        objects are created from a CLASS
        p1 is an INSTANCE (object) of the Pen class
        Instantiating an object = making an object
         */
        p1.move(25);
        p1.move(-30, 50);
        /*p1 -> brings up a list of methods that p1 has
        Some methods are found directly in the pen class.
        Others are inherited from the "Class of all Classes" -> object
        examples - > toString, hashCode, compareTo
         */

        SketchPadWindow w = new SketchPadWindow(500, 500);
        WigglePen wp = new WigglePen(w);
        Pen rp = new RainbowPen(w);

        /*
        It's common to have more than one way to make an object.
        Cna mke a pen with a custom window or default window.
         */
        wp.move(200);
        rp.setDirection(145);
        rp.move(100);

        /*
        Even though wigglepen and rainbowpen are different types of pens
        they respond to the same commands as p1.
        Since all three pens have the "Pen" class as their parent,
        pen is where most of these methods are defined and the three actual pens
        inherit these methods.
         */
    }

}
