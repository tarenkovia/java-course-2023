package edu.project1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SampleTestForProjectOne {
    @ParameterizedTest
    @ValueSource(strings = {"test", "hello", "world"})
    @DisplayName("Успешное угадывание буквы")
    void guess_CorrectLetter_ShouldReturnSuccessfulGuess(String answer) {
        Session session = new Session(answer, 10);

        GuessResult result = session.guess(answer.charAt(0));

        assertEquals(SuccessfulGuess.class, result.getClass());
        assertEquals(answer.length(), result.state().length);
        assertEquals(0, result.attempt());
        assertEquals(10, result.maxAttempts());
        assertEquals("Так держать, продолжай!", result.message());
    }

    @ParameterizedTest
    @ValueSource(strings = {"test", "hello", "world"})
    @DisplayName("Неудачное угадывание буквы")
    void guess_IncorrectLetter_ShouldReturnFailedGuess(String answer) {
        Session session = new Session(answer, 10);

        GuessResult result = session.guess('z');

        assertEquals(FailedGuess.class, result.getClass());
        assertEquals(answer.length(), result.state().length);
        assertEquals(1, result.attempt());
        assertEquals(10, result.maxAttempts());
        assertEquals("Этой буквы нет в слове", result.message());
    }

    @ParameterizedTest
    @ValueSource(strings = {"test ", "hello", "world"})
    @DisplayName("Успешно отгаданное слово")
    void guess_CorrectWord_ShouldReturnWin(String answer) {
        Session session = new Session(answer, 10);

        GuessResult result = session.guess(answer.charAt(0));

        assertEquals(Win.class, result.getClass());
        assertEquals(answer.length(), result.state().length);
        assertEquals(0, result.attempt());
        assertEquals(6, result.maxAttempts());
        assertEquals("Поздравляю! Ты отгадал слово!", result.message());
    }

    @ParameterizedTest
    @ValueSource(strings = {"test", "hello", "world"})
    @DisplayName("Проваленная игра")
    void guess_WrongWord_ShouldReturnDefeat(String answer) {
        Session session = new Session(answer, 1);

        GuessResult result = session.guess('z');

        assertEquals(Defeat.class, result.getClass());
        assertEquals(answer.length(), result.state().length);
        assertEquals(1, result.attempt());
        assertEquals(1, result.maxAttempts());
        assertEquals("Попытки закончились, игра закончена! Это было слово: " + answer, result.message());
    }
}
