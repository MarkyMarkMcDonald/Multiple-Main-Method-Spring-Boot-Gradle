package background;

import demo.DemoBackgroundApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = DemoBackgroundApplication.class)
@ActiveProfiles("background")
public class BackgroundIntegrationTest {

    @Test
    public void backgroundTaskRuns() throws Exception {

    }
}
