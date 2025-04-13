# Dependency Injection task

This is an application that provides REST APIs to demonstrate different dependency injection techniques.

## Getting started

1. Clone the repository.
2. Open a terminal
3. Change the working directory to the project's directory
    ```bash
    cd <project_dir>
    ```
4. Build the project
    - If Maven installed locally
   ```bash
   mvn package
   ```
    - If Maven not installed locally
   ```bash
   .\mvnw package
   ```
5. Run the application
   ```bash
   java -jar .\target\ditask-0.0.1-NO-PRIMARY-BEANS-SNAPSHOT.jar
   ```

## API endpoints

Note: This is branch has no primary beans. It is covering field injection using `@Qualifier` and variable name matching. Please refer to [master](https://github.com/Youssef-S-Negm/ditsk) for trying field injection using primary beans and `@Qualifier`. 

| URL                               | Method | Response                                                                                                  | Notes                                                                                                                                               
|-----------------------------------|--------|-----------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------|
| `http://localhost:8080/match-name`   | `GET`  | `[{"id":1,"name":"Introduction to Java Programming"},{"id":2,"name":"Introduction to Spring framework"}]` | This will return the recommended courses provided by `mainCourseRecommender` bean found in `com.youssef.ditask.config.ApplicationConfiguration`     |
| `http://localhost:8080/qualifier` | `GET`  | `[{"id":3,"name":"Introduction to Kotlin"},{"id":4,"name":"Introduction to AI and machine learning"}]`    | This will return the recommended courses provided by `secondaryCourseRecommender` bean found in `com.youssef.ditask.config.ApplicationConfiguration`                            |
