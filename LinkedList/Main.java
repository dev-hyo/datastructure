package list.linkedlist.implementation;

public class Main {
  public static void main (String[] args) {
    LinkedList numbers = new LinkedList();
//    numbers.addFirst(30);
//    numbers.addFirst(20);
//    numbers.addFirst(10);

    numbers.addLast(10);
    numbers.addLast(20);
    numbers.addLast(30);
    numbers.add(2,25);
    LinkedList.ListIterator i = numbers.listIterator();
    i.add(5);
    i.next();
    i.add(15);
    
    //System.out.println(numbers.node(2));
    //System.out.println(numbers.removeFirst());
    //System.out.println(numbers.remove(1));
    //System.out.println(numbers.removeLast());
    System.out.println("size :"+numbers.size());
    System.out.println("get :"+numbers.get(0));
    System.out.println("indexOf :"+ numbers.indexOf(20));
    while(i.hasNext()) {
      System.out.println(i.next());
      if((int)i.next()==20) {
        i.remove();
      }
    }
    System.out.println("------------------------");
    System.out.println(numbers);
  }
}
