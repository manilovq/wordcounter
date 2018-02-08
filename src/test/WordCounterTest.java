

import static org.junit.Assert.*;
import org.junit.Test;

public class WordCounterTest {

    @Test
    public void countWords() {
        InputData inputData = new InputData("hello Hello1 Hello", "hello");
        assertEquals(WordCounter.countWords(inputData), 2);
    }
}