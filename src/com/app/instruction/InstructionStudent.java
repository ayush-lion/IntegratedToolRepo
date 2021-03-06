package com.app.instruction;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;

public class InstructionStudent 
{
	private String ins_text;
	private String ins_shape;
	private Image image;
	private  int posX;
	private boolean isthinking;
	private int posY;
	private int height;
	private int width;
	private boolean switchable;
	
	public InstructionStudent()
	{ 
		//default constructor
		
	}
	
	
	private void drawString(Graphics g, String text, int x, int y) {
		for (String line : text.split("\n"))
			g.drawString(line, x, y += g.getFontMetrics().getHeight());
	}
	public void draw_instruction(Graphics g)

	{
		if (isSwitchable()) { 
			int count=0;
			String sb = null;
			String str=getIns_text();
			String[] strArray = str.split(" ");
			StringBuffer sbuf = new StringBuffer();

			for (int i = 0; i < strArray.length; i++) {
				if (i != 0 && i % 4 == 0) {
					sbuf.append("\n");
					System.out.println(i);
					count=i;
				}
				sbuf.append(strArray[i]).append(" ");
			}
			sb = sbuf.toString();
			System.out.println(count);
			g.setColor(Color.BLACK);
			
			/**check include Student thinking Image*/
			
			//g.drawArc(getPosX()+170, getPosY()-115, 90, 150, 45, 360);
			//g.drawArc(getPosX()+270, getPosY()-50, 15, 20, 45, 360);
			//g.drawArc(getPosX()+300, getPosY()-40, 5, 10, 45, 360);
			
				
			
			if(count<=4) 
				{
				g.drawArc(getPosX(), getPosY()+50,getWidth() ,getHeight()/4, 45, 360);
				g.drawArc(getPosX(), getPosY()+50,getWidth(),getHeight()/4, 45, 360);
				g.drawArc(getPosX(), getPosY()+50,getWidth(),getHeight()/4, 45, 360);
				
				//g.drawRect(getPosX(), getPosY()+50, getWidth(), getHeight()/5);    
				
				}
				else if(count>8)
				{
				g.drawArc(getPosX(), getPosY()+50,getWidth(),getHeight()/3, 45, 360);
				g.drawArc(getPosX(), getPosY()+50,getWidth(),getHeight()/3, 45, 360);
				g.drawArc(getPosX(), getPosY()+50,getWidth(),getHeight()/3, 45, 360);		
					
				//g.drawRect(getPosX(), getPosY()+50, getWidth(), getHeight()/4);    
				
				}
				else if(count>=12)
				{
				g.drawArc(getPosX(), getPosY()+50,getWidth(),getHeight()/2, 45, 360);
				g.drawArc(getPosX(), getPosY()+50,getWidth(),getHeight()/2, 45, 360);
				g.drawArc(getPosX(), getPosY()+40,getWidth(),getHeight()/2, 45, 360);
					
				//g.drawRect(getPosX(), getPosY()+50, getWidth(), getHeight()/3);   
				
				}
				else 
				{
				
				g.drawArc(getPosX(), getPosY()+50,getWidth(),getHeight(), 45, 360);
				g.drawArc(getPosX(), getPosY()+50,getWidth(),getHeight(), 45, 360);
				g.drawArc(getPosX(), getPosY()+50,getWidth(),getHeight(), 45, 360);	
				
				//g.drawRect(getPosX(), getPosY()+50, getWidth(), getHeight()/2); 	
				
				}
			g.setFont(g.getFont().deriveFont(12f));
	        drawString(g, sb, getPosX()+55, getPosY()+50);
			}
	        
			else
			
			{
			//g.setColor(Color.TRANSLUCENT);
			g.setColor(Color.WHITE);
			g.drawRect(getPosX(), getPosY(), getWidth(), getHeight());
			}
		}
	
	
	private ArrayList<String> fragmentText(String text, int maxWidth) {
	    ArrayList<String> lines = new ArrayList<String>();
	    String line = "";
	    if (text.length() < maxWidth) {
	    	lines.add(text);
	        return lines;
	    }
	    
	    String[] words = text.split(" ");
	    boolean isAdded = false;
	    for (String word : words) {
	    	String txt = line + word + " ";
	    	int len = txt.length();
	    	if(len >= maxWidth) {
	    		isAdded = true;
	    		lines.add(line);
	    		line = word + " ";
	    		txt = "";
	    	} else {
	    		isAdded = false;
	    		line = txt;
	    	}
		}
	    if(!isAdded) {
	    	lines.add(line);
	    }
	    
	    return lines;
	}
	
	
	/**
	 * @return the posX
	 */
	public int getPosX() {
		return posX;
	}


	/**
	 * @param posX the posX to set
	 */
	public void setPosX(int posX) {
		this.posX = posX;
	}

	

	/**
	 * @return the switchable
	 */
	public boolean isSwitchable() {
		return switchable;
	}


	/**
	 * @param switchable the switchable to set
	 */
	public void setSwitchable(boolean switchable) {
		this.switchable = switchable;
	}



	/**
	 * @return the isthinking
	 */
	public boolean isIsthinking() {
		return isthinking;
	}


	/**
	 * @param isthinking the isthinking to set
	 */
	public void setIsthinking(boolean isthinking) {
		this.isthinking = isthinking;
	}


	/**
	 * @return the posY
	 */
	public int getPosY() {
		return posY;
	}


	/**
	 * @param posY the posY to set
	 */
	public void setPosY(int posY) {
		this.posY = posY;
	}


	/**
	 * @return the height
	 */
	public int getHeight() {
		return height;
	}


	/**
	 * @param height the height to set
	 */
	public void setHeight(int height) {
		this.height = height;
	}


	/**
	 * @return the width
	 */
	public int getWidth() {
		return width;
	}


	/**
	 * @param width the width to set
	 */
	public void setWidth(int width) {
		this.width = width;
	}


	public Image getImage() {
		return this.image;
	}


	public void setImage(Image image) {
		this.image = image;
	}


	public String getIns_shape() {
		return this.ins_shape;
	}
	
	public String getIns_text() {
		return this.ins_text;
	}
	
	public void setIns_shape(String ins_shape) {
		this.ins_shape = ins_shape;
	}
	
	public void setIns_text(String ins_text) {
		this.ins_text = ins_text;
	}


}
