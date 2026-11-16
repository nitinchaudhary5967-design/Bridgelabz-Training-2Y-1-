package LinkedList.Basic;

public class BasicLinkedList {
    static void main(String[] args) {
        Node a=new Node(5);
        Node b=new Node(6);
        Node c=new Node(7);
        Node d=new Node(8);
        Node e=new Node(9);
        System.out.println("Ttick 1");
        System.out.print(a.data+" --> ");
        System.out.print(b.data+" --> ");
        System.out.print(c.data+" --> ");
        System.out.print(d.data+" --> ");
        System.out.println(e.data+" --> ");
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        System.out.println("Trick 2");
        System.out.print(a.data+" -> ");
        System.out.print(a.next.data+" -> ");
        System.out.print(a.next.next.data+" -> ");
        System.out.print(a.next.next.next.data+" -> ");
        System.out.print(a.next.next.next.next.data+" -> ");
        System.out.print(a.next.next.next.next.data+" -> ");
        System.out.print(a.next.next.next.next.data+" -> ");
        System.out.println();
        System.out.println("Trick 3 for loop");
        Node temp1=a;
        for(int i=0;i<5;i++){
            System.out.print(temp1.data+" --> ");
            temp1=temp1.next;

        }
        System.out.println();

        System.out.println("Trick 4 while loop");
        Node temp2=a;
        while(temp2!=null){
            System.out.print(temp2.data+" --> ");
            temp2=temp2.next;
        }
        System.out.println();
        System.out.println("Trick 5 Method ");
        display(a);
        System.out.println();
        System.out.println("Trick 6");      //Using Recursion
        recursiveLinkedList(a);
    }
    public static void display(Node head){
        while(head!=null){
            System.out.print(head.data+" --> ");
            head=head.next;
        }
    }
    public static void recursiveLinkedList(Node head){
        if(head==null){
            return;
        }
        System.out.print(head.data+" --> ");
        head=head.next;
        recursiveLinkedList(head);

    }
}
