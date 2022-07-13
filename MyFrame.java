import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JToggleButton;

public class MyFrame extends JFrame implements ActionListener{

	JToggleButton button2;
    JLabel label;
    JToggleButton button;

	MyFrame(){
		
		ImageIcon icon = new ImageIcon("BananaSplit.png");
		

        //Image Popup for the Blizzard Recipes
		label = new JLabel(icon);
		label.setIcon(icon);
		label.setBounds(550, 30, 850,850);
		label.setVisible(false);
		
        //The Image "PopUp"
        button2 = new JToggleButton(icon);
        button2.setIcon(icon);
		button2.setBounds(550, 200, 800,500);
		button2.setVisible(false);
        button2.addActionListener(this);
        
        //First button example
		button = new JToggleButton();
		button.setBounds(100, 100, 250, 100);
		button.addActionListener(this);
		button.setText("Banana Split");
		button.setFocusable(false);
		button.setHorizontalTextPosition(JToggleButton.CENTER);
		button.setVerticalTextPosition(JToggleButton.BOTTOM);
		button.setFont(new Font("Comic Sans",Font.BOLD,25));
		button.setIconTextGap(-15);
		button.setForeground(Color.white);
		button.setBackground(Color.black);
        button.setBorderPainted(false);
		button.setBorder(BorderFactory.createEmptyBorder());



		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setSize(500,500);
		this.setVisible(true);
		this.add(button);
        this.add(button2);
		this.add(label);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(button.isSelected()) {
			button2.setVisible(true);
		}	
        if(button2.isSelected()){
            button2.setVisible(false);
        }
	}
}