import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class HelloWorld
{
	private static final String HELLO_STRING = "Hello, World!";
	
	public static void main(final String[] the_args)
	{
		final JFrame frame = new JFrame(HELLO_STRING);
		frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		frame.setResizable(false);
		
		final JPanel panel = new JPanel(new GridLayout(0, 1));
		
		final JPanel label_panel = new JPanel();
		final JLabel label = new JLabel(HELLO_STRING);
		
		label_panel.add(label);
		panel.add(label_panel);
		
		final JPanel button_panel = new JPanel();
		final JButton button = new JButton("Click to close!");
		button.addActionListener(new ActionListener()
		{
			public void actionPerformed(final ActionEvent the_event)
			{
				JOptionPane.showMessageDialog(frame, "Goodbye cruel world!");
				frame.dispose();
			}
		});
		
		button_panel.add(button);
		panel.add(button_panel);
		
		frame.add(panel, BorderLayout.CENTER);
		frame.pack();
		frame.setVisible(true);
	}

}
