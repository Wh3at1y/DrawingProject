package view;

import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.GeneralPath;
import java.util.*;
import javax.swing.JPanel;

public class ShapePanel extends JPanel
	{
		private ArrayList<Rectangle> rektangleList;
		private ArrayList<Rectangle> squareList;
		private ArrayList<Ellipse2D> ellipseList;
		private ArrayList<Ellipse2D> circleList;
		private ArrayList<Polygon> triangleList;
		private ArrayList<Polygon> polygonList;
		
		public ShapePanel()
		{
			rektangleList = new ArrayList<Rectangle>();
			squareList = new ArrayList<Rectangle>();
			ellipseList = new ArrayList<Ellipse2D>();
			circleList = new ArrayList<Ellipse2D>();
			triangleList = new ArrayList<Polygon>();
			polygonList = new ArrayList<Polygon>();
		}
		
		public void clear()
			{
				rektangleList.clear();
				squareList.clear();
				ellipseList.clear();
				circleList.clear();
				triangleList.clear();
				polygonList.clear();
				repaint();
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
				int height = (int) (Math.random() * 100);

				squareList.add(new Rectangle(xPos, yPos, height, height));

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
		
		public void addTriangle()
			{
				int firstX = (int) (Math.random() * getWidth());
				int firstY = (int) (Math.random() * getWidth());
				int firstPoint = (int) (Math.random() * getWidth());
				int secPoint = (int) (Math.random() * getHeight());
				int thirdPoint = (int) (Math.random() * getHeight());
				int fourthPoint = (int) (Math.random() * getHeight());

				int x2Points[] = {firstX, firstPoint, secPoint};
				int y2Points[] = {firstY, thirdPoint, fourthPoint};
				Polygon myTriangle = new Polygon(x2Points, y2Points, 3);
				
				triangleList.add(myTriangle);

				repaint();
			}
		
		public void addPolygon()
		{
			int firstX = (int) (Math.random() * getWidth());
			int firstY = (int) (Math.random() * getWidth());
			int firstPoint = (int) (Math.random() * getWidth());
			int secPoint = (int) (Math.random() * getHeight());
			int thirdPoint = (int) (Math.random() * getHeight());
			int fourthPoint = (int) (Math.random() * getHeight());
			int fifthPoint = (int) (Math.random() * getHeight());
			int sixthPoint = (int) (Math.random() * getHeight());
			int svenPoint = (int) (Math.random() * getHeight());
			int eightPoint = (int) (Math.random() * getHeight());

			int x2Points[] = {firstX, firstPoint, secPoint, fifthPoint, svenPoint};
			int y2Points[] = {firstY, thirdPoint, fourthPoint, sixthPoint, eightPoint};
			Polygon myPoly = new Polygon(x2Points, y2Points, 5);
			
			polygonList.add(myPoly);

			repaint();
		}
		
		@Override
		protected void paintComponent(Graphics currentGraphic)
		{
			super.paintComponent(currentGraphic);
			Graphics2D mainGraphics = (Graphics2D) currentGraphic;
			mainGraphics.setStroke(new BasicStroke(2));
			
			for (Polygon current : triangleList)
				{
					int red = (int) (Math.random() * 256);
					int green = (int) (Math.random() * 256);
					int blue = (int) (Math.random() * 256);

					mainGraphics.setColor(new Color(red, green, blue));
					mainGraphics.draw(current);
				}
			
			for (Polygon current : polygonList)
				{
					int red = (int) (Math.random() * 256);
					int green = (int) (Math.random() * 256);
					int blue = (int) (Math.random() * 256);

					mainGraphics.setColor(new Color(red, green, blue));
					mainGraphics.draw(current);
				}
			
			for (Rectangle current : rektangleList)
				{
					int red = (int) (Math.random() * 256);
					int green = (int) (Math.random() * 256);
					int blue = (int) (Math.random() * 256);

					mainGraphics.setColor(new Color(red, green, blue));
					mainGraphics.draw(current);
				}
			
			for (Rectangle current : squareList)
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
