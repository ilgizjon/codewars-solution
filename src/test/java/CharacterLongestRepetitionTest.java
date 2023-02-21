import CodeWars.CharacterLongestRepitition;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class CharacterLongestRepetitionTest {

    @Test
    public void exampleTests() {
        assertArrayEquals(new Object[]{"a", 4}, CharacterLongestRepitition.longestRepetition("aaaabb"));
        assertArrayEquals(new Object[]{"a", 4}, CharacterLongestRepitition.longestRepetition("bbbaaabaaaa"));
        assertArrayEquals(new Object[]{"u", 3}, CharacterLongestRepitition.longestRepetition("cbdeuuu900"));
        assertArrayEquals(new Object[]{"b", 5}, CharacterLongestRepitition.longestRepetition("abbbbb"));
        assertArrayEquals(new Object[]{"a", 2}, CharacterLongestRepitition.longestRepetition("aabb"));
        assertArrayEquals(new Object[]{"", 0}, CharacterLongestRepitition.longestRepetition(""));
    }
}