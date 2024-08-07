# APIChatGPT

Welcome to **APIChatGPT**, a Java application integrated with OpenAI's ChatGPT model. This application allows you to interact with ChatGPT through a simple interface.

## Features

- **Interactive Chat with ChatGPT**: Ask questions and receive responses generated by ChatGPT.
- **Customizable Personality**: Define a personality for ChatGPT to use in its responses.
- **Integration with Spring Boot**: Easy setup and deployment using Spring Boot.

## How to Implement

### Prerequisites

Make sure you have the following installed:

- Java Development Kit (JDK) version 17 or later
- Maven

### Step-by-Step Implementation

1. **Clone the Repository**

   ```bash
   git clone https://github.com/RodrigoHonorio/APIChatGPT.git
   cd APIChatGPT

### Configure Environment Variables

Ensure you have set up the environment variable `OPEN_AI` with your OpenAI API key. This can be set in your system's environment variables or added directly to your IDE's run configuration.

### Build the Project

```bash
mvn clean install

### Run the Application

```bash
mvn spring-boot:run
This command starts the Spring Boot application. Navigate to http://localhost:8080 in your web browser to interact with ChatGPT.

### Functionality

**Main Application (ApiChatGptApplication.java):**

- Initializes and runs the Spring Boot application.
- Interacts with `ChatGPTPersonality.java` to send user queries to ChatGPT and display responses.

**ChatGPTPersonality.java:**

- Handles communication with the OpenAI API.
- Constructs JSON requests with user questions and predefined personality traits.
- Processes API responses and returns the generated text.

**ChatGPTData.java:**

- Contains static configuration values for API endpoints, API keys, model settings, temperature, and maximum tokens.

### Dependencies (from `pom.xml`)

- **Spring Boot Starter Web:**
  - Provides essential components for building web applications with Spring Boot.
  
- **Spring Boot DevTools:**
  - Enables fast application restarts during development.
  
- **Lombok:**
  - Simplifies Java code by providing annotations to reduce boilerplate code.
  
- **Gson:**
  - A Java library for JSON serialization and deserialization.
  
- **JUnit 5:**
  - A framework for writing and running tests in Java.

### Support

For any issues or questions, please [open an issue here](https://github.com/your-username/your-repository-name/issues).

### License

This project is licensed under the MIT License - see the `LICENSE` file for details.



