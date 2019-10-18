package sample;
class SNode{
	String data;
	SNode top = null;
	SNode next;
	public SNode(String data) {
		this.data=data;
    }
	public SNode() {
	}
	void push(String data) {
		//System.out.println("In push "+data);
		SNode temp = new SNode(data);
		temp.next=top;
		top=temp;
		//System.out.println(top.data);
	}
	String print() {
		String result=" ";
		SNode itr = top;
		//System.out.println(top.data);
		while(itr!=null) {
			System.out.println(itr.data);
			result=result+" "+itr.data;
			itr=itr.next;
		}
		return result;
	}
}
public class reverse {
	public static void main(String[] args) {
		SNode node = new SNode();
		String str = "My name is anudeep";
		String inp[] = str.split(" ");
		for(int i=0;i<inp.length;i++) {
			node.push(inp[i]);
		}
		String result = node.print();
		System.out.print(result);
	}

}
