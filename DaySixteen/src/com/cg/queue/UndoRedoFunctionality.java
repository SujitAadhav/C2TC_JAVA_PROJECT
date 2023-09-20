package com.cg.queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class UndoRedoFunctionality {
	
	private static void performActionFromFrontEnd(String action, Deque<String> actionHistory) {
		System.out.println("Performing action:" + action);
		actionHistory.addFirst(action);
	}
	
	private static void performActionFromRearEnd(String action, Deque<String> actionHistory) {
		System.out.println("Performing action:" + action);
		actionHistory.addLast(action);
	}

	public static void main(String[] args) {
		Deque<String> actionHistory = new ArrayDeque<>();
		performActionFromFrontEnd("Input 1", actionHistory);
		performActionFromFrontEnd("Input 2", actionHistory);
		performActionFromFrontEnd("Input 3", actionHistory);
		
		System.out.println(actionHistory);
		
		performActionFromRearEnd("Action 1", actionHistory);
		performActionFromRearEnd("Action 2", actionHistory);
		performActionFromRearEnd("Action 3", actionHistory);
		
		System.out.println(actionHistory);
		
		if(!actionHistory.isEmpty()) {
			String lastAction = actionHistory.removeLast();
			System.out.println("Undo:"+ lastAction);
		}
		
		if(!actionHistory.isEmpty()) {
			String lastAction = actionHistory.removeFirst();
			System.out.println("Redo:"+lastAction);
		}
		
	}

}
