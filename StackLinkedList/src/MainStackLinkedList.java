class Main {
  public static void main(String[] args) {
    StackLinkedList newStack = new StackLinkedList();
    newStack.push(1);
    newStack.push(2);
    newStack.push(3);
    System.out.println(newStack.peek());
    System.out.println(newStack.pop());
    System.out.println(newStack.isEmpty());
    newStack.deleteStack();


  }
}
