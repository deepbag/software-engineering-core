package data_structure_algorithm.data_structure.custom;

public class LinkedListSingleExample {
    LinkedListSingleNode head;

    void insertAtBegin(int data){
        LinkedListSingleNode newNode = new LinkedListSingleNode(data);

        if(head == null){
            head = newNode;
            return;
        }

        LinkedListSingleNode temp = head;
        newNode.next = head;
        head = newNode;
    }

    void insertAtEnd(int data){
        LinkedListSingleNode newNode = new LinkedListSingleNode(data);

        if(head == null){
            head = newNode;
            return;
        }

        LinkedListSingleNode temp = head;

        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
    }

    void insertAt(int index, int data){
        LinkedListSingleNode newNode = new LinkedListSingleNode(data);

        if(head == null){
            head = newNode;
            return;
        }

        if(index == 0){
            newNode.next = head;
            head = newNode;
            return;
        }

        LinkedListSingleNode temp = head;
        for(int i=0;temp != null && i<index-1;i++){
            temp = temp.next;
        }

        if(temp == null){
            System.out.println("Index is out of bound!");
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    void deleteByData(int data){
        if(head == null){
            return;
        }

        if(head.data == data){
            if(head.next != null){
                head = head.next;
            } else{
                head = null;
            }
            return;
        }

        LinkedListSingleNode temp = head;
        while(temp.next != null && temp.next.data != data){
            temp = temp.next;
        }

        if(temp.next == null){
            System.out.println("Data is not exist");
            return;
        }

        temp.next = temp.next.next;
    }

    void deleteByIndex(int index){
        if(head == null){
            return;
        }

        if(index == 0){
            if(head.next != null){
                head = head.next;
            }else{
                head = null;
            }
        }

        LinkedListSingleNode temp = head;
        for(int i=0;temp.next != null && i<index-1;i++){
            temp = temp.next;
        }

        if(temp.next == null){
            System.out.println("Data is not exist");
            return;
        }

        temp.next = temp.next.next;
    }

    void getIndexByData(int data) {
        if (head == null) {
            System.out.println("Not Found!");
            return;
        }

        LinkedListSingleNode temp = head;
        int count = 0;

        while (temp != null) {
            if (temp.data == data) {
                System.out.println("Index Number: " + data + " --> " + count);
                return;
            }
            count++;
            temp = temp.next;
        }

        System.out.println("Not Found: "+data);
    }

    void size(){
        int count = 0;
        LinkedListSingleNode temp = head;
        while(temp != null){
            count++;
            temp = temp.next;
        }

        System.out.println("Total Size: "+count);
    }

    void display(){
        LinkedListSingleNode temp = head;
        while(temp != null){
            System.out.print(temp.data + " >> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] arg){
        LinkedListSingleExample lls = new LinkedListSingleExample();
        lls.display();
        lls.insertAtBegin(10);
        lls.insertAtBegin(20);
        lls.insertAtBegin(30);
        lls.insertAtEnd(40);
        lls.insertAtEnd(50);
        lls.insertAtEnd(60);
        lls.insertAt(2,90);
        lls.deleteByData(10);
        lls.deleteByIndex(3);
        lls.getIndexByData(90);
        lls.getIndexByData(60);
        lls.getIndexByData(100);
        lls.size();
        lls.display();
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