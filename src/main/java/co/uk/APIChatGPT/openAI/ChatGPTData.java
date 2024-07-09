package co.uk.APIChatGPT.openAI;

/**
 * Contains static constants used for configuring interactions with the ChatGPT API.
 */
public class ChatGPTData {

    /** API key to authenticate requests to the ChatGPT API. */
    public static final String API_KEY = System.getenv("OPEN_AI");

    /** Model identifier for the specific version of ChatGPT to use. */
    public static final String MODEL = "gpt-3.5-turbo";

    /** Base URL for making requests to the ChatGPT API. */
    public static final String BASE_URL = "https://api.openai.com/v1/chat/completions";

    /** Temperature parameter to adjust creativity of responses (0.0 to 1.0). */
    public static final Double TEMPERATURE = 0.7;

    /** Maximum number of tokens allowed in the response (approximate word count). */
    public static final Integer MAX_TOKENS = 100;

    /** Default personality setting used in conversations with ChatGPT. */
    public static final String PERSONALITY = "You are an affectionate kitten named Harley who writes using lots of emojis";
}
