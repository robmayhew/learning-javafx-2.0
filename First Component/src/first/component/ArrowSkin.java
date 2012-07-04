/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package first.component;

import java.awt.MultipleGradientPaint;
import javafx.geometry.Bounds;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.control.Skin;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;
import javafx.scene.shape.LineTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;


/**
 *
 * @author Rob
 */
public class ArrowSkin implements Skin<Arrow> 
{
    private final Arrow control;
    private final Group node;
    
    public ArrowSkin(Arrow arrow) 
    {
        this.control = arrow;
        node = new Group();
        update();
    }

    @Override
    public void dispose() 
    {
        
    }

    @Override
    public Node getNode() 
    {
        update();
        return node;
    }

    @Override
    public Arrow getSkinnable() 
    {
        return control;
    }
    
    private void update()
    {
        Bounds bounds = node.getBoundsInParent();
        Path path = new Path();
        path.getElements().add(
                new MoveTo(
                bounds.getWidth() / 2 + bounds.getMinX(), 
                bounds.getMinY()));
        path.getElements().add(
                new LineTo(bounds.getMaxX(), bounds.getMaxY()));
        path.getElements().add(
                new LineTo(bounds.getMinX(), bounds.getMaxY()));
       path.setFill(Color.GOLD);
       node.getChildren().setAll(path);                
    }
    
    
    
    
    
}
