package view;

import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.util.*;
import javax.swing.JPanel;

public class ShapePanel extends JPanel
	{
		private ArrayList<Rectangle> rektangleList;
		private ArrayList<Ellipse2D> ellipseList;
		private ArrayList<Ellipse2D> circleList;
		private ArrayList<Polygon> triangleList;
		private ArrayList<Polygon> polygonList;
		
		public ShapePanel()
		{
			rektangleList = new ArrayList<Rectangle>();
			ellipseList = new ArrayList<Ellipse2D>();
			circleList = new ArrayList<Ellipse2D>();
		}
		public void addRectangle()
		{
			int xPos = (int) (Math.random() * getWidth());
			int yPos = (int) (Math.random() * getHeight());
			int width = (int) (Math.random() * 100);
			int height = (int) (Math.random() * 100);

			rektangleList.add(new Rectangle(xPos, yPos, width, height));

			repaint();
		}
		
		public void addSquare()
			{
				int xPos = (int) (Math.random() * getWidth());
				int yPos = (int) (Math.random() * getHeight());
				int width = (int) (Math.random() * 100);
				int height = (int) (Math.random() * 100);

				squareList.add(new Rectangle(xPos, yPos, width, height));

				repaint();
			}
		
		public void addEllipse()
			{
				int xPos = (int) (Math.random() * getWidth());
				int yPos = (int) (Math.random() * getHeight());
				int width = (int) (Math.random() * 100);
				int height = (int) (Math.random() * 100);

				ellipseList.add(new Ellipse2D.Double(xPos, yPos, width, height));

				repaint();
			}
		
		public void addCircle()
		{
			int xPos = (int) (Math.random() * getWidth());
			int yPos = (int) (Math.random() * getHeight());
			int width = (int) (Math.random() * 100);

			circleList.add(new Ellipse2D.Double(xPos, yPos, width, width));

			repaint();
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
			
			for (Ellipse2D current : circleList)
				{
					int red = (int) (Math.random() * 256);
					int green = (int) (Math.random() * 256);
					int blue = (int) (Math.random() * 256);

					mainGraphics.setColor(new Color(red, green, blue));
					mainGraphics.draw(current);
				}
			
			for (Ellipse2D current : ellipseList)
				{
					int red = (int) (Math.random() * 256);
					int green = (int) (Math.random() * 256);
					int blue = (int) (Math.random() * 256);

					mainGraphics.setColor(new Color(red, green, blue));
					mainGraphics.draw(current);
				}
		}
	}
