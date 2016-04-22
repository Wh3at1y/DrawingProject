package view;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;
import controller.AppController;

public class AppPanel extends JPanel
	{
		private AppController controller;
		private ShapePanel shapePanel;
		private SpringLayout layout;

		private JButton addRecButton;
		private JButton addSquareButton;
		private JButton addEllipseButton;

		private ArrayList<Rectangle> rektangleList;

		public AppPanel(AppController controller)
			{
				this.controller = controller;
				layout = new SpringLayout();
				shapePanel = new ShapePanel();
				layout.putConstraint(SpringLayout.NORTH, shapePanel, 39, SpringLayout.NORTH, this);
				layout.putConstraint(SpringLayout.WEST, shapePanel, 10, SpringLayout.WEST, this);
				layout.putConstraint(SpringLayout.SOUTH, shapePanel, -10, SpringLayout.SOUTH, this);
				layout.putConstraint(SpringLayout.EAST, shapePanel, -10, SpringLayout.EAST, this);

				addRecButton = new JButton("Add a Rektangle");
				layout.putConstraint(SpringLayout.SOUTH, addRecButton, -6, SpringLayout.NORTH, shapePanel);
				addSquareButton = new JButton("Add a Square");
				layout.putConstraint(SpringLayout.EAST, addRecButton, -17, SpringLayout.WEST, addSquareButton);
				layout.putConstraint(SpringLayout.WEST, addSquareButton, -250, SpringLayout.EAST, shapePanel);
				layout.putConstraint(SpringLayout.NORTH, addSquareButton, 4, SpringLayout.NORTH, this);
				layout.putConstraint(SpringLayout.EAST, addSquareButton, 0, SpringLayout.EAST, shapePanel);
				addEllipseButton = new JButton("Add a Ellipse");
				layout.putConstraint(SpringLayout.WEST, addRecButton, 13, SpringLayout.EAST, addEllipseButton);
				layout.putConstraint(SpringLayout.WEST, addEllipseButton, 0, SpringLayout.WEST, shapePanel);
				layout.putConstraint(SpringLayout.SOUTH, addEllipseButton, -6, SpringLayout.NORTH, shapePanel);
				layout.putConstraint(SpringLayout.EAST, addEllipseButton, 250, SpringLayout.WEST, shapePanel);

				rektangleList = new ArrayList<Rectangle>();

				buildComponents();
				buildListeners();
				buildPlacements();
			}

		private void buildComponents()
			{
				setBackground(Color.GRAY);
				setLayout(layout);
				add(shapePanel);
				add(addRecButton);
				add(addSquareButton);
				add(addEllipseButton);
			}

		private void buildListeners()
			{
				addRecButton.addActionListener(new ActionListener()
					{
						public void actionPerformed(ActionEvent clicked)
							{
								shapePanel.addRectangle();
							}
					});
				
				addSquareButton.addActionListener(new ActionListener()
					{
						public void actionPerformed(ActionEvent clicked)
							{
								shapePanel.addRectangle();
							}
					});
				
				addEllipseButton.addActionListener(new ActionListener()
					{
						public void actionPerformed(ActionEvent clicked)
							{
								shapePanel.addEllipse();
							}
					});
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

				for (Rectangle current : rektangleList)
					{
						int red = (int) (Math.random() * 256);
						int green = (int) (Math.random() * 256);
						int blue = (int) (Math.random() * 256);

						mainGraphics.setColor(new Color(red, green, blue));
						mainGraphics.draw(current);
					}
			}
	}
