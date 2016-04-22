package view;

import java.awt.*;
import javax.swing.*;
import controller.AppController;

public class AppPanel extends JPanel
	{
		private AppController controller;
		private SpringLayout layout;
		
		private JButton addRecButton;
		
		public AppPanel(AppController controller)
			{
				this.controller = controller;
				layout = new SpringLayout();
				
				addRecButton = new JButton("Add a Rektangle");
				
				buildComponents();
				buildListeners();
				buildPlacements();
			}

		private void buildComponents()
			{
				setLayout(layout);
				add(addRecButton);
			}

		private void buildListeners()
			{

			}

		private void buildPlacements()
			{
				
			}

		@Override
		protected void paintComponent(Graphics currentGraphic)
		{
			super.paintComponent(currentGraphic);
			
			Graphics2D mainGraphics = (Graphics2D) currentGraphic;
			mainGraphics.setStroke(new BasicStroke(2));
			mainGraphics.setColor(Color.BLUE);
			
			//Draw Rectangle
			mainGraphics.drawRect(50, 70, 200, 20);
		}
	}
