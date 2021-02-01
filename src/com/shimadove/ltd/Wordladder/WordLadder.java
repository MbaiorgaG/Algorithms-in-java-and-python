package com.shimadove.ltd.Wordladder;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Queue;

public class WordLadder {

	/**
	 * Question
	 * Given two words beginWord and endWord, and a dictionary wordList,
	 * return the length of the shortest transformation sequence from beginWord to endWord, such that:
	 *     Only one letter can be changed at a time.
	 *     Each transformed word must exist in the word list.
	 * Return 0 if there is no such transformation sequence.
	 */


	static class Object{
		String word;
		int len;
		public Object(String word, int len) {
			this.word = word;
			this.len = len;
		}

	}

	/**
	 * @param beginWord
	 * @param endWord
	 * @param wordList
	 * @return
	 */
	public int ladderLength(String beginWord, String endWord, List<String> wordList){
		// Base case
		if(beginWord.length() == 0 || endWord.length() == 0|| wordList.size() == 0)
			return 0;

		Queue<Object> queue = new LinkedList<>(); //The reason for the queue is to hold the words
		queue.add(new Object(beginWord, 1));
		//Keep traversing untill the queue has something.
		while (!queue.isEmpty()){
			Object current = queue.poll();
			ListIterator<String> iterator = wordList.listIterator();
			while (iterator.hasNext()){
				String temp = iterator.next();
				if(isAdjacent(current.word,temp )){
					iterator.remove();
					queue.add(new Object(temp, current.len + 1));
					if(temp.equals(endWord)){
						return  current.len +1;
					}
				}
			}
		}
		return 0;
	}

	private boolean isAdjacent(String word, String temp) {
		int count = 0;
		for(int i = 0; i <word.length();i++){
			if(word.charAt(i) != temp.charAt(i)){
				count++;
				if(count > 1)
					return false;
			}
		}
		return count > 1? false :true;
	}
}
