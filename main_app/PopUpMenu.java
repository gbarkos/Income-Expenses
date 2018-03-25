package main_app;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;

public class PopUpMenu extends JPopupMenu{
    JMenuItem anItem;
 
    public PopUpMenu(){

        anItem = new JMenuItem("Διαγραφή Εγγραφής");
        add(anItem);
        
    }
    
}
