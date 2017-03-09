package programs;

public class CustomLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node lastNode=new Node("Raghul",null);
		Node secondNode=new Node("Jaishri",lastNode);
		Node firstNode=new Node("Krithishya",secondNode);
		System.out.println(secondNode.getData());
		System.out.println(secondNode.getNext().getData());
	}

}
