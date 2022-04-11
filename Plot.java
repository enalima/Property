
public class Plot {
private int x;

private int y;

private int width;

private int depth;

public Plot() {
	x = 0;
	y = 1;
	width = 1;
	depth = 1;

}

public Plot(Plot p) {
	this.x = p.x;
	this.y = p.y;
	this.width = p.width;
	this.depth = p.depth;
}

public Plot(int x, int y, int width, int depth) {
	this.x = x;
	this.y = y;
	this.width = width;
	this.depth = depth;
}

public boolean overlaps(Plot plot) {
	boolean result = false;
	
	if((x < plot.getX() + plot.getWidth()) &&(x + width > plot.getX()) && (y < plot.getY() + plot.getDepth()) && (y + depth > plot.getY())){
	   result = true;
	}
					
       return result;
	}

public boolean encompasses(Plot plot) {
	boolean result = false;
	if ((x <= plot.getX()) && (y <= plot.getY()) && ((x + width) >=(plot.getX() + plot.getWidth()))&& ( (y + depth) >= (plot.getY() +  plot.getDepth())))
	{
		result = true;
	}
	return result;
}

public void setX(int x) {
	this.x = x;
}

public int getX() {
	return x;
}

public void setY(int y) {
	this.y = y;
}

public int getY() {
	return y;
}

public void setWidth(int width) {
	this.width = width;
}

public int getWidth() {
	return width;
}

public void setDepth(int depth) {
	this.depth = depth;
}

public int getDepth() {
	return depth;
}

@Override
public String toString() {
	return "Upper left: (" + x + ","  +y + "); Width: " + width + " Depth: " + depth;
	
}
}
