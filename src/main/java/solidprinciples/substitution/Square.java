package solidprinciples.substitution;

/**
 * Created by SK on 10/23/2021
 **/
public class Square extends Rectangle {

  public Square() {
  }

  public Square(int size) {
    width = height = size;
  }

  @Override
  public void setWidth(int width) {
    super.setWidth(width);
    super.setHeight(width);
  }

  @Override
  public void setHeight(int height) {
    super.setHeight(height);
    super.setWidth(height);
  }
}
