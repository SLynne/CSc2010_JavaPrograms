public class StarFigures {
	
	public static void topStar(){
		System.out.println("*****");
		System.out.println("*****");
		System.out.println(" * * ");
		System.out.println("  *  ");
		System.out.println(" * * ");
	}

	public static void straightStar(){
		System.out.println("*****");
		System.out.println("*****");
	}
	
	public static void dotStar(){
		System.out.println("  *  ");
		System.out.println("  *  ");
		System.out.println("  *  ");
	}
	
	public static void main(String[] args){
		topStar();
		System.out.println();
		topStar();
		straightStar();
		System.out.println();
		dotStar();
		topStar();
	}

}
