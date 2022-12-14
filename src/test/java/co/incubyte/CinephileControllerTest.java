package co.incubyte;

import io.micronaut.http.HttpStatus;
import io.micronaut.http.client.HttpClient;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import org.junit.jupiter.api.Test;
import io.micronaut.http.client.annotation.*;
import jakarta.inject.Inject;
import static org.junit.jupiter.api.Assertions.*;

@MicronautTest
class CinephileControllerTest {
  @Inject
  @Client("/")
  HttpClient client;

  @Test
  void testIndex() throws Exception {
    String response = client.toBlocking().retrieve("/cinephile");
    assertEquals("Hello World!", response);
  }
}
