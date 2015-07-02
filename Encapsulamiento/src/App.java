class App{
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Circle c1 = new Circle(17.4);
		c1.area= Math.PI * c1.getRadius() * c1.getRadius();
		
		System.out.println(c1.area);

	}	
}