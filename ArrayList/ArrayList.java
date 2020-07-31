package list.arraylist.implementation;

public class ArrayList {
  private int size = 0;
  private Object[] elementData = new Object[100];
  
  public boolean addFirst(Object element) {
    return add(0, element);
  }
  public boolean addLast(Object element) {
    elementData[size] = element;
    size++;
    return true;
  }
  public boolean add(int index, Object element) {
    for(int i = size-1; i>=index; i--) {
      elementData[i+1] = elementData[i];
    }
    elementData[index] = element;
    size++;
    return true;
  }
  public String toString() {
    String str = "[";
    for(int i=0; i<size; i++) {
      str += elementData[i];
      if(i<size-1) {
        str +=",";
      }      
    }
    return str + "]";
        
  }

  public Object remove(int index) {
    Object removed = elementData[index];
    for(int i =index+1; i<=size-1; i++) {
      elementData[i-1] = elementData[i];
    }
    size--;
    elementData[size]=null;
    return removed;
  }
  
  public Object removeFirst() {
    return remove(0);
  }
  public Object removeLast() {
    return remove(size-1);
  }
  //배열의 인덱스로 가져온다는 장점
  public Object get(int index) {
    return elementData[index];
  }
  public int size() {
    return size;
  }
  //인자로 전달 된 20이라는 값의 인덱스가 몇번인가.
  public int indexOf(Object o) {
    for(int i = 0; i<size; i++) {
     if(o.equals(elementData[i])) {
       return i;
     }
    }
    return -1;
  }
  //반복작업처리
  public ListIterator listIterator() {
    return new ListIterator();
  }
  
  public class ListIterator{
    private int nextIndex = 0;
    
    public boolean hasNext() {
      return nextIndex < size();
    }   
    public Object next() {
      //Object returnData = elementData[nextIndex];
      //nextIndex++;
      //return returnData;      
        return elementData[nextIndex++];
    }   
    public Object previous() {
      return elementData[--nextIndex];
    }
    public boolean hasPrevious() {
      return nextIndex > 0;
    }
    public void add(Object element) {
      ArrayList.this.add(nextIndex++, element);
    }
    public void remove(Object element) {
      ArrayList.this.remove(nextIndex-1);
      nextIndex--;
    }
    
  }
}
