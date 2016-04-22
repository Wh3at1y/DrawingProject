package view;

import javax.swing.*;
import controller.AppController;

public class AppPanel extends JPanel
	{
		private AppController controller;
		private SpringLayout layout;
		
		public AppPanel(AppController controller)
			{
				this.controller = controller;
				layout = new SpringLayout();
				
				buildComponents();
				buildListeners();
				buildPlacements();
			}

		private void buildComponents()
			{
				setLayout(layout);
			}

		private void buildListeners()
			{

			}

		private void buildPlacements()
			{

			}
	}
