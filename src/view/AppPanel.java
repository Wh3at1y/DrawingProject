package view;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;
import controller.AppController;

public class AppPanel extends JPanel
	{
		private ShapePanel shapePanel;
		private SpringLayout layout;

		private JButton clearButton;
		private JButton addRecButton;
		private JButton addCircleButton;
		private JButton addSquareButton;
		private JButton addEllipseButton;
		private JButton addTriangleButton;
		private JButton addPolygonButton;

		private JTextField loopField;

		private int amount;

		public AppPanel(AppController controller)
			{
				layout = new SpringLayout();
				shapePanel = new ShapePanel();

				clearButton = new JButton("Clear Drawings");
				addPolygonButton = new JButton("Add a Polygon");
				addTriangleButton = new JButton("Add a Triangle");
				addCircleButton = new JButton("Add a Circle");
				addRecButton = new JButton("Add a Rektangle");
				addSquareButton = new JButton("Add a Square");
				addEllipseButton = new JButton("Add a Ellipse");

				loopField = new JTextField();
				layout.putConstraint(SpringLayout.WEST, loopField, 0, SpringLayout.EAST, clearButton);
				loopField.setText("1");

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
				add(addCircleButton);
				add(addTriangleButton);
				add(addPolygonButton);
				add(clearButton);

				add(loopField);
			}

		private void buildListeners()
			{
				clearButton.addActionListener(new ActionListener()
					{
						public void actionPerformed(ActionEvent clicked)
							{
								shapePanel.clear();
							}
					});

				addPolygonButton.addActionListener(new ActionListener()
					{
						public void actionPerformed(ActionEvent clicked)
							{
								loopChecker();
								for (int loop = 0; loop < amount; loop++)
									shapePanel.addPolygon();
							}
					});

				addTriangleButton.addActionListener(new ActionListener()
					{
						public void actionPerformed(ActionEvent clicked)
							{
								loopChecker();
								for (int loop = 0; loop < amount; loop++)
										shapePanel.addTriangle();
							}
					});

				addCircleButton.addActionListener(new ActionListener()
					{
						public void actionPerformed(ActionEvent clicked)
							{
								loopChecker();
								for (int loop = 0; loop < amount; loop++)
										shapePanel.addCircle();
							}
					});

				addRecButton.addActionListener(new ActionListener()
					{
						public void actionPerformed(ActionEvent clicked)
							{
								loopChecker();
								for (int loop = 0; loop < amount; loop++)
										shapePanel.addRectangle();
							}
					});

				addSquareButton.addActionListener(new ActionListener()
					{
						public void actionPerformed(ActionEvent clicked)
							{
								loopChecker();
								for (int loop = 0; loop < amount; loop++)
									shapePanel.addSquare();
							}
					});

				addEllipseButton.addActionListener(new ActionListener()
					{
						public void actionPerformed(ActionEvent clicked)
							{
								loopChecker();
								for (int loop = 0; loop < amount; loop++)
									shapePanel.addEllipse();
							}
					});
			}

		private void loopChecker()
			{
				if (loopField.getText().isEmpty())
					loopField.setText("1");
				
				amount = Integer.parseInt(loopField.getText());
				
				if(amount > 2000)
					loopField.setText("1000");
				
				amount = Integer.parseInt(loopField.getText());
			}

		private void buildPlacements()
			{
				layout.putConstraint(SpringLayout.EAST, clearButton, -50, SpringLayout.EAST, shapePanel);
				layout.putConstraint(SpringLayout.NORTH, clearButton, 6, SpringLayout.SOUTH, shapePanel);
				layout.putConstraint(SpringLayout.WEST, clearButton, 10, SpringLayout.WEST, shapePanel);
				layout.putConstraint(SpringLayout.SOUTH, clearButton, 39, SpringLayout.SOUTH, shapePanel);
				layout.putConstraint(SpringLayout.SOUTH, shapePanel, -49, SpringLayout.SOUTH, this);
				layout.putConstraint(SpringLayout.NORTH, addPolygonButton, 4, SpringLayout.NORTH, this);
				layout.putConstraint(SpringLayout.WEST, addPolygonButton, 10, SpringLayout.WEST, this);
				layout.putConstraint(SpringLayout.EAST, addPolygonButton, -670, SpringLayout.EAST, this);
				layout.putConstraint(SpringLayout.NORTH, addTriangleButton, 4, SpringLayout.NORTH, this);
				layout.putConstraint(SpringLayout.EAST, addTriangleButton, -10, SpringLayout.EAST, this);
				layout.putConstraint(SpringLayout.WEST, addCircleButton, 403, SpringLayout.WEST, this);
				layout.putConstraint(SpringLayout.SOUTH, addCircleButton, -6, SpringLayout.NORTH, shapePanel);
				layout.putConstraint(SpringLayout.NORTH, shapePanel, 39, SpringLayout.NORTH, this);
				layout.putConstraint(SpringLayout.WEST, shapePanel, 10, SpringLayout.WEST, this);
				layout.putConstraint(SpringLayout.EAST, shapePanel, -10, SpringLayout.EAST, this);
				layout.putConstraint(SpringLayout.WEST, addRecButton, 262, SpringLayout.WEST, this);
				layout.putConstraint(SpringLayout.SOUTH, addRecButton, -6, SpringLayout.NORTH, shapePanel);
				layout.putConstraint(SpringLayout.EAST, addRecButton, -6, SpringLayout.WEST, addCircleButton);
				layout.putConstraint(SpringLayout.NORTH, addEllipseButton, 0, SpringLayout.NORTH, addRecButton);
				layout.putConstraint(SpringLayout.WEST, addEllipseButton, 6, SpringLayout.EAST, addPolygonButton);
				layout.putConstraint(SpringLayout.EAST, addEllipseButton, -6, SpringLayout.WEST, addRecButton);
				layout.putConstraint(SpringLayout.EAST, addCircleButton, -6, SpringLayout.WEST, addSquareButton);
				layout.putConstraint(SpringLayout.NORTH, addSquareButton, 4, SpringLayout.NORTH, this);
				layout.putConstraint(SpringLayout.WEST, addSquareButton, 529, SpringLayout.WEST, this);
				layout.putConstraint(SpringLayout.EAST, addSquareButton, -6, SpringLayout.WEST, addTriangleButton);
				layout.putConstraint(SpringLayout.NORTH, loopField, 0, SpringLayout.NORTH, clearButton);
				layout.putConstraint(SpringLayout.SOUTH, loopField, 0, SpringLayout.SOUTH, clearButton);
				layout.putConstraint(SpringLayout.EAST, loopField, -10, SpringLayout.EAST, this);
			}

	}
