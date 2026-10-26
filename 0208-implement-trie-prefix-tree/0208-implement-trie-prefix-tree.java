class Trie {
    private Trie[] children;
    private boolean eow;
    private Trie root;
    // Initialize your data structure here.
    public Trie() {
        children = new Trie[26];
        eow = false;
        root = this;
    }
    
    // Inserts a word into the trie.
    public void insert(String word) {
        Trie curr = root;
        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';
            if (curr.children[idx] == null) {
                curr.children[idx] = new Trie();
            }
            curr = curr.children[idx];
        }
        curr.eow = true;
    }
    
    // Returns if the word is in the trie.
    public boolean search(String word) {
        Trie curr = root;
        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';
            if (curr.children[idx] == null) {
                return false;
            }
            curr = curr.children[idx];
        }
        return curr.eow;
    }
    
    // Returns if there is any word in the trie that starts with the given prefix.
    public boolean startsWith(String prefix) {
        Trie curr = root;
        for (int i = 0; i < prefix.length(); i++) {
            int idx = prefix.charAt(i) - 'a';
            if (curr.children[idx] == null) {
                return false;
            }
            curr = curr.children[idx];
        }
        return true;
    }
}
    
 