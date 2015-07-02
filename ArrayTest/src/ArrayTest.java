
public class ArrayTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] array2d = new int[2][3];
		
		System.out.println("Cargando Data.");
		for(int x= 0; x<array2d.length; x++){
		
			for(int y= 0; y<array2d.length; y++){
				System.out.println("x= "+ x);
				System.out.println("y= "+ y);
				//
			}
		}
		System.out.println("Modificando Data.");
		for(int x= 0; x<array2d.length; x++){
		
			for(int y= 0; y<array2d.length; y++){
				System.out.println("x= "+ x);
				System.out.println("y= "+ y);
				//
			}
		}
		
		try{
			throw new RuntimeException();
		}catch(RuntimeException e){
			System.out.println("Entro"+e);
		}
		finally{
			System.out.println("entro...");
		}
		

	}

}
