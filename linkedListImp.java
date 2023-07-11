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

    public static void main(String[] args) {
        
    }

}