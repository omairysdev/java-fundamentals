
public class Comparar {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//StringBuilder sb = new StringBuilder();
		StringBuffer sb = new StringBuffer();
		String h1= "HolaMundo";
		sb.append("Hola").append("Mundo");
		if (h1==sb.toString()){
			System.out.println("Son iguales");
		}
		if (h1.equals(sb.toString())){
			System.out.println("Son realmente iguales");
		}

	}

}
