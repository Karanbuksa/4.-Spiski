public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.printMe();
        System.out.println("Добавим 0");
        stack.push(0);
        stack.printMe();
        System.out.println("Добавим 1");
        stack.push(1);
        stack.printMe();
        System.out.println("Добавим 2");
        stack.push(2);
        stack.printMe();
        System.out.println("Добавим 3");
        stack.push(3);
        stack.printMe();
        System.out.println("Добавим 4");
        stack.push(4);
        stack.printMe();
        System.out.println("Добавим 5");
        stack.push(5);
        stack.printMe();
        System.out.println("Снимаем со стека");
        stack.pop();
        stack.printMe();
        System.out.println("Снимаем со стека");
        stack.pop();
        stack.printMe();
        System.out.println("Ревёрс");
        stack = stack.reverse();
        stack.printMe();
        System.out.println("Снимаем со стека");
        stack.pop();
        stack.printMe();
        System.out.println("Снимаем со стека");
        stack.pop();
        stack.printMe();
    }
}