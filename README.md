Setting up a background task to be run separately from a Web application, but to share domain objects.

You should see the associated runtime exceptions for each of these four tasks:

Run background app
```bash
SPRING_MAIN_WEB_ENVIRONMENT=FALSE SPRING_PROFILES_ACTIVE=background ./gradlew clean bootRun
```

Run web app
```bash
./gradlew clean bootRun
```

Test background app
```bash
./gradlew clean backgroundTest
```

Test web app
```bash
./gradlew clean test
```
