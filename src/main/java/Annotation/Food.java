package Annotation;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Configuration
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
