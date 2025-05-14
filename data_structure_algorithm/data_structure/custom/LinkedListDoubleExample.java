package data_structure_algorithm.data_structure.custom;

public class LinkedListDoubleExample {
    LinkedListDoubleNode head;

    public void print(){
        LinkedListDoubleNode temp = head;

        while(temp != null){
            if(temp.prev != null){
                System.out.print("("+temp.prev.data+")"+" <-> ");
            }
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void insertAtEnd(int data){
        if(head == null){
            head = new LinkedListDoubleNode(data);
            return;
        }

        LinkedListDoubleNode temp = head;

        while (temp.next != null){
            temp = temp.next;
        }

        LinkedListDoubleNode newNode = new LinkedListDoubleNode(data);
        temp.next = newNode;
        newNode.prev = temp;
    }

    public void insertAtBegin(int data){
        if(head == null){
            head = new LinkedListDoubleNode(data);
            return;
        }

        LinkedListDoubleNode newNode = new LinkedListDoubleNode(data);

        head.prev = newNode;
        newNode.next = head;
        head = newNode;
    }

    public void insertAt(int index, int data){
        if(head == null){
            System.out.println("Index Not Found!");
            return;
        }

        if(index < 0){
            System.out.println("Invalid Index!");
            return;
        }

        LinkedListDoubleNode newNode = new LinkedListDoubleNode(data);

        if(index == 0){
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
            return;
        }

        LinkedListDoubleNode temp = head;

        int i = 0;

        while(temp != null && i<index-1){
            temp = temp.next;
            i++;
        }

        if(temp == null){
            System.out.println(index+" - Index Out Of Bound!");
            return;
        }

        newNode.next = temp.next;
        if (temp.next != null) {
            temp.next.prev = newNode;
        }
        temp.next = newNode;
        newNode.prev = temp;
    }

    public void findIndex(int data){
        if(head == null){
            System.out.println("List is Empty!");
            return;
        }

        if(head.data == data){
            System.out.println(data+" - Index Number: "+0);
            return;
        }

        LinkedListDoubleNode temp = head;

        int count = 0;

        while(temp != null && temp.data != data){
            temp = temp.next;
            count++;
        }

        if(temp == null){
            System.out.println(data+" - Data Not Found!");
            return;
        }

        System.out.println(data+" - Index Number: "+count);
    }

    public void deleteByIndex(int index){
        if(head == null){
            System.out.println("List is Empty!");
            return;
        }

        if (index < 0) {
            System.out.println("Invalid Index!");
            return;
        }

        if(index == 0){
            head = head.next;
            if (head != null) {
                head.prev = null;
            }
            return;
        }

        LinkedListDoubleNode temp = head;

        int i = 0;

        while(temp != null && i<index-1){
            temp = temp.next;
            i++;
        }

        if(temp == null || temp.next == null){
            System.out.println(index + " - Index is out of Bound!");
            return;
        }

        temp.next = temp.next.next;
        if (temp.next != null) {
            temp.next.prev = temp;
        }
    }

    public void deleteByData(int data){
        if(head == null){
            System.out.println("List is Empty!");
            return;
        }

        if(head.data == data){
            head = head.next;
            if (head != null) {
                head.prev = null;
            }
            return;
        }

        LinkedListDoubleNode temp = head;

        while(temp.next != null && temp.next.data != data){
            temp = temp.next;
        }

        if (temp.next == null) {
            System.out.println(data+" - Data Not Found!");
            return;
        }

        temp.next = temp.next.next;
        if(temp.next != null){
            temp.next.prev = temp;
        }
    }


    public static void main(String[] arg){
        LinkedListDoubleExample linkedlist = new LinkedListDoubleExample();
        linkedlist.print();
        linkedlist.insertAtEnd(10);
        linkedlist.print();
        linkedlist.insertAtEnd(20);
        linkedlist.print();
        linkedlist.insertAtBegin(30);
        linkedlist.print();
        linkedlist.insertAt(0,40);
        linkedlist.print();
        linkedlist.insertAt(2,50);
        linkedlist.print();
        linkedlist.findIndex(50);
        linkedlist.findIndex(30);
        linkedlist.findIndex(100);
        linkedlist.print();
        linkedlist.deleteByIndex(2);
        linkedlist.print();
        linkedlist.deleteByData(10);
        linkedlist.print();
        linkedlist.deleteByIndex(3);
        linkedlist.print();
        linkedlist.deleteByIndex(2);
        linkedlist.print();
        linkedlist.deleteByData(30);
        linkedlist.print();
    }
}

class LinkedListDoubleNode {
    int data;
    LinkedListDoubleNode prev;
    LinkedListDoubleNode next;

    LinkedListDoubleNode(int data){
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}