package day19_web;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Test01 {

	public static void main(String[] args) {
		
		Stack<String> stack = new Stack<String>();
		for(int i=0; i<100;i++) {
			stack.push(""+i);
		}
		System.out.println(stack.pop());
		
		Queue<Integer> queue = new LinkedList<Integer>();
		                            //노드기반
		for(int i=0; i<100; i++) {
			queue.offer(i);
			      //add = offer(queue) 집어넣는함수
			
		}
		System.out.println(queue.poll());
		
		

	}

}
