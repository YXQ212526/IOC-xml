import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main {

  public static void main(String[] args) {
    ApplicationContext context = new ClassPathXmlApplicationContext("myxml.xml");
    Color color=(Color) context.getBean("red");
    Fruit fruit=context.getBean(Fruit.class);
    System.out.println(color);
    System.out.println(fruit);
  }


}
