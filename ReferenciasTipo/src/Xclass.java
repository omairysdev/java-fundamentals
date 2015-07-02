
public class Xclass implements Zinterface{
	public String toString(){return "I am X";}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Yclass myY= new Yclass();
		Xclass myX=myY;
		Zinterface myZ=myX;
		
		System.out.println(myZ);
		System.out.println(myZ instanceof Zinterface);
	}

}
