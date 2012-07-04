package first.component;

import javafx.scene.control.Control;
import javafx.scene.control.Skinnable;

public class Arrow extends Control implements Skinnable
{

    private final ArrowSkin skin;
    public Arrow() 
    {
        skin = new ArrowSkin(this);        
        setSkin(skin);        
    }
}
