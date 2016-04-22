package view;

import javax.swing.*;
import controller.AppController;

public class AppFrame extends JFrame
	{
		private AppPanel panel;
		
		public AppFrame(AppController controller)
		{
			panel = new AppPanel(controller);
			
			buildWindow();
		}
		
		private void buildWindow()
		{
			this.setContentPane(panel);
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.setTitle("Drawing Project");
			this.setSize(500,500);
			this.setResizable(false);
			this.setVisible(true);
		}
		
		public AppPanel getPanel()
		{
			return panel;
		}
	}
