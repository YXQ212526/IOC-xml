public class Color {

  private int code;
  private String color;

  public void setCode(int code) {
    this.code = code;
  }

  public void setColor(String color) {
    this.color = color;
  }
//  Color(Fruit fruit)
//  {
//
//  }
  @Override
  public String toString(){
    return "code is "+code+" color is "+color;
  }
}
