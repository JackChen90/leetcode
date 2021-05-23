package indi.jackie.leetcode.struct;

/**
 * @author jackie chen
 * @create 2021/5/23
 * @description Trie208
 */
public class Trie208 {

    private TireNode tireNode = null;

    /**
     * Initialize your data structure here.
     */
    public Trie208() {
        tireNode = new TireNode();
    }

    /**
     * Inserts a word into the trie.
     */
    public void insert(String word) {
        if (null == word || word.length() == 0) {
            return;
        }

        TireNode tireNode = this.tireNode;
        for (char item : word.toCharArray()) {
            int index = item - 'a';
            if (null == tireNode.next[index]) {
                tireNode.next[index] = new TireNode();
            }
            tireNode = tireNode.next[index];
        }
        tireNode.isWord = true;
    }

    /**
     * Returns if the word is in the trie.
     */
    public boolean search(String word) {
        TireNode tireNode = getPrefix(word);
        return tireNode != null && tireNode.isWord;
    }

    private TireNode getPrefix(String word) {
        if (null == word || word.length() == 0) {
            return null;
        }
        char[] chars = word.toCharArray();
        TireNode tireNode = this.tireNode;
        for (char item : chars) {
            int index = item - 'a';
            if (tireNode.next == null || null == tireNode.next[index]) {
                return null;
            }
            tireNode = tireNode.next[index];
        }
        return tireNode;
    }

    /**
     * Returns if there is any word in the trie that starts with the given prefix.
     */
    public boolean startsWith(String prefix) {
        TireNode tireNode = getPrefix(prefix);
        return tireNode != null;
    }

    private static class TireNode {
        private boolean isWord;

        private TireNode[] next = new TireNode[26];
    }
}
