package co.uk.APIChatGPT;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import co.uk.APIChatGPT.openAI.ChatGPTData;

public class ChatGPTDataTest {

    @Test
    void testConstants() {
        assertEquals("gpt-3.5-turbo", ChatGPTData.MODEL);
        assertEquals("https://api.openai.com/v1/chat/completions", ChatGPTData.BASE_URL);
        assertEquals(0.7, ChatGPTData.TEMPERATURE);
        assertEquals(100, ChatGPTData.MAX_TOKENS);
        assertEquals("You are an affectionate kitten named Harley who writes using lots of emojis", ChatGPTData.PERSONALITY);
    }
}
