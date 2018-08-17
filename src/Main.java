public class Main {


    static public class Node{
        int data;
        Node next;
        Node prev;
        Node(int d){
            data=d;
            next=null;
            prev=null;
        }
    }

    public static void main(String[] args) {
        Node head;
        Node a = head = new Node(0);
        Node temp;


        //fill linked list from integers 0-10

        for(int i=1;i<10;i++){
            a.next = new Node(i);
            temp = a;
            a=a.next;
            a.prev=temp;
        }


        //print out first 10 digits
        System.out.println("Print out Linked List in Forward Order");
        printLinkedList(head);


        //**Iterative code to reverse a linked list**//
//        Node next=null;
//        Node prev=null;
//        Node current=head;
//
//        while(current!=null){
//            next = current.next;
//            current.next = prev;
//            prev = current;
//            current=next;
//        }
//
//        head=prev;


        //**End Iterative Reversal of a Linked List**//

        //**Recursive Reversal of Linked List**//
        System.out.println("Reversed List from Recursion");
        head = recursiveReverse(head);
        printLinkedList(head);

        //print out 10 digits in recursivePrint
        System.out.println("Print out Linked List in Reverse Order(From Iteration)");
//        printLinkedList(head);
        recursivePrint(head);

        //** Printing with recursion **//
//        recursivePrint(head);


    }

    //function for list print with recursion
    static void recursivePrint(Node h){
       if(h==null){
           return;
       }

       //Place print here to print out forward Linked List
//        System.out.println(h.data);
       recursivePrint(h.next);
       //Place print here to print out Linked List in Reverse
       System.out.println(h.data);


    }

    //recursive reversal of Linked List
    static public Node recursiveReverse(Node head){
        if(head==null || head.next == null){
            return head;
        }

        Node p = recursiveReverse(head.next);
        head.next.next = head;
        head.next=null;
        return p;
    }

    static public void printLinkedList(Node head){
        int count = 0;
        while(head!=null){

            if(count == 0){
                System.out.print(head.data + "->");
            }else if(head.next==null){
                System.out.print(head.data);
            } else{
                System.out.print(head.data + "->");

            }
            count++;
            head=head.next;
        }
        System.out.println();
    }

}
