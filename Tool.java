/**
 * Paint Program
 * @author 18nleung
 * @version 25 May 2018
 */

import java.awt.Color;
import java.awt.Point;

public abstract class Tool {
	Canvas canvas;
	Point initialMousePosition;
	Color currentColor;
	
	public Tool(Canvas canvas, Point initialMousePosition, Color currentColor) {
		this.canvas = canvas;
		this.initialMousePosition = initialMousePosition;
		this.currentColor = currentColor;
	}
	
	public abstract void draw(Point finalMousePosition);
}
