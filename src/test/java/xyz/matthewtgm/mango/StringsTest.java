package xyz.matthewtgm.mango;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class StringsTest {

    @Test
    @DisplayName("Capitalization test")
    public void capitalize() {
        String text = "hello, today we are going to...";
        System.out.println(text);
        System.out.println(Strings.capitalize(text));
    }

    @Test
    @DisplayName("Punctuation test")
    public void punctuate() {
        String statement = "hello";
        System.out.println(statement);
        System.out.println(Strings.punctuate(statement));

        String question = "how are you doing today";
        System.out.println(question);
        System.out.println(Strings.punctuate(question));
    }

    @Test
    @DisplayName("Capitalization and punctuation test")
    public void capitalizeAndPunctuate() {
        String statement = "hello guys";
        System.out.println("Statement: " + statement);
        System.out.println("Capitalized statement: " + Strings.capitalize(statement));
        System.out.println("Puncutated statement: " + Strings.punctuate(statement));
        System.out.println("Capitalized then punctuated statement: " + Strings.capitalize(Strings.punctuate(statement)));
        System.out.println("Punctuated then capitalized statement: " + Strings.punctuate(Strings.capitalize(statement)));

        String question = "how did you do that";
        System.out.println("Question: " + question);
        System.out.println("Capitalized question: " + Strings.capitalize(question));
        System.out.println("Puncutated question: " + Strings.punctuate(question));
        System.out.println("Capitalized then punctuated question: " + Strings.capitalize(Strings.punctuate(question)));
        System.out.println("Punctuated then capitalized question: " + Strings.punctuate(Strings.capitalize(question)));
    }

}