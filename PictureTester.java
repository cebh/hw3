package hw3;
import java.awt.Color;
import mediacomputation.Picture;
import mediacomputation.Turtle;
import mediacomputation.Pixel;
public class PictureTester {
	private static final String PICTURE_FILE = "C:/Users/Christian/workspace/cecs174/src/hw3/flower.jpg";
	public static void main(String[]args)
	{
		Picture flower = new Picture(PICTURE_FILE);
		Turtle painter = new Turtle(flower);
		Color col = new Color(20, 30, 50);
		//(int squareLength, int rectangleWidth, int rectangleHeight, int lineDistance, int penWidth, Color penColor)
		painter.createBorder1(25, 220, 220, 10, 5, col);
		flower.explore();
	}
}