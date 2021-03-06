import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.*;

public class PhotographerTest {
  Photographer photographer;
  Camera camera;
  AnalogCamera analogcamera;
  DigitalCamera digitalcamera;

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

@Test
public void canAddCamera() {
  photographer.addCamera(camera);
  assertEquals(1, photographer.cameraCount());
  }

 @Test 
 public void canRemoveCamera() {
  photographer.addCamera(camera);
  photographer.removeCamera();
  assertEquals(0, photographer.cameraCount());
 }
 
 @Test
 public void photographerCanGetCameraDetails() {
   photographer.addCamera(analogcamera);
   photographer.addCamera(digitalcamera);
   assertEquals("Sony ILCE5100L, No noise reduciton, Lo-resolution Nikon 34T, Noise reduction filter, Hi-resolution", )
 }

}