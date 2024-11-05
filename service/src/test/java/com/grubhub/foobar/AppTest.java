
package com.grubhub.foobar;

import io.micrometer.core.instrument.MeterRegistry;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = { App.class },
        webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT,
        properties = {
                "discovery.enabled=false",
                "messaging.enabled=false",
                "rpc.enabled=false"
        })
public class AppTest {
  @Autowired
  MeterRegistry meterRegistry;

  @Test
  void contextLoads() {
    // TODO(fixme)  assertThat(meterRegistry).isNotNull();

    // Add Http Test
  }
}
