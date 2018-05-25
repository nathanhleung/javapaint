/**
 * Paint Program
 * @author 18nleung
 * @version 25 May 2018
 */

import java.awt.Color;
import java.awt.Point;

public abstract class Tool {
	private Canvas canvas;
	private Point initialMousePosition;
	private Color currentColor;
	
	public Tool(Canvas canvas, Point initialMousePosition, Color currentColor) {
		this.canvas = canvas;
		this.initialMousePosition = initialMousePosition;
		this.currentColor = currentColor;
	}
	
	public abstract void draw(Point finalMousePosition);
	
	public Canvas getCanvas() {
		return this.canvas;
	}
	
	public Point getInitialMousePosition() {
		return this.initialMousePosition;
	}
	
	public Color getCurrentColor() {
		return this.currentColor;
	}
}
