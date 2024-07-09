package co.uk.APIChatGPT;

import co.uk.APIChatGPT.openAI.ChatGPTPersonality;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

/**
 * The main entry point for the API ChatGPT application.
 */
@SpringBootApplication
public class ApiChatGptApplication {

	/**
	 * Main method to start the Spring Boot application and interact with ChatGPT.
	 *
	 * @param args Command-line arguments
	 * @throws IOException          If there is an I/O related issue
	 * @throws InterruptedException If the execution is interrupted
	 */
	public static void main(String[] args) throws IOException, InterruptedException {
		SpringApplication.run(ApiChatGptApplication.class, args);

		System.out.println("What is your name and personality?");
		ChatGPTPersonality chatGPTPersonality = new ChatGPTPersonality();
		var response = chatGPTPersonality.toAsk("What is your name and personality?");

		System.out.println("Response: " + response);
	}
}
