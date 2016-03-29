import java.awt.event.*;
import java.swing.*;
import java.awt.*;
public class JMenuFrame extends JFrame implements Action Listener
{
        public JMenuFrame()
        {
                        System.out.println("Creating_Super...");
                super();
                        System.out.println("Creating_JFrameMenu...");
                this.setLayout(new BorderLayout() );
                this.setName( "JFrameMenu" );
                this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
                        System.out.println("Creating_Tool&Drawing_Panels...")
                DrawingPane dPane = new DrawingPane();
                ToolPanel tPane = new ToolPanel();
                        System.out.println("Creating_Components...");
                JMenuBar menuBar;
                JMenu menu;
                JMenuItem menuItem;
                JMenu subMenu;
                        System.out.println("Adding_tPane&dPane...")
                this.add( tPane, BorderLayout.WEST );
                this.add( dPane, BorderLayout.CENTER );
                        System.out.println("New_MenuBar...");
                menuBar = new JMenuBar();
                        System.out.println("Creating_JMenu...");
                 menu = new JMenu( "Menu_" );
                        System.out.println("Creating_Help_MenuItem...");
                menuItem = new JMenuItem( "Help" );
                menuItem.setActionCommand( "A1" );
                menuItem.addActionListener( this );
                menu.add(menuItem);
                        System.out.println("Creating_Clear_MenuItem...");
                menuItem = new JMenuItem( "Clear" );
                menuItem.setActionCommand( "A2" );
                menuItem.addActionListener( this );
                menu.add(menuItem);
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
        }//end of JMenuFrame
}//end of JFrame extentension
public static void main(String[] args)
{
        JMenuFrame myFrame = new JMenuFrame();        
}//end of main
