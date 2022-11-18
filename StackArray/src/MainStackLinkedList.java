class Main {
  public static void main(String[] args) {
    StackArray newStack = new StackArray(10);
    newStack.push(1);
    newStack.push(2);
    newStack.push(3);
    System.out.println("isEmpty? "+newStack.isEmpty());
    System.out.println("isFull"+newStack.isFull());
    System.out.println("peek: "+newStack.peek());

    System.out.println("poped element: "+newStack.pop());

    newStack.deleteStack();


  }
}
