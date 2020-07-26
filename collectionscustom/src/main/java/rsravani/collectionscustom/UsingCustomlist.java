package rsravani.collectionscustom;

public class UsingCustomlist {
	public static void main(String args[]) throws Exception
	{
		CustomList<String> l= new CustomList<String>();
		l.add("a");
		l.add("b");
		l.add("d");
		l.add("s");
		l.printlist();
		l.remove(0);
		System.out.println();
		System.out.println("After deleting at index 0:");
		l.printlist();
		System.out.println();
		System.out.println("At index 2 we have '"+l.get(2)+"'");
		//l.remove(6); "Give an index within the list capacity" Exception
		//l.get(5); "Give an index within the list capacity" Exception
	}
}
