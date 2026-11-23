public class Mylinkedlist{
    // Membuat Node sebagai tempat untuk menyimpan data
    static class Node {
        int data;
        Node next;
    }

    //Membuat head , tail dan size
    Node head = null;
    Node tail = null;
    int size = 0;

    //menambahkan nilai di awal
    void addFirst(int data) {
        Node node = new Node();
        node.data = data;
        node.next = head;
        head = node;
        if (tail == null) {
            tail = node;
        }

        size++;
    }

    // menambahkan nilai diakhir 
    void addLast(int data)  {
        Node node = new Node();
        node.data = data;
        node.next = null;
        if ( tail == null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            tail = node;
        }

        size++;
    }

    //menampilkan seluruh hasil
    void print() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + "->");
            current = current.next;
        }

        System.out.println("null (size " + size + " )");
    }

    //menghapus node linked list
    void remove(int value) {
        Node current = head;
        Node previous = null;

        while (current != null) {
            if (current.data == value) {
                if (previous == null) {
                    head = current.next;       
                } else {
                    previous.next = current.next;   
                }
                if (current == tail) {
                    tail = previous;           
                }
                size--;
                return;
            }
            
            previous = current;
            current = current.next;
        }
    }

    public static void main(String[] args) {
        Mylinkedlist linkedlist = new Mylinkedlist();

        linkedlist.addFirst(10);
        linkedlist.addFirst(5);
        linkedlist.addLast(15);
        linkedlist.addLast(20);
        linkedlist.print();
        linkedlist.remove(5);
        linkedlist.print();
        System.out.println(linkedlist.size);
        
    }
}
