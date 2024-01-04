package set1.q1.Beans;

public class EmpLL {
	Node head = null;
	Node tail = null ;
	class Node{
		Emp data;
		Node next;
		public Node(Emp val) {
			data = val;
			next = null;
		}
	}
	
//	public EmpLL() {
//		super();
//		head =null;
//		tail = null;
//	}
	
	public void Insert(Emp ob) {
		if(tail==null) {
			tail=new Node(ob);
			head=tail;
		}
		else {
			Node newnode = new Node(ob);
			tail.next = newnode;
			tail = newnode;
		}
	}
	
	public void remove() {
		Node temp = head;
		if(head==null) {
			System.out.println("List ia Empty");
		}
		else {
			head = temp.next;
			temp.next = null;
			temp = null;
		}
	}
	
	public void displayFemale() {
		Node temp=head;
		if(head==null) {
			System.out.println("list is empty");
		}
		while(temp!=null) {
			if(temp.data.getGen().equals("F"))
				System.out.println(temp.data);
			temp = temp.next;
		}
	}
	public void displayMale() {
		Node temp=head;
		if(head==null) {
			System.out.println("list is empty");
		}
		while(temp!=null) {
			if(temp.data.getGen().equals("M"));
				System.out.println(temp.data);
				temp=temp.next;
		}
	}
	
	public void displayRev() {
		Node temp=head;
		reversed(temp);
	}

	private void reversed(Node temp) {
		// TODO Auto-generated method stub
		Node tem = temp;
		Node trav = temp.next;
		if(trav!=null) {
			reversed(trav);
			if(trav.next==null) {
				System.out.println(temp.next.data);
			}
			System.out.println(tem.data);
		}
	}
	
	public void removeAll() {
		if(head!=null) {
			remove();
			removeAll();
		}
		else {
			tail=null;
		}
	}
}
