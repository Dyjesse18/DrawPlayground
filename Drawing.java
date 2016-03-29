import java.awt.event.*;
import java.swing.*;
import java.awt.*;
public class JMenuFrame extends JFrame implements Action Listener
{
        public JMenuFrame()
        {
                        System.out.println("Creating_Super...(JMenuFrame)");
                super();
                        System.out.println("Creating_JFrameMenu...(JMenuFrame)");
                this.setLayout(new BorderLayout() );
                this.setName( "JFrameMenu" );
                this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
                        System.out.println("Creating_Tool&Drawing_Panels...(JMenuFrame)")
                DrawingPane dPane = new DrawingPane();
                ToolPanel tPane = new ToolPanel();
                        System.out.println("Creating_Components...(JMenuFrame)");
                JMenuBar menuBar;
                JMenu menu;
                JMenuItem menuItem;
                JMenu subMenu;
                        System.out.println("Adding_tPane&dPane...(JMenuFrame)")
                this.add( tPane, BorderLayout.WEST );
                this.add( dPane, BorderLayout.CENTER );
                        System.out.println("New_MenuBar...(JMenuFrame)");
                menuBar = new JMenuBar();
                        System.out.println("Creating_JMenu...(JMenuFrame)");
                 menu = new JMenu( "Menu_" );
                        System.out.println("Creating_Help_MenuItem...(JMenuFrame)");
                menuItem = new JMenuItem( "Help" );
                menuItem.setActionCommand( "A1" );
                menuItem.addActionListener( this );
                menu.add(menuItem);
                        System.out.println("Creating_Clear_MenuItem(JMenuFrame)...");
                menuItem = new JMenuItem( "Clear" );
                menuItem.setActionCommand( "A2" );
                menuItem.addActionListener( this );
                menu.add(menuItem);
        }//end of JMenuFrame
}//end of JFrame extentension
public class DrawingPane extends JPanel implements ActionListener, MouseMotionListener, MouseListener 
{
                System.out.println("Creating_Super...");
        super();
                System.out.println("Created_Super...");
                public DrawingPane()
                {
                                System.out.println("Creating_Border(DrawingPane)...");
                        sertBorder( BorderFactory.createLineBorder(Color.BLUE);
                                System.out.println("Created_Border(DrawingPane)...");
                                System.out.println("Making_Visible(DrawingPane)...");
                        setVisible( true );
                                System.out.println("Now_Visible(DrawingPane)...");
                                System.out.println("Creating_Listeners(DrawingPane)...");
                        addMouseListener( this );
                        addMouseMotionListener( this );
                                System.out.println("Listeners_Created(DrawingPane)...");
                }
}//end of drawing pane extends class    
public void actionPerformed( ActionEvent e ) {
        switch( e.getActionCommand() ) {
            default:
                System.out.println( "EVIL BAD PLACE TWO" );
                System.exit(-1);
                break;
        }//end of switch
    }//end of actionPerformed
    @Override
    public void mouseClicked(MouseEvent e) {
    }
    @Override
    public void mousePressed(MouseEvent e) {
        // handle what happens when the mouse is clicked. This will hinge upon
        // the mode the user has selected in the tool panel.
        System.out.println( "mousePressed" );
    }
    @Override
    public void mouseDragged(MouseEvent e) {
        System.out.println( "mouseDragged" );
    }
    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println( "mouseReleased()" );
    }
    @Override
    public void mouseEntered(MouseEvent e) {
    }
    @Override
    public void mouseExited(MouseEvent e) {
    }

    @Override
    public void mouseMoved(MouseEvent e) {
    }

public static void main(String[] args)
{
        JMenuFrame myFrame = new JMenuFrame();        
}//end of main
