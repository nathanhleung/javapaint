/**
 * Canvas
 * @author 18nleung
 * @version 25 May 2018
 */

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;

public class Canvas extends JPanel {
	private List<ColoredPoint> points;
	
	public Canvas(int height, int width) {
		this.setSize(new Dimension(height, width));
		this.points = new ArrayList<ColoredPoint>();
	}
	
	public void draw(Point point, Color color) {
		ColoredPoint coloredPoint = new ColoredPoint(point, color);
		this.points.add(coloredPoint);
	}
	
	public void paint(Graphics g) {
		for (ColoredPoint point : points) {
			g.setColor(point.getColor());
			g.fillOval((int) point.getX(), (int) point.getY(), 1, 1);
		}
	}
}
