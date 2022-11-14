public class Stack {
    private Node head;

    public void setHead(Node head) {
        this.head = head;
    }

    public void push(int value) {
        if (head == null) {
            head = new Node(value, null);
        } else {
            head = new Node(value, head);
        }
    }

    public Integer pop() {
        if (head == null) {
            return null;
        } else {
            int value = head.getValue();
            head = head.getPrev();
            return value;
        }
    }


    public void printMe() {
        if (head == null) {
            System.out.println("EMPTY");
        } else {
            Node node = head;
            while (node != null) {
                System.out.print(node.getValue());
                if (node.getPrev() != null) {
                    System.out.print("->");
                }
                node = node.getPrev();
            }
            System.out.println();
        }
    }

    public Stack reverse() {
        if (head == null) {
            return this;
        }
        Stack reversedStack = this;
        Node newHead = reverseHead(head).getHead();
        Node newTail = reverseHead(head).getTail();
        reversedStack.setHead(newHead);
        return reversedStack;
    }

    public ReverseHeadReturnValue reverseHead(Node node) {
        Node newNode = new Node(node.getValue());
        ReverseHeadReturnValue reverseHeadReturnValue = new ReverseHeadReturnValue(null, null);
        if (node.getPrev() == null) {
            reverseHeadReturnValue.setHead(newNode);
            reverseHeadReturnValue.setTail(newNode);
            return reverseHeadReturnValue;
        } else {
            Node head = reverseHead(node.getPrev()).getHead();
            Node tail = reverseHead(node.getPrev()).getTail();
            tail.setPrev(newNode);
            //headBack(head, newNode);
            reverseHeadReturnValue.setHead(head);
            reverseHeadReturnValue.setTail(newNode);
            return reverseHeadReturnValue;
        }

    }

//    public Node headBack(Node head, Node newNode) {
//        if (head.getPrev() == null) {
//            head.setPrev(newNode);
//        } else {
//            headBack(head.getPrev(), newNode);
//        }
//        return head;
//    }
}
