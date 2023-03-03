/*  Coded by Caroline Eri Sato Ushirobira - IBM Software Developer, March 2023.
    13. Insert a node at a specific position in a linked list

*/

static Node insertNodeAtPosition(Node head, int data, int position) {

    Node newNode = new Node(data);
    Node currentNode = head;
    
    int index = 0;

    while (index < position -1) {
        currentNode = currentNode.next;
        index++;
    }

    newNode.next = currentNode.next;
    currentNode.next = newNode;

    return head;
}
