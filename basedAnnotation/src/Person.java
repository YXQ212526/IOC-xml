import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@ComponentScan
@Component
public class Person {

  @Autowired
  private Food food;

  @Value("alice")
  private String name;

  @Value("12")
  private Integer age;

  public void say() {
    System.out.println(name + ": " + age + " eat " + food.getCount() + " " + food.getName());
  }

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }

  public Integer getAge() {
    return age;
  }


  public void setAge(Integer age) {
    this.age = age;
  }


//  public Food getFood() {
//    return food;
//  }
//
//  public void setFood(Food food) {
//    this.food = food;
//  }
}
