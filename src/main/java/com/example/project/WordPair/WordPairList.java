package com.example.project.WordPair;
import java.util.ArrayList;

public class WordPairList {
    private ArrayList<WordPair> allPairs;

    public WordPairList(String[] words) {
        allPairs = new ArrayList<WordPair>();
        for (int i = 0; i < words.length; i++) {
            for (int ii = i + 1; ii < words.length; ii++) {
                allPairs.add(new WordPair(words[i], words[ii]));
            }
        }
    }

    // The method below was added for testing;
    // it was not part of the original FRQ
    public ArrayList<WordPair> getAllPairs() {
        return allPairs;
    }

    public int numMatches() {
        int res = 0;
        for (WordPair p: allPairs) {
            if (p.getFirst().equals(p.getSecond()))
                res++;
        }
        return res;
    }

    // The method below was added for testing;
    // it was not part of the original FRQ
    public String toString() {
        return allPairs.toString();
    }
}
