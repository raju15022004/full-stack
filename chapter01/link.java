public class link {

  class Node{
    String data;
    Node next;

    Node(String value){
      data=value;
      next=null;
    }
  }

  Node head;

  public void addFirst(String data){
    Node newNode=new Node(data);

    if(head==null){
      head=newNode;
      return;
    }
    newNode.next=head;
    head=newNode;
  }

  public void show(){

    Node temp=head;
    while(temp!=null){
      System.out.print(temp.data + " -> ");
      temp=temp.next;
    }
  }

  public void addLast(String data){
    Node newNode=new Node(data);

    if(head==null){
      head=newNode;
      return;
    }

    Node temp=head;
    while(temp.next!=null){
      temp=temp.next;
    }
    temp.next=newNode;
  }
  public static void main(String[] args) {
    link list=new link();
    list.addFirst("2");
    list.addFirst("1");
    list.addLast(data: "3");
    list.show();
  }

}
