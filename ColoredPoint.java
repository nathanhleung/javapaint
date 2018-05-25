/**
 * ColoredPoint
 * @author 18nleung
 * @version 25 May 2018
 */

import java.awt.Point;
import java.awt.Color;

public class ColoredPoint extends Point {
	private Color color;
	
	public ColoredPoint(Point point, Color color) {
		super(point);
		this.color = color;
	}
	
	public ColoredPoint(int x, int y, Color color) {
		super(x, y);
		this.color = color;
	}
	
	public Color getColor() {
		return this.color;
	}
}
