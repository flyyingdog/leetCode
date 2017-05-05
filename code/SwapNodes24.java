package com.lxy.code;

public class SwapNodes24 {

	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

	public ListNode swapPairs(ListNode head) {
		if(head==null || head.next==null) return head;
		ListNode second = head.next;
		second.next=head;
		head.next=swapPairs(head.next.next);
		return second;
		
	}

}
