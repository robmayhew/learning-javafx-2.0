/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package first.component;

import javafx.scene.control.Control;
import javafx.scene.control.Skinnable;

/**
 *
 * @author rob
 */
public class Clock extends Control implements Skinnable
{
    public Clock()
    {
        setSkin(new ClockSkin(this));
        setMaxHeight(Double.MAX_VALUE);
        setMaxWidth(Double.MAX_VALUE);
    }
}
