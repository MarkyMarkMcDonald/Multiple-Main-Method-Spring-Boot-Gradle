package demo;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("!background")
public class NonBackgroundInitializer implements InitializingBean {
    @Override
    public void afterPropertiesSet() throws Exception {
        throw new RuntimeException("Failed to initialize non-background dependency");
    }
}
