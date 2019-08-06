import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Food {

  @Value("bread")
  private String name;
  @Value("2")
  private Integer count;


  public void setName(String name) {
    this.name = name;
  }


  public void setCount(Integer count) {
    this.count = count;
  }

  public String getName() {
    return name;
  }

  public Integer getCount() {
    return count;
  }
}
