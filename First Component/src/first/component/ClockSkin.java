/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package first.component;

import com.sun.javafx.scene.control.behavior.BehaviorBase;
import javafx.scene.Node;
import javafx.scene.control.Skin;
import javafx.scene.control.Control;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

/**
 *
 * @author rob
 */
public class ClockSkin implements Skin<Clock> 
{
    private Clock skinable;
    private StackPane root;
    private Circle cirlce;
    
   public ClockSkin(Clock clock)
   {
       skinable = clock;
       root = new StackPane();
       cirlce = new Circle();
       cirlce.setFill(Color.BLACK);
       root.getChildren().add(cirlce);
   }

    @Override
    public void dispose() 
    {
        
    }

    @Override
    public Node getNode() {
        double w = skinable.getWidth();
        double h = skinable.getHeight();
        cirlce.setCenterX(w/2);
        cirlce.setCenterY(h/2);
        double r = w;
        if(h < r)
            r = h;
        cirlce.setRadius(r/3);
        return root;
    }

    @Override
    public Clock getSkinnable() {
        return skinable;
    }
   
   
   
   
}
