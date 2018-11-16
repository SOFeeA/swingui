package erwer.swingui;

import javax.swing.*;

public class startview {

	public static void main(String[] args) {
		JFrame f=new JFrame();//creating instance of JFrame  
        
		JButton b=new JButton("Hello World");//creating instance of JButton  
		          
		f.setSize(400,500);//400 width and 500 height  
		f.setLayout(null);//using no layout managers  
		f.setVisible(true);//making the frame visible  
try {
	Thread.sleep(500);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
		b.setBounds(130,100,100, 40);//x axis, y axis, width, height  
		          
		f.add(b);//adding button in JFrame  
		f.repaint();
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		b.setText("New Text");
		f.repaint();
	}
	public boolean m_var;
	public void set_var() {
		m_var = true;
	}

}
