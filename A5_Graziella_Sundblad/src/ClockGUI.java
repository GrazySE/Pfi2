import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.ImageIcon;
import javax.swing.border.BevelBorder;
import javax.swing.JTextField;
 
public class ClockGUI extends JFrame {
 
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JLabel clockLabel;
     
    private String time;
    private String _hours;
    private String _minutes;
    private String _seconds;
     
    private String myHour;
    private String myMin;
    private String mySec;
     
    int alarmHour;
    int alarmMinute;
    int alarmSecond ;
     
    private ClockLogic myClock;
    private JTextArea textArea_hrs;
    private JTextArea textArea_min;
    private JTextArea textArea_sec;
    private JButton reset;
    public JTextArea eventText;
    public JTextField eventz;
    private JLabel lblNewLabel;
    private JLabel lblTime;
    private JLabel lblNewLabel_1;

     
 
    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                ClockGUI frame = new ClockGUI();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
 
    /**
     * Create the frame.
     */
    public ClockGUI() {
    	setResizable(false);
        myClock = new ClockLogic(ClockGUI.this);
        myClock.execute();//execute the Clock 
         
        setTitle("Wake up, lazy ass!");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 640, 536);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(255, 105, 180));
        contentPane.setForeground(Color.WHITE);
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
         
        JButton btnAlarm = new JButton("Set the fucking Alarm, yo!!!");
        btnAlarm.setForeground(new Color(255, 20, 147));
        btnAlarm.setBounds(41, 413, 258, 65);
        btnAlarm.setFont(new Font("Arial", Font.BOLD, 14));
        btnAlarm.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                 
                /**
                 * Gets 3 different values from the textAreas
                 */
                  
                myHour = new String (textArea_hrs.getText());
                myMin = new String (textArea_min.getText());
                mySec = new String (textArea_sec.getText());
                 
                /**
                 * Transform the 3 values from the textAreas to Integer
                 */
                  
                 
                int _alarmHour = Integer.parseInt(myHour);
                int _alarmMinute = Integer.parseInt(myMin);
                int _alarmSecond = Integer.parseInt(mySec);
                
                 
                /**
                 * Set the alarm from the textArea values
                 */
 
                alarmHour = _alarmHour;
                alarmMinute = _alarmMinute;
                alarmSecond = _alarmSecond;
                myClock.setBoolean(true);
                 
                
                
                
                
                 
                myClock.setAlarm(alarmHour, alarmMinute, alarmSecond);
                
            
                
                lblNewLabel.setText("Event: "+eventz.getText()); 
               
                
                
                /**here new variables are created to be used with the ifs*/
                
             String hourZ=Integer.toString(alarmHour);
               String minuteZ=Integer.toString(alarmMinute);
                String secondZ=Integer.toString(alarmSecond);
                 
                /**
                 * the if-statements help to put a 0 if it is necessary
                 */
                 
                if(alarmHour < 10){
                        
                       hourZ = "0" + alarmHour;
                   }
                    
                   if(alarmMinute < 10)
                   {
                       minuteZ = "0" + alarmMinute;
                   }
                   if(alarmSecond < 10)
                   {
                       secondZ = "0" + alarmSecond;;
                   }
                
                
                
                
                
                
                lblTime.setText("Time: "+hourZ+" : "+minuteZ+ " : "+secondZ);     
               
                System.out.println("Alarm set at: " + hourZ +":"+ minuteZ + ":" + secondZ); // shows on the console what time the alarm has been set up
                
                 
                
            }
        });
        contentPane.setLayout(null);
        
        clockLabel = new JLabel("");
        clockLabel.setBackground(new Color(255, 182, 193));
        clockLabel.setForeground(new Color(255, 20, 147));
        clockLabel.setBounds(0, 31, 634, 88);
        clockLabel.setHorizontalAlignment(SwingConstants.CENTER);
        clockLabel.setFont(new Font("Avenir", Font.BOLD, 58));
        contentPane.add(clockLabel);
        
        lblNewLabel_1 = new JLabel("");
        lblNewLabel_1.setIcon(new ImageIcon(ClockGUI.class.getResource("/images/clock_wheels.jpg")));
        lblNewLabel_1.setBounds(0, 0, 663, 205);
        contentPane.add(lblNewLabel_1);
        contentPane.add(btnAlarm);
         
        textArea_sec = new JTextArea();
        textArea_sec.setForeground(new Color(255, 20, 147));
        textArea_sec.setBounds(225, 336, 73, 65);
        textArea_sec.setFont(new Font("Avenir", Font.BOLD, 50));
        contentPane.add(textArea_sec);
         
        textArea_min = new JTextArea();
        textArea_min.setForeground(new Color(255, 20, 147));
        textArea_min.setBounds(133, 336, 73, 65);
        textArea_min.setFont(new Font("Avenir", Font.BOLD, 50));
        contentPane.add(textArea_min);
         
        textArea_hrs = new JTextArea();
        textArea_hrs.setForeground(new Color(255, 20, 147));
        textArea_hrs.setBounds(41, 336, 73, 65);
        textArea_hrs.setFont(new Font("Avenir", Font.BOLD, 50));
        contentPane.add(textArea_hrs);
         
        JLabel lblHrs = new JLabel("HoUrZ");
        lblHrs.setBackground(new Color(255, 228, 225));
        lblHrs.setForeground(new Color(255, 245, 238));
        lblHrs.setHorizontalAlignment(SwingConstants.CENTER);
        lblHrs.setBounds(41, 308, 65, 16);
        contentPane.add(lblHrs);
         
        JLabel lblMin = new JLabel("MeeneetZ");
        lblMin.setForeground(new Color(255, 245, 238));
        lblMin.setHorizontalAlignment(SwingConstants.CENTER);
        lblMin.setBounds(133, 308, 73, 16);
        contentPane.add(lblMin);
         
        JLabel lblSec = new JLabel("Sex");
        lblSec.setForeground(new Color(255, 245, 238));
        lblSec.setHorizontalAlignment(SwingConstants.CENTER);
        lblSec.setBounds(225, 308, 73, 16);
        contentPane.add(lblSec);
        
        reset = new JButton("RESET");
        reset.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		
        	
        		myClock.reset();
        		textArea_hrs.setText("0"+String.valueOf(ClockLogic.alarm_hours));
        		textArea_min.setText("0"+String.valueOf(ClockLogic.alarm_minutes));
        		textArea_sec.setText("0"+String.valueOf(ClockLogic.alarm_seconds));
        		lblNewLabel.setText("Event: ");
                lblTime.setText("Time: ");   
                eventz.setText("");
        	      
        		System.out.println("You have resetted the alarm, Bozo!!!");
            }
        });
        	
     
        reset.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
        reset.setBackground(new Color(255, 182, 193));
        reset.setOpaque(true);
        reset.setBounds(385, 428, 191, 50);
        contentPane.add(reset);
        
        JLabel lblEvents = new JLabel("Event");
        lblEvents.setHorizontalAlignment(SwingConstants.CENTER);
        lblEvents.setFont(new Font("Lucida Grande", Font.BOLD, 13));
        lblEvents.setForeground(new Color(255, 240, 245));
        lblEvents.setBounds(41, 230, 276, 25);
        contentPane.add(lblEvents);
        
        eventz = new JTextField();
        eventz.setBounds(39, 256, 278, 40);
        contentPane.add(eventz);
        eventz.setColumns(10);
        
        lblNewLabel = new JLabel("Event:");
        lblNewLabel.setBackground(new Color(255, 105, 180));
        lblNewLabel.setOpaque(true);
        lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
        lblNewLabel.setFont(new Font("Oxygen", Font.BOLD, 21));
        lblNewLabel.setForeground(new Color(255, 240, 245));
        lblNewLabel.setBounds(385, 262, 191, 78);
        contentPane.add(lblNewLabel);
        
        lblTime = new JLabel("Time:");
        lblTime.setBackground(new Color(255, 105, 180));
        lblTime.setOpaque(true);
        lblTime.setHorizontalAlignment(SwingConstants.LEFT);
        lblTime.setForeground(new Color(255, 240, 245));
        lblTime.setFont(new Font("Oxygen", Font.BOLD, 21));
        lblTime.setBounds(385, 338, 191, 78);
        contentPane.add(lblTime);
        
        
    }
     
    public void setTime(int hour, int minutes, int seconds){
         
        /**
         * this method makes the clock work on the ClockLabel
         */
         
        _hours=Integer.toString(hour);
        _minutes=Integer.toString(minutes);
        _seconds=Integer.toString(seconds);
         
        /**
         * the if help to put a 0 if it is necessary
         */
         
        if(hour < 10){
                
               _hours = "0" + _hours;
           }
            
           if(minutes < 10)
           {
               _minutes = "0" + _minutes;
           }
           if(seconds < 10)
           {
               _seconds = "0" + _seconds;
           }
         
        time = _hours + ":" +   _minutes + ":" + _seconds;
         
        clockLabel.setText(time); //Paint the clock on the ClockLabel
         
    }
     
    public void invokeAlarm(){
        /**
         * Changes the color of the background when the alarm starts
         * and changes the color of text background, text color, and font
         */
    	  
    	 Color d = new Color((float) Math.random(), (float) Math.random(),(float) Math.random());
         contentPane.setBackground(d); 
        contentPane.setToolTipText(eventz.getText());
          textArea_hrs.setText("");
          textArea_min.setText("");
          textArea_sec.setText("");
          lblNewLabel.setText("Event: "+eventz.getText());
          lblTime.setText("Time: "+_hours+" : "+_minutes+ " : "+ _seconds);     
          lblNewLabel.setForeground(Color.RED);
          lblTime.setForeground(Color.RED);    
          lblNewLabel.setBackground(Color.WHITE);
          lblTime.setBackground(Color.WHITE);
          lblTime.setFont(new Font("Arial", Font.BOLD, 21));
          lblNewLabel.setFont(new Font("Arial", Font.BOLD, 21));
    }
}
    