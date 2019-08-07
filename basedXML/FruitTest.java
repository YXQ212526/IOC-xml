import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration(locations = "classpath:myxml.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class FruitTest {

  @Test
  public void test() {
    ApplicationContext context = new ClassPathXmlApplicationContext("myxml.xml");
    Fruit fruit = context.getBean(Fruit.class);
    Assert.assertSame(fruit.getCode(), 1);
    Assert.assertEquals(fruit.getFruit(), "apple");
  }

}
