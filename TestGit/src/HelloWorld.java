import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;


public final class HelloWorld 
{
	private HelloWorld()
	{
		// do nothing
	}
	
	private static final String HELLO_LABEL = "Hello, World!*************";
	private static final int HELLO_LENGTH = 13;
	private static final int DEFAULT_TIMER_DELAY = 1000;
	private static int my_count = 0;
	private static JLabel my_label;
	private static Timer my_timer;

	public static void main(final String[] the_args) 
	{
		final JFrame frame = new JFrame("Hello, World!");
		frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		
		final JPanel panel = new JPanel(new GridLayout(0,1));
		
		final JPanel label_panel = new JPanel();
		my_label = new JLabel(HELLO_LABEL.substring(0, HELLO_LENGTH + 1));
		label_panel.add(my_label);
		panel.add(label_panel);
		
		final JButton button = new JButton("CLick to CLose");
		button.addActionListener(new ActionListener()
		{
			public void actionPerformed(final ActionEvent the_event)
			{
				my_timer.stop();
				frame.dispose();
			}
		});
		final JPanel button_panel = new JPanel();
		button_panel.add(button);
		panel.add(button_panel);
		
		my_timer = new Timer(DEFAULT_TIMER_DELAY, new ActionListener()
			{
				public void actionPerformed(final ActionEvent the_event)
				{
					if (my_count + 1 == HELLO_LABEL.length())
					{
						my_count = 0;
					}
					my_count++;
					
					
					
					my_label = new JLabel(HELLO_LABEL.substring(my_count, (HELLO_LENGTH + 1) % HELLO_LABEL.length()));
					System.out.println(my_label.getText() + " label length = " + my_count);
					frame.repaint();
				}
			});
		
		my_timer.start();
		
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);
	}	
}
