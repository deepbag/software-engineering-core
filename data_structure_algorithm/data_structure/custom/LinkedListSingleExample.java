package data_structure_algorithm.data_structure.custom;

public class LinkedListSingleExample {
    LinkedListSingleNode head;

    public void print(){
        LinkedListSingleNode temp = head;

        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void insertAtEnd(int data){
        if(head == null){
            head = new LinkedListSingleNode(data);
            return;
        }

        LinkedListSingleNode temp = head;

        while(temp.next != null){
            temp = temp.next;
        }

        temp.next = new LinkedListSingleNode(data);
    }

    public void insertAtBegin(int data){
        if(head == null){
            head = new LinkedListSingleNode(data);
            return;
        }

        LinkedListSingleNode temp = head;
        head = new LinkedListSingleNode(data);
        head.next = temp;
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

        LinkedListSingleNode node = new LinkedListSingleNode(data);

        if(index == 0){
            node.next = head;
            head = node;
            return;
        }

        LinkedListSingleNode temp = head;

        int i = 0;
        while(temp != null && i < index-1){
            temp = temp.next;
            i++;
        }

        if(temp == null){
            System.out.println(index+" - Index Out Of Bound!");
            return;
        }

        node.next = temp.next;
        temp.next = node;
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
            return;
        }

        LinkedListSingleNode temp = head;

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
    }

    public void deleteByData(int data){
        if(head == null){
            System.out.println("List is Empty!");
            return;
        }

        if(head.data == data){
            head = head.next;
            return;
        }

        LinkedListSingleNode temp = head;

        while(temp.next != null && temp.next.data != data){
            temp = temp.next;
        }

        if (temp.next == null) {
            System.out.println(data+" - Data Not Found!");
            return;
        }

        temp.next = temp.next.next;
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

        LinkedListSingleNode temp = head;

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

    public static void main(String[] arg){
        LinkedListSingleExample linkedList = new LinkedListSingleExample();
        linkedList.print();
        linkedList.insertAtEnd(10);
        linkedList.print();
        linkedList.insertAtEnd(20);
        linkedList.print();
        linkedList.insertAtEnd(30);
        linkedList.print();
        linkedList.insertAtBegin(40);
        linkedList.print();
        linkedList.insertAtBegin(50);
        linkedList.print();
        linkedList.insertAt(2,60);
        linkedList.print();
        linkedList.insertAt(8,70);
        linkedList.print();
        linkedList.insertAt(0,70);
        linkedList.print();
        linkedList.deleteByIndex(0);
        linkedList.print();
        linkedList.deleteByIndex(2);
        linkedList.print();
        linkedList.deleteByIndex(4);
        linkedList.print();
        linkedList.deleteByIndex(4);
        linkedList.print();
        linkedList.deleteByData(20);
        linkedList.print();
        linkedList.deleteByData(40);
        linkedList.print();
        linkedList.deleteByData(100);
        linkedList.print();
        linkedList.insertAtBegin(40);
        linkedList.print();
        linkedList.insertAtBegin(90);
        linkedList.print();
        linkedList.findIndex(100);
        linkedList.findIndex(50);
        linkedList.findIndex(10);
    }
}

class LinkedListSingleNode {
    int data;
    LinkedListSingleNode next;

    LinkedListSingleNode(int data){
        this.data = data;
        this.next = null;
    }
}