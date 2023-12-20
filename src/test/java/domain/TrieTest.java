package domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrieTest {


    @Test
    void TestingTrieNodeAlgorithm(){
        Trie trie = new Trie();
        trie.insert("apple");
        assertTrue(trie.search("apple")); // Should print true
        assertFalse(trie.search("app"));   //  Should print false
        assertTrue(trie.startsWith("app")); // Should print true
        trie.insert("app");
        assertTrue(trie.search("app"));   //  Should print true
    }

}