# Hello World with gRPC
### Steps:
- Create Spring Boot project using Spring initializr
- Modify `build.gradle` to add gRPC and protobuf configurations
- Create `hello.proto` file
- Run `gradlew build` to auto-generate the Java code based on `hello.proto`
- Create `GreetingService` server class
- Run `gradlew bootRun` to start the application
- Create `GreetingClient` client class
- Run `GreetingClient`