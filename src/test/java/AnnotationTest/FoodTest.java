package AnnotationTest;

import javax.annotation.Resource;

import Annotation.Food;
import Annotation.Person;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration(classes = {Person.class})
@RunWith(SpringJUnit4ClassRunner.class)
public class FoodTest {

  @Resource
  Food food;
  @Resource
  Person person;

  @Test
  public void test_food() {
    Assert.assertEquals(food.getCount(), Integer.valueOf(2));
    Assert.assertEquals(food.getName(), "bread");
  }

  @Test
  public void test_person() {
    Assert.assertEquals(person.getAge(), Integer.valueOf(12));
    Assert.assertEquals(person.getName(), "alice");
  }
}
