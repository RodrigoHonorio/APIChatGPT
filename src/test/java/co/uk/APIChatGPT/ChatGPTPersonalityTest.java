package co.uk.APIChatGPT;


import co.uk.APIChatGPT.openAI.ChatGPTPersonality;
import org.junit.jupiter.api.Test;
import java.io.IOException;
import static org.junit.jupiter.api.Assertions.*;

public class ChatGPTPersonalityTest {

    @Test
    void testToAsk() throws IOException, InterruptedException {
        ChatGPTPersonality chatGPTPersonality = new ChatGPTPersonality();


        String question = "What is your name and personality?";


        String response = chatGPTPersonality.toAsk(question);
        assertNotNull(response);
        assertTrue(response.length() > 0); 
    }
}
