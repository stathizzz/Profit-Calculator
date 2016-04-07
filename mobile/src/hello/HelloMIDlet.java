/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hello;

import java.lang.*;
import javax.microedition.midlet.*;
import javax.microedition.lcdui.*;
import org.netbeans.microedition.lcdui.SimpleTableModel;
import org.netbeans.microedition.lcdui.SplashScreen;
import org.netbeans.microedition.lcdui.TableItem;
import org.netbeans.microedition.util.SimpleCancellableTask;

/**
 * @author Vad
 */
public class HelloMIDlet extends MIDlet implements CommandListener {

    private boolean midletPaused = false;
    
  /** An alert to be reused for different errors. */
    private final Alert alert = new Alert("Error", "", null, AlertType.ERROR);

    //<editor-fold defaultstate="collapsed" desc=" Generated Fields ">//GEN-BEGIN:|fields|0|
    private Command exitCommand4;
    private Command okCommand3;
    private Command exitCommand2;
    private Command okCommand;
    private Command backCommand1;
    private TextBox HelpScreen;
    private SplashScreen splashScreen;
    private Form Dedomena;
    private TextField textField;
    private TextField textField2;
    private TextField textField1;
    private TextBox BoxResults;
    private Font font1;
    private Image image1;
    //</editor-fold>//GEN-END:|fields|0|
    private TextBox textBox55; 
    private float[] Ethsio_Global;
    private float[] Mhniaio_Global;
    private int Sum_Global;
    //float[] Mhniaio;
    //float[] Ethsio;
//    public TextField getTextField1;
//    public TextField getTextField;
//    public TextField getTextField2;
    //</editor-fold>
    /**
     * The HelloMIDlet constructor.
     */
    public HelloMIDlet() {
    }

    //<editor-fold defaultstate="collapsed" desc=" Generated Methods ">//GEN-BEGIN:|methods|0|
    //</editor-fold>//GEN-END:|methods|0|

