package indi.jackie.leetcode.struct;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jackie chen
 * @create 2021/5/23
 * @description Trie208Test
 */
public class Trie208Test {

    @Test
    public void test1() {
        boolean result;
        Trie208 trie = new Trie208();
        trie.insert("app");
        trie.insert("apple");
        trie.insert("beer");
        trie.insert("add");
        trie.insert("jam");
        trie.insert("rental");
        result = trie.search("apps");
        Assert.assertFalse(result);
        result = trie.search("app");
        Assert.assertTrue(result);
        result = trie.search("ad");
        Assert.assertFalse(result);
        result = trie.search("applepie");
        Assert.assertFalse(result);
        result = trie.search("rest");
        Assert.assertFalse(result);
        result = trie.search("jan");
        Assert.assertFalse(result);
        result = trie.search("rent");
        Assert.assertFalse(result);
        result = trie.search("beer");
        Assert.assertTrue(result);
        result = trie.search("jam");
        Assert.assertTrue(result);
    }
}