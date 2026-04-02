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

  public static void main(String[] args) {
    link list=new link();
    list.addFirst(data:"2");
    list.addFirst(data:"1");
    list.show();
  }

}