    //<editor-fold defaultstate="collapsed" desc=" Generated Method: initialize ">//GEN-BEGIN:|0-initialize|0|0-preInitialize
    /**
     * Initilizes the application.
     * It is called only once when the MIDlet is started. The method is called before the <code>startMIDlet</code> method.
     */
    private void initialize() {//GEN-END:|0-initialize|0|0-preInitialize
        // write pre-initialize user code here
        try {//GEN-BEGIN:|0-initialize|1|33-@java.io.IOException
            image1 = Image.createImage("/Athens1.jpg");
        } catch (java.io.IOException e) {//GEN-END:|0-initialize|1|33-@java.io.IOException
            e.printStackTrace();
        }//GEN-LINE:|0-initialize|2|0-postInitialize
    // write post-initialize user code here
    }//GEN-BEGIN:|0-initialize|3|
    //</editor-fold>//GEN-END:|0-initialize|3|
    //<editor-fold defaultstate="collapsed" desc=" Generated Method: startMIDlet ">//GEN-BEGIN:|3-startMIDlet|0|3-preAction
    /**
     * Performs an action assigned to the Mobile Device - MIDlet Started point.
     */
    public void startMIDlet() {//GEN-END:|3-startMIDlet|0|3-preAction
        // write pre-action user code here
        switchDisplayable(null, getSplashScreen());//GEN-LINE:|3-startMIDlet|1|3-postAction
    // write post-action user code here
    }//GEN-BEGIN:|3-startMIDlet|2|
    //</editor-fold>//GEN-END:|3-startMIDlet|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Method: resumeMIDlet ">//GEN-BEGIN:|4-resumeMIDlet|0|4-preAction
    /**
     * Performs an action assigned to the Mobile Device - MIDlet Resumed point.
     */
    public void resumeMIDlet() {//GEN-END:|4-resumeMIDlet|0|4-preAction
    // write pre-action user code here
//GEN-LINE:|4-resumeMIDlet|1|4-postAction
    // write post-action user code here
    }//GEN-BEGIN:|4-resumeMIDlet|2|
    //</editor-fold>//GEN-END:|4-resumeMIDlet|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Method: switchDisplayable ">//GEN-BEGIN:|5-switchDisplayable|0|5-preSwitch
    /**
     * Switches a current displayable in a display. The <code>display</code> instance is taken from <code>getDisplay</code> method. This method is used by all actions in the design for switching displayable.
     * @param alert the Alert which is temporarily set to the display; if <code>null</code>, then <code>nextDisplayable</code> is set immediately
     * @param nextDisplayable the Displayable to be set
     */
    public void switchDisplayable(Alert alert, Displayable nextDisplayable) {//GEN-END:|5-switchDisplayable|0|5-preSwitch
        // write pre-switch user code here
        Display display = getDisplay();//GEN-BEGIN:|5-switchDisplayable|1|5-postSwitch
        if (alert == null) {
            display.setCurrent(nextDisplayable);
        } else {
            display.setCurrent(alert, nextDisplayable);
        }//GEN-END:|5-switchDisplayable|1|5-postSwitch
    // write post-switch user code here
    }//GEN-BEGIN:|5-switchDisplayable|2|
    //</editor-fold>//GEN-END:|5-switchDisplayable|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Method: commandAction for Displayables ">//GEN-BEGIN:|7-commandAction|0|7-preCommandAction
    /**
     * Called by a system to indicated that a command has been invoked on a particular displayable.
     * @param command the Command that was invoked
     * @param displayable the Displayable where the command was invoked
     */
    public void commandAction(Command command, Displayable displayable) {//GEN-END:|7-commandAction|0|7-preCommandAction
        // write pre-action user code here
        if (displayable == BoxResults) {//GEN-BEGIN:|7-commandAction|1|105-preAction
            if (command == backCommand1) {//GEN-END:|7-commandAction|1|105-preAction
                // write pre-action user code here
                switchDisplayable(null, getDedomena());//GEN-LINE:|7-commandAction|2|105-postAction
                // write post-action user code here
            }//GEN-BEGIN:|7-commandAction|3|40-preAction
        } else if (displayable == Dedomena) {
            if (command == exitCommand2) {//GEN-END:|7-commandAction|3|40-preAction
                // write pre-action user code here
                switchDisplayable(null, getHelpScreen());//GEN-LINE:|7-commandAction|4|40-postAction
            // write post-action user code here
            } else if (command == okCommand) {//GEN-LINE:|7-commandAction|5|38-preAction
                // write pre-action user code here
                float[] Mhniaio;
                float[] Ethsio;
                int sum = 0;
                
                
                float ep,kef;
                int  xro;
                
                kef = getFloatNumber(textField,textField.getString());
                ep =  getFloatNumber(textField1,textField1.getString());
                xro = getIntNumber(textField2,textField2.getString());
                 
                Ethsio_Global = new float[xro];
                Mhniaio_Global = new float[xro];
                Mhniaio = new float[xro];
                Ethsio = new float[xro];
                Mhniaio[0] = kef;   
                //Ethsio[0] = 0;                               
                for (int i = 1; i<xro; i++)
                {
                    kef = kef * (1 + (ep/100));
                    Mhniaio[i] = kef; 
                }

                for (int j = 0; j<xro; j++) {
                    Ethsio[j] = 12 * Mhniaio[j];
                    sum += Ethsio[j];
                }
                //sum = 12 * sum;
                 Sum_Global = sum;
                 for(int i = 0; i < Mhniaio.length; i++)
                 {
                    Ethsio_Global[i] = Ethsio[i];
                    Mhniaio_Global[i] = Mhniaio[i];
                 }
                 
                 switchDisplayable(null, getBoxResults());//GEN-LINE:|7-commandAction|6|38-postAction
                 // write post-action user code here   
            }//GEN-BEGIN:|7-commandAction|7|93-preAction
        } else if (displayable == HelpScreen) {
            if (command == exitCommand4) {//GEN-END:|7-commandAction|7|93-preAction
                // write pre-action user code here
                exitMIDlet();//GEN-LINE:|7-commandAction|8|93-postAction
            // write post-action user code here
            } else if (command == okCommand3) {//GEN-LINE:|7-commandAction|9|91-preAction
                // write pre-action user code here
                switchDisplayable(null, getDedomena());//GEN-LINE:|7-commandAction|10|91-postAction
            // write post-action user code here
            }//GEN-BEGIN:|7-commandAction|11|29-preAction
        } else if (displayable == splashScreen) {
            if (command == SplashScreen.DISMISS_COMMAND) {//GEN-END:|7-commandAction|11|29-preAction
                // write pre-action user code here
                switchDisplayable(null, getHelpScreen());//GEN-LINE:|7-commandAction|12|29-postAction
            // write post-action user code here
            }//GEN-BEGIN:|7-commandAction|13|7-postCommandAction
        }//GEN-END:|7-commandAction|13|7-postCommandAction
    // write post-action user code here
        String Intro = "χρόνος      |   μηνιαία έσοδα    |   ετήσια έσοδα       \n";
        String Outro = "";
        String numstring = "";
        StringBuffer A = new StringBuffer(1000);
        String Results = new String(A);
        String Temp1 = "                     ", Temp2 = "                      ";
        for (int i = 0; i < Mhniaio_Global.length; i++) {
            numstring = "" + Int2String(i+1) + "_     ";
//            numstring = numstring.substring(0,numstring.length());
            numstring = numstring.substring(0,2);
            Temp1 = Float2String(Mhniaio_Global[i]);
            Temp2 = Float2String(Ethsio_Global[i]);
            Temp1 = Temp1.substring(0, Temp1.indexOf(".") + 2).concat("    ");
            Temp2 = Temp2.substring(0, Temp2.indexOf(".") + 2).concat("    ");
//            Results1 = Results1.append(".         |     ").append(Temp1.substring(0,6)).append(".         |     ").append(Temp2.substring(0,7)).append("\n").toString();
            Results = Results + numstring +  ".             |         " + Temp1.substring(0,Temp1.length()-1) + "      |      " + Temp2.substring(0,Temp2.length() - 1) + "\n";
            //int count_chars = Results.indexOf('.');
            //Results = Results.substring(0, 30);
            }
        //numstring.substring(0,3) +
            Outro = "\n Συνολικά έσοδα μετά από " + Int2String(Ethsio_Global.length) +  " χρόνια:  " + Int2String(Sum_Global) + " ευρώ  \n";

        
        BoxResults.setString(Intro + Results + Outro); 
             
        Intro = ""; Results = "" ; Outro = "";       
    }//GEN-BEGIN:|7-commandAction|14|
    //</editor-fold>//GEN-END:|7-commandAction|14|


    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: HelpScreen ">//GEN-BEGIN:|21-getter|0|21-preInit
    /**
     * Returns an initiliazed instance of HelpScreen component.
     * @return the initialized component instance
     */
    public TextBox getHelpScreen() {
        if (HelpScreen == null) {//GEN-END:|21-getter|0|21-preInit
            // write pre-init user code here

            HelpScreen = new TextBox("BOH\u0398\u0395\u0399\u0391", "                     \u0395\u03BA\u03C4\u03B9\u03BC\u03B7\u03C4\u03AE\u03C2 \u0395\u03B9\u03C3\u03CC\u03B4\u03C9\u03BD ALDI\n\n\n\n\n1.\u0395\u0399\u03A3\u0391\u0393\u0395\u03A4\u0395 \u0391\u03A1\u03A7\u0399\u039A\u039F \u039C\u0397\u039D\u0399\u0391\u0399\u039F \u03A0\u039F\u03A3\u039F  \n             \u03B4\u03AD\u03C7\u03B5\u03C4\u03B1\u03B9 \u03B1\u03BA\u03AD\u03C1\u03B1\u03B9\u03B5\u03C2 \u03BA\u03B1\u03B9 \u03B4\u03B5\u03BA\u03B1\u03B4\u03B9\u03BA\u03AD\u03C2 \u03C4\u03B9\u03BC\u03AD\u03C2\n\n2.\u0395\u0399\u03A3\u0391\u0393\u0395\u03A4\u0395 \u0395\u03A0\u0399\u03A4\u039F\u039A\u0399\u039F % \n   (\u03C0.\u03C7. \u03B3\u03B9\u03B1 4.7% \u03B3\u03C1\u03AC\u03C6\u03BF\u03C5\u03BC\u03B5 4.7)\n             \u03B4\u03AD\u03C7\u03B5\u03C4\u03B1\u03B9 \u03B1\u03BA\u03AD\u03C1\u03B1\u03B9\u03B5\u03C2 \u03BA\u03B1\u03B9 \u03B4\u03B5\u03BA\u03B1\u03B4\u03B9\u03BA\u03AD\u03C2 \u03C4\u03B9\u03BC\u03AD\u03C2\n\n3.\u0395\u0399\u03A3\u0391\u0393\u0395\u03A4\u0395 \u03A7\u03A1\u039F\u039D\u039F \u03A3\u03A5\u039C\u0392\u039F\u039B\u0391\u0399\u039F\u03A5\n             \u03B4\u03AD\u03C7\u03B5\u03C4\u03B1\u03B9 \u03BC\u03CC\u03BD\u03BF \u03B1\u03BA\u03AD\u03C1\u03B1\u03B9\u03B5\u03C2 \u03C4\u03B9\u03BC\u03AD\u03C2", 1000, TextField.ANY | TextField.UNEDITABLE);//GEN-BEGIN:|21-getter|1|21-postInit
            HelpScreen.addCommand(getOkCommand3());
            HelpScreen.addCommand(getExitCommand4());
            HelpScreen.setCommandListener(this);
            HelpScreen.setInitialInputMode("UCB_GREEK");//GEN-END:|21-getter|1|21-postInit
        // write post-init user code here
            //HelpScreen.setConstraints(textField.UNEDITABLE);
        }//GEN-BEGIN:|21-getter|2|
        return HelpScreen;
    }
    //</editor-fold>//GEN-END:|21-getter|2|
    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: splashScreen ">//GEN-BEGIN:|27-getter|0|27-preInit
    /**
     * Returns an initiliazed instance of splashScreen component.
     * @return the initialized component instance
     */
    public SplashScreen getSplashScreen() {
        if (splashScreen == null) {//GEN-END:|27-getter|0|27-preInit
            // write pre-init user code here
            splashScreen = new SplashScreen(getDisplay());//GEN-BEGIN:|27-getter|1|27-postInit
            splashScreen.setTitle("SS Solutions");
            splashScreen.setCommandListener(this);
            splashScreen.setImage(image1);
            splashScreen.setText("  ");
            splashScreen.setTextFont(getFont1());
            splashScreen.setTimeout(4000);//GEN-END:|27-getter|1|27-postInit
        // write post-init user code here
        }//GEN-BEGIN:|27-getter|2|
        return splashScreen;
    }
    //</editor-fold>//GEN-END:|27-getter|2|
    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: okCommand ">//GEN-BEGIN:|37-getter|0|37-preInit
    /**
     * Returns an initiliazed instance of okCommand component.
     * @return the initialized component instance
     */
    public Command getOkCommand() {
        if (okCommand == null) {//GEN-END:|37-getter|0|37-preInit
            // write pre-init user code here

            okCommand = new Command("Ok", Command.OK, 0);//GEN-LINE:|37-getter|1|37-postInit
        // write post-init user code here
        }//GEN-BEGIN:|37-getter|2|
        return okCommand;
    }
    //</editor-fold>//GEN-END:|37-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: exitCommand2 ">//GEN-BEGIN:|39-getter|0|39-preInit
    /**
     * Returns an initiliazed instance of exitCommand2 component.
     * @return the initialized component instance
     */
    public Command getExitCommand2() {
        if (exitCommand2 == null) {//GEN-END:|39-getter|0|39-preInit
            // write pre-init user code here
            exitCommand2 = new Command("Exit", Command.EXIT, 0);//GEN-LINE:|39-getter|1|39-postInit
        // write post-init user code here
        }//GEN-BEGIN:|39-getter|2|
        return exitCommand2;
    }
    //</editor-fold>//GEN-END:|39-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: Dedomena ">//GEN-BEGIN:|35-getter|0|35-preInit
    /**
     * Returns an initiliazed instance of Dedomena component.
     * @return the initialized component instance
     */
    public Form getDedomena() {
        if (Dedomena == null) {//GEN-END:|35-getter|0|35-preInit
            // write pre-init user code here
            Dedomena = new Form("\u0394\u0395\u0394\u039F\u039C\u0395\u039D\u0391", new Item[] { getTextField(), getTextField1(), getTextField2() });//GEN-BEGIN:|35-getter|1|35-postInit
            Dedomena.addCommand(getOkCommand());
            Dedomena.addCommand(getExitCommand2());
            Dedomena.setCommandListener(this);//GEN-END:|35-getter|1|35-postInit
        // write post-init user code here    
        }//GEN-BEGIN:|35-getter|2|
        return Dedomena;
    }
    //</editor-fold>//GEN-END:|35-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: textField ">//GEN-BEGIN:|36-getter|0|36-preInit
    /**
     * Returns an initiliazed instance of textField component.
     * @return the initialized component instance
     */
    public TextField getTextField() {
        if (textField == null) {//GEN-END:|36-getter|0|36-preInit
            // write pre-init user code here
            textField = new TextField("M\u03B7\u03BD\u03B9\u03B1\u03AF\u03BF \u03C0\u03BF\u03C3\u03CC (\u03C3\u03B5 \u0395\u03C5\u03C1\u03CE):", null, 64, TextField.DECIMAL);//GEN-BEGIN:|36-getter|1|36-postInit
            textField.setPreferredSize(-1, -1);
            textField.setLayout(ImageItem.LAYOUT_DEFAULT);
            textField.setInitialInputMode("UCB_GREEK");//GEN-END:|36-getter|1|36-postInit
        // write post-init user code here
             }
        else {
            textField = null;//("M\u03B7\u03BD\u03B9\u03B1\u03AF\u03BF \u03C0\u03BF\u03C3\u03CC (\u03C3\u03B5 \u0395\u03C5\u03C1\u03CE):", null, 32, TextField.NUMERIC);
       
        }//GEN-BEGIN:|36-getter|2|
        return textField;
    }
    //</editor-fold>//GEN-END:|36-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: textField1 ">//GEN-BEGIN:|53-getter|0|53-preInit
    /**
     * Returns an initiliazed instance of textField1 component.
     * @return the initialized component instance
     */
    public TextField getTextField1() {
        if (textField1 == null) {//GEN-END:|53-getter|0|53-preInit
            // write pre-init user code here
            textField1 = new TextField("E\u03C4\u03AE\u03C3\u03B9\u03BF \u0395\u03C0\u03B9\u03C4\u03CC\u03BA\u03B9\u03BF (\u03C3\u03B5 \u03C0\u03BF\u03C3\u03BF\u03C3\u03C4\u03CC %):", null, 32, TextField.DECIMAL);//GEN-BEGIN:|53-getter|1|53-postInit
            textField1.setLayout(ImageItem.LAYOUT_DEFAULT);//GEN-END:|53-getter|1|53-postInit
        // write post-init user code here
             }
        else {
            textField1 = null;
        
        }//GEN-BEGIN:|53-getter|2|
        return textField1;
    }
    //</editor-fold>//GEN-END:|53-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: textField2 ">//GEN-BEGIN:|54-getter|0|54-preInit
    /**
     * Returns an initiliazed instance of textField2 component.
     * @return the initialized component instance
     */
    public TextField getTextField2() {
        if (textField2 == null) {//GEN-END:|54-getter|0|54-preInit
            // write pre-init user code here
            textField2 = new TextField("\u0395\u03C4\u03B7 \u03C3\u03C5\u03BC\u03B2\u03BF\u03BB\u03B1\u03AF\u03BF\u03C5:", null, 32, TextField.NUMERIC);//GEN-LINE:|54-getter|1|54-postInit
        }
        else {
            textField2 = null; //new TextField("\u0395\u03C4\u03B7 \u03C3\u03C5\u03BC\u03B2\u03BF\u03BB\u03B1\u03AF\u03BF\u03C5:", null, 32, TextField.NUMERIC);
        
            // write post-init user code here
        }//GEN-BEGIN:|54-getter|2|
        return textField2;
    }
    //</editor-fold>//GEN-END:|54-getter|2|












    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: font1 ">//GEN-BEGIN:|81-getter|0|81-preInit
    /**
     * Returns an initiliazed instance of font1 component.
     * @return the initialized component instance
     */
    public Font getFont1() {
        if (font1 == null) {//GEN-END:|81-getter|0|81-preInit
            // write pre-init user code here
            font1 = Font.getFont(Font.FACE_PROPORTIONAL, Font.STYLE_ITALIC, Font.SIZE_SMALL);//GEN-LINE:|81-getter|1|81-postInit
        // write post-init user code here
        }//GEN-BEGIN:|81-getter|2|
        return font1;
    }
    //</editor-fold>//GEN-END:|81-getter|2|


    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: okCommand3 ">//GEN-BEGIN:|90-getter|0|90-preInit
    /**
     * Returns an initiliazed instance of okCommand3 component.
     * @return the initialized component instance
     */
    public Command getOkCommand3() {
        if (okCommand3 == null) {//GEN-END:|90-getter|0|90-preInit
            // write pre-init user code here
            okCommand3 = new Command("Ok", Command.OK, 0);//GEN-LINE:|90-getter|1|90-postInit
        // write post-init user code here
        }//GEN-BEGIN:|90-getter|2|
        return okCommand3;
    }
    //</editor-fold>//GEN-END:|90-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: exitCommand4 ">//GEN-BEGIN:|92-getter|0|92-preInit
    /**
     * Returns an initiliazed instance of exitCommand4 component.
     * @return the initialized component instance
     */
    public Command getExitCommand4() {
        if (exitCommand4 == null) {//GEN-END:|92-getter|0|92-preInit
            // write pre-init user code here
            exitCommand4 = new Command("Exit", Command.EXIT, 0);//GEN-LINE:|92-getter|1|92-postInit
        // write post-init user code here
        }//GEN-BEGIN:|92-getter|2|
        return exitCommand4;
    }
    //</editor-fold>//GEN-END:|92-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: backCommand1 ">//GEN-BEGIN:|104-getter|0|104-preInit
    /**
     * Returns an initiliazed instance of backCommand1 component.
     * @return the initialized component instance
     */
    public Command getBackCommand1() {
        if (backCommand1 == null) {//GEN-END:|104-getter|0|104-preInit
            // write pre-init user code here
            backCommand1 = new Command("Back", Command.BACK, 0);//GEN-LINE:|104-getter|1|104-postInit
            // write post-init user code here
        }//GEN-BEGIN:|104-getter|2|
        return backCommand1;
    }
    //</editor-fold>//GEN-END:|104-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: BoxResults ">//GEN-BEGIN:|103-getter|0|103-preInit
    /**
     * Returns an initiliazed instance of BoxResults component.
     * @return the initialized component instance
     */
    public TextBox getBoxResults() {
        if (BoxResults == null) {//GEN-END:|103-getter|0|103-preInit
            // write pre-init user code here
            BoxResults = new TextBox("\u0391\u03A0\u039F\u03A4\u0395\u039B\u0395\u03A3\u039C\u0391\u03A4\u0391", "", 10000, TextField.ANY | TextField.UNEDITABLE);//GEN-BEGIN:|103-getter|1|103-postInit
            BoxResults.addCommand(getBackCommand1());
            BoxResults.setCommandListener(this);
            BoxResults.setInitialInputMode("UCB_BASIC_LATIN");//GEN-END:|103-getter|1|103-postInit
            // write post-init user code here 
        }//GEN-BEGIN:|103-getter|2|
        return BoxResults;
    }
    //</editor-fold>//GEN-END:|103-getter|2|








