public class Fruit {

  private int code;
  private String fruit;

  public void setCode(int code) {
    this.code = code;
  }

  public void setFruit(String fruit) {
    this.fruit = fruit;
  }

  public int getCode() {
    return code;
  }

  public String getFruit() {
    return fruit;
  }

  //
//  Fruit(Color color)
//  {
//
//  }
  @Override
  public String toString(){
    return "code is "+code+" fruit is "+fruit;
  }
}
