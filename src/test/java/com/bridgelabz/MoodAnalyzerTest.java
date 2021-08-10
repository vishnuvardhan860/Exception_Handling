package com.bridgelabz;

import static org.junit.Assert.assertTrue;

import junit.framework.TestCase;
import org.junit.Test;

public class MoodAnalyzerTest {
    private TestCase Assertions;

    @Test
    public void givenSadMessageShouldReturnSadMessage() throws MoodAnalyzerException {
        MoodAnalyzer mood1 = new MoodAnalyzer("Sad");
        String mood = mood1.analyseMood(null);
        Assertions.assertEquals("SAD", mood);
    }
    @Test
    public void givenHappyMassageShouldReturnHappyMessage() throws MoodAnalyzerException {
        MoodAnalyzer mood2 = new MoodAnalyzer("Hello am in happy mood");
        String mood = mood2.analyseMood(null);
        Assertions.assertEquals("HAPPY", mood);
    }
    @Test
    public void givenAnyMassageShouldReturnHappyMessage() throws MoodAnalyzerException {
        MoodAnalyzer mood3 = new MoodAnalyzer("Hello am not in mood");
        String mood = mood3.analyseMood(null);
        Assertions.assertEquals("HAPPY", mood);
    }

    @Test
    public void givenNullMassageShouldReturnHappyMessage(){
        MoodAnalyzer mood4 = new MoodAnalyzer(null);
        try {
            mood4.analyseMood(null);
        } catch (MoodAnalyzerException e) {
            Assertions.assertEquals("Enter value is null", MoodAnalyzerException.ExceptionType.NullType);
        }
    }

    @Test
    public void givenEmptyMessageShouldReturnThrowCustomException() {
        MoodAnalyzer mood5 = new MoodAnalyzer(" ");
        try {
            mood5.analyseMood(" ");
        } catch (MoodAnalyzerException e) {
            Assertions.assertEquals("Entered value is empty", MoodAnalyzerException.ExceptionType.EmptyType);
            System.out.println(e.type);
            System.out.print(e.getMessage());

        }
    }
}