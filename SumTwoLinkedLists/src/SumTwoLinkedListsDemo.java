
public class SumTwoLinkedListsDemo {

	public static void main(String[] args) {
		ListNode v3 = new ListNode(2);
		ListNode v2 = new ListNode(4,v3);
		ListNode v1 = new ListNode(3,v2);
		
		ListNode w3 = new ListNode(5);
		ListNode w2 = new ListNode(6,w3);
		ListNode w1 = new ListNode(4,w2); 
		
		 SumTwoLinkedLists s = new  SumTwoLinkedLists();
		ListNode result =s.addTwoLL(v1,w1);
		while(result!=null){
			System.out.println(result.data);
			result = result.next;
		}
	}

}
