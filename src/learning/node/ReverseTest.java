package learning.node;

/**
 * Reverse sub-array
 * @author MRH
 *
 */
public class ReverseTest {

	public static void main(String[] args) {
		Node preNode = new Node(0);
		for (int i = 0; i < 10; i++) {
			int num = (int) (Math.random() * 100 % 100);
			Node node = new Node(num);
			node.next = preNode.next;
			preNode.next = node;
		}
		Print(preNode);
		Reverse(preNode, 4, 8);
		Print(preNode);
	}

	// 1,2,3,4,5,6,7,8,9,10
	private static void Reverse(Node pHead, int from, int to) {
		Node pCur = pHead.next;// µÚÒ»¸ö
		int i;
		for (i = 0; i < from - 1; i++) {
			pHead = pCur;
			pCur = pCur.next;
		}
		Node pPre = pCur;
		pCur = pCur.next;
		to--;
		Node pNext;
		for (; i < to; i++) {
//			pNext = pCur.next;
//			pCur.next = pHead.next;
//			pHead.next = pCur;
//			pPre.next = pNext;
//			pCur = pNext;
			
			pNext = pCur.next;
			pCur.next = pHead.next;
			pHead.next = pCur;
			pPre.next = pNext;
			pCur = pNext;
		}

	}

	private static void Print(Node preNode) {
		Node node = preNode.next;
		
		while (node != null) {
			System.out.print(node.value + "->");
			node = node.next;
		}
		System.out.println();
	}

}

class Node {
	int value;
	Node next;

	Node(int value) {
		this.value = value;
	}
}
