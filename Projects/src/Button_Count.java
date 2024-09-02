import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;

public class Button_Count implements ActionListener {

	int count;
	JButton button = new JButton("Click Me");
	JLabel label = new JLabel("Number Of Clicks: 0");
	JPanel panel = new JPanel();
	JFrame frame;
	
	
	public Button_Count() {
		frame = new JFrame("Clicker");
		frame.setSize(300, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		
		
		button.setFocusable(false);
		button.setToolTipText("Press To Increment Count");
		button.addActionListener(this);
		
		
		
		
		
		
		panel.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
		panel.setLayout(new GridLayout(0,1));
		panel.add(button);
		panel.add(label);
		
		
		
		
				
		
		frame.add(panel);
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource() == button) {
			count++;
			label.setText("Number Of Clicks: "+ count);
		}
	}
	
	
	public static void main(String[] args) {
		new Button_Count();
	}
	
}
