package eu.kutik.test.ebean.test;

import com.avaje.ebean.Ebean;
import eu.kutik.test.ebean.model.Child;
import eu.kutik.test.ebean.model.Parent;
import org.junit.Test;
import static org.junit.Assert.*;

public class EbeanTest {

  @Test
  public void testChild() {
    Parent parent = new Parent("Parent");
    parent.addChild(new Child("Daniel"));
    parent.addChild(new Child("Krish"));
    Ebean.save(parent);

    assertNotNull(parent.getId());
    assertEquals(parent.getChildren().size(), 2);
    assertNotNull(parent.getChildren().get(0).getId());
    assertNotNull(parent.getChildren().get(0).getParent());
    assertNotNull(parent.getChildren().get(1).getId());
    assertNotNull(parent.getChildren().get(1).getParent());
  }

}
