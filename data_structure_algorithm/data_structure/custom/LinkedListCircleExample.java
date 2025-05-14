package data_structure_algorithm.data_structure.custom;

public class LinkedListCircleExample {
    LinkedListCircleNode head;

    public void print() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        LinkedListCircleNode temp = head;
        do {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        } while (temp != head);
        System.out.println("(head)");
    }

    public void insertAtEnd(int data){
        LinkedListCircleNode newNode = new LinkedListCircleNode(data);

        if(head == null){
            head = newNode;
            newNode.next = head;
            return;
        }

        LinkedListCircleNode temp = head;

        do{
            temp = temp.next;
        }while (temp != head);

        temp.next = newNode;
        newNode.next = head;
    }

    public void insertAtBegin(int data){
        LinkedListCircleNode newNode = new LinkedListCircleNode(data);

        if (head == null) {
            head = newNode;
            head.next = head;
            return;
        }

        LinkedListCircleNode temp = head;

        while (temp.next != head) {
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.next = head;
        head = newNode;
    }

    public void insertAt(int index, int data){
        if(head == null){
            System.out.println("List is empty");
            return;
        }

        if(index<0){
            System.out.println("Index is not valid");
            return;
        }

        LinkedListCircleNode newNode = new LinkedListCircleNode(data);

        if(index == 0){
            LinkedListCircleNode temp = head;

            while (temp.next != head) {
                temp = temp.next;
            }

            temp.next = newNode;
            newNode.next = head;
            head = newNode;
            return;
        }

        LinkedListCircleNode temp = head;
        int i = 0;

        while (temp.next != head && i<index-1) {
            temp = temp.next;
            i++;
        }

        if (i != index - 1) {
            System.out.println("Index out of bounds");
            return;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void findIndex(int data){
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if(head.data == data){
            System.out.println(data+ " - Index Number is: "+0);
            return;
        }

        LinkedListCircleNode temp = head;
        int index = 0;

        do {
            if (temp.data == data) {
                System.out.println(data + " - Index Number is: " + index);
                return;
            }
            temp = temp.next;
            index++;
        } while (temp != head);

        System.out.println(data + " not found in the list.");

    }

    public void deleteByIndex(int index){
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if(index == 0){
            if(head.next == head){
                head = null;
            }else{
                LinkedListCircleNode temp = head;
                while (temp.next != head) {
                    temp = temp.next;
                }

                temp.next = head.next;
                head = head.next;
            }
            return;
        }

        LinkedListCircleNode temp = head;
        int i = 0;

        while (temp.next != head && i<index-1){
            temp = temp.next;
            i++;
        }

        if(i != index-1){
            System.out.println("Index out of bounds");
            return;
        }

        temp.next = temp.next.next;
    }

    public static void main(String[] arg){
        LinkedListCircleExample linkedlist = new LinkedListCircleExample();
        linkedlist.print();
        linkedlist.insertAtEnd(10);
        linkedlist.print();
        linkedlist.insertAtEnd(20);
        linkedlist.print();
        linkedlist.insertAtBegin(30);
        linkedlist.print();
        linkedlist.insertAt(0, 40);
        linkedlist.print();
        linkedlist.insertAt(2, 50);
        linkedlist.print();
        linkedlist.findIndex(40);
        linkedlist.findIndex(100);
        linkedlist.findIndex(20);
        linkedlist.print();
        linkedlist.deleteByIndex(0);
        linkedlist.print();
        linkedlist.deleteByIndex(2);
        linkedlist.print();

    }
}
class LinkedListCircleNode {
    int data;
    LinkedListCircleNode next;

    LinkedListCircleNode(int data){
        this.data = data;
        this.next = null;
    }
}