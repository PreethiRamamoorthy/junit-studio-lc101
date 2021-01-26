package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    //Test1
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }
    //Test2
    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }
    //Test3
    @Test
    public void wordsWithBracketsAtEndReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }
    //Test4
    @Test
    public void secondWordWithinBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"));
    }
    //Test5
    @Test
    public void bracketsInTheBeginningReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode"));
    }
    //Test6
    @Test
    public void emptyStringReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }
    //Test7
    @Test
    public void onlyOneOpenBracketWithWordsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
    }
    //Test8
    @Test
    public void notMatchingBracketWithWordsReturnsFalse() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch]Code["));
    }
    //Test9
    @Test
    public void onlyOneOpenBracketWithoutWordsReturnsFalse()  {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }
    //Test10
    @Test
    public void notMatchingBracketWithoutWordsReturnsFalse() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("]["));
    }
    //Test11
    @Test
    public void noBracketsOnlyWordsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("LaunchCode"));
    }
    //Test12
    @Test
    public void differentBracketType() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("{}{}{{{{}}}}Launch}}}Code(()()()"));
    }
}
