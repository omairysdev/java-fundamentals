
public class SampleClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SampleClass sc, scA, scB;
		
		
		sc = new SampleClass();
		scA = new SampleClassA();
		scB = new SampleClassB();
		
		System.out.println("Hash is: " +sc.getHash() +"," + scA.getHash()+","+scB.getHash());

	}
	
	public int getHash(){
		return 111111;
	}

}
