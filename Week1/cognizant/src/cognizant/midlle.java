package cognizant;


class Node{
	 int data;
	 Node next;
	 Node(int data)
	 {
		 this.data=data;
	 }
	 
 }
public class midlle {
	
  
	public static Node middlelemt(Node head)
	{
		Node slow=head;
		Node fast=head;
		while(fast!=null && fast.next!=null)
		{
			slow=slow.next;
			fast=fast.next.next;
			
		}
		
			return slow;
		
		
			
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Node head =new Node(10);
head.next=new Node(20);
head.next.next=new Node(30);
head.next.next.next=new Node(40);
head.next.next.next.next=new Node(50);
System.out.println(middlelemt(head).data);
}

}


//List<Integer> list = Arrays.asList(10, 20, 30, 40, 50);
//System.out.println(list.get(list.size() / 2));
//if list given so use this appproaces
//now 10-20-30-40-50
//fast=10;
//slow=10
//fast=fast.next.next 10->30
//slow=slow.next10-20
//30-50
//20-30 slow =30 fast50
//
//after this process condition break so i aum using so this approach using tos lovet two pointer approach using ef
//time complexity = O(n)
//ColorSpace complexity()
