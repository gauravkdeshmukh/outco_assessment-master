/**
 *
 * Problem: Doubly Linked List
 *
 * Prompt: Create a Doubly Linked List class/constructor
 * Name it DoublyLinkedList (java/js) or Doubly_Linked_List(rb/py)
 *
 * Part 1: Create a Node class for your Doubly Linked List
 *         Your node class will take an integer value and 
 *         output an object with the following properties: 
 *
 *         node.value: input value
 *         node.next: a pointer to the next node (initially null/nil)
 *         node.previous: a pointer to the previous node (initially null/nil)
 *
 *         Example: {value: 1, next: null, previous: null}
 *
 * Part 2: Create the Doubly Linked List class. 
 *         It should contain the following properties: 
 *
 *         head: pointer to the head node
 *         tail: pointer to the tail node
 *         length: number of nodes in the Doubly Linked List
 *
 *         The Doubly Linked List should also contain the 
 *         following properties: 
 *
 *         addToTail: function that adds a node behind the tail
 *
 *         addToHead: function that adds a node prior to the head
 *
 *         removeFromTail: function that removes the tail node and returns it
 *
 *         removeFromHead: function that removes the head node and returns it
 * 
 */


public class doublyLinkedList {
	  Node head;
	  Node tail;
	  int length=0;
	  
	   doublyLinkedList(Node node){
		if(this.head==null){
			this.head = node;
			this.tail = node;
			this.head.next = this.tail;
			this.tail.previous=this.head;
			this.head.previous = null;
			this.tail.next=null;
			
		}
		this.length += 1;
	   }
	   
	   private void addToHead(Node node) {
			// TODO Auto-generated method stub
			node.previous=head;
			node.next = head.next;
			this.head.next = node;
		}
	   
	   private void addToTail(Node node) {
			// TODO Auto-generated method stub
			node.previous=this.tail;
			this.tail.next = node;
			node.next = null;
			this.tail = node;
		}
	  
	   private Node removeFromTail(){
		   Node node = this.tail;
		   Node temp = node.previous;
		   temp.next = null;
		   node.previous = null;
		   this.tail = temp;
		   return node;
	   }
	   
	   private Node removeFromHead(){
		   Node node = this.head;
		   Node temp = node.next;
		   temp.previous = null;
		   node.next = null;
		   this.head = temp;
		   return node;
	   }
	   
  public static void main(String args[]) {
	  Node n1 = new Node(1);
	  Node n2 = new Node(2);
	  Node n3 = new Node(3);
	  Node n4 = new Node(4);
	  Node n5 = new Node(5);
	  doublyLinkedList dbl = new doublyLinkedList(n1);
	  dbl.addToHead(n2);
	  dbl.addToTail(n3);
	  dbl.addToTail(n4);
	  dbl.addToHead(n5);
	  dbl.removeFromTail();
	  dbl.removeFromHead();
  }


}

class Node {
    int value;
    Node next;
    Node previous;
    Node(int val){
    	this.value = val;
    	this.next = null;
    	this.previous = null;
    }
}

//class DoublyLinkedList {
  // your work here
 
//}


