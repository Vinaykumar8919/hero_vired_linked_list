class Node{
    public Object item;
    public Node next;
}


public class linkedListImp {
    private int size =  0;
    private Node head;
    public linkedListImp() {// constructor
        this.size = 0;
        this.head=null;
    }


    public void insertingNode(String i) {
        Node node = new Node();
        node.item = i;
        Node current=this.head;

        if(this.head==null) {
            this.head=node;
            this.head.next=null;
            this.size=1;
            System.out.println(this.head.toString());
        } else {
            while(current.next!=null) {
                current=current.next;
            }
            current.next=node;
            node.next=null;
            this.size+=1;
        }
    }
    public void addAtStarting(String i) {
        Node n = new Node();
        n.item = i;
        n.next = this.head;
        this.head = n;
    }

    public void addAtMiddle(String i,int pos)
	{
		Node node=new Node();
		Node current=this.head;
		if(this.head!=null && pos<=this.size)
		{
			for(int j=0;j<pos;j++) {
				current=current.next;
			}
			node.item=i;
			node.next=current.next;
			current.next=node;
			this.size+=1;
		}
		else
		{
			System.out.println("position is greater than size");
		}
	}

    public static void main(String[] args) {
        

    }

}