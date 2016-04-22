package controller;

import view.AppFrame;

public class AppController
	{
		private AppFrame frame;
		
		public AppController()
		{
			frame = new AppFrame(this);
		}
		
		public AppFrame getFrame()
		{
			return frame;
		}
	}