    /**
     * Returns a display instance.
     * @return the display instance.
     */
    public Display getDisplay() {
        return Display.getDisplay(this);
    }

    /**
     * Exits MIDlet.
     */
    public void exitMIDlet() {
        switchDisplayable(null, null);
        destroyApp(true);
        notifyDestroyed();
    }

    /**
     * Called when MIDlet is started.
     * Checks whether the MIDlet have been already started and initialize/starts or resumes the MIDlet.
     */
    public void startApp() {
        if (midletPaused) {
            resumeMIDlet();
        } else {
            initialize();
            startMIDlet();
        }
        midletPaused = false;
    }

    /**
     * Called when MIDlet is paused.
     */
    public void pauseApp() {
        midletPaused = true;
    }

    /**
     * Called to signal the MIDlet to terminate.
     * @param unconditional if true, then the MIDlet has to be unconditionally terminated and all resources has to be released.
     */
    public void destroyApp(boolean unconditional) {
    }

       /**
     * Extracts the int number from text field.
     *
     * @param t the text field to be used.
     * @param type the string with argument number.
     * @throws NumberFormatException is case of wrong input.
     */
    private int getIntNumber(TextField t, String type) 
            throws NumberFormatException 
    {
        String s = t.getString();
 
        if (s.length() == 0) {
            
            alert.setString("No " + type + " Argument");
            Display.getDisplay(this).setCurrent(alert);
            throw new NumberFormatException();
        }

        int n;

        try {
            n = Integer.parseInt(s);
        } 
        catch (NumberFormatException e) {
            alert.setString(type + " argument is out of range.");
            Display.getDisplay(this).setCurrent(alert);
            throw e;
        }

        return n;
    }
   private float getFloatNumber(TextField t, String type) 
            throws NumberFormatException 
    {
        String s = t.getString();
 
        if (s.length() == 0) {
            
            alert.setString("No " + type + " Argument");
            Display.getDisplay(this).setCurrent(alert);
            throw new NumberFormatException();
        }

        float n;

        try {
            n = Float.parseFloat(s);
        } 
        catch (NumberFormatException e) {
            alert.setString(type + " argument is out of range.");
            Display.getDisplay(this).setCurrent(alert);
            throw e;
        }

        return n;
    }
    private String Float2String(float n)
    {
      Float N;
      String Str;
      Str = Float.toString(n);
    
        return Str;
    }
    private String Int2String(int n)
    {
       Integer N;
       String Str;
       Str = Integer.toString(n);
       
       return Str;
    }
}
   
