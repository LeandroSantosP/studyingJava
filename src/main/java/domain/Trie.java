package domain;

import java.util.HashMap;
import java.util.Map;

public class Trie {
    Map<Character, Trie> root;
    boolean isEndOfWord;
    public Trie() {
        this.root = new HashMap<>();
        this.isEndOfWord = false;
    }
    public void insert(String word) {
        Trie current = this;
        for (char ch : word.toCharArray()) {
            current.root.putIfAbsent(ch, new Trie());
            current = current.root.get(ch);
        }
        current.isEndOfWord = true;
    }
    public boolean search(String word) {
        Trie node = this.searchNode(word);
        return node != null && node.isEndOfWord;
    }
    public boolean startsWith(String prefix) {
        return this.searchNode(prefix) != null;
    }
    private Trie searchNode(String word) {
        Trie current = this;
        for (char ch : word.toCharArray()) {
            if (!current.root.containsKey(ch)) {
                return null;
            }
            current = current.root.get(ch);
        }
        return current;
    }
}