import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.*;

public class PhotographerTest {
  Photographer photographer;
  Camera camera;

@Before 
public void before() {
  photographer = new Photographer("Faisal");
  camera = new Camera();
}

@Test
public void hasName() {
  assertEquals("Faisal", photographer.getName());
}

@Test
public void startsWithNoCamera() {
  assertEquals(0, photographer.cameraCount());
}



}