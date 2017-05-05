package com.lxy.code;

public class RemoveList19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
	}
	
	public ListNode removeNthFromEnd(ListNode head, int n){
		if(n==0) return head;
		ListNode last = head;
		ListNode pre = head;
		for(int i = 0;i < n;i++){
			last = last.next;
		}
		if(last==null) return head.next;
		while((last=last.next)!=null){
			pre = pre.next;
		}
		pre = pre.next.next;
		
		return head;
	}

}
