public class Main {
    public static void main(String[] args) {
        Stacks<Integer> stack = new Stacks<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Çıkarılan eleman: " + stack.pop());

        int topElement = stack.peek();
        System.out.println("En üstteki eleman: " + topElement);

        System.out.println("Stack boyutu: " + stack.size());
        System.out.println("Stack boş mu? " + stack.isEmpty());
    }
}
