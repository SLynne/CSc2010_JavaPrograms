public class MyTA {
	
	public static void verse1(){
		System.out.println("I once wrote a program that wouldn't compile");
		refrain();
	}
	
	public static void verse2(){
		System.out.println("My program did nothing");
		System.out.println("So I started typing");
		refrain2();
	}
	
	public static void verse3(){
		System.out.println("\"Parse error,\" cried the compiler");
		System.out.println("Luckily I'm such a code baller.");
		refrain3();
	}
	
	public static void verse4(){
		System.out.println("Now the compiler wanted an identifier");
		System.out.println("And I thought the situation was getting dire.");
		refrain4();
	}
	
	public static void verse5(){
		System.out.println("Java complained it expected an enum");
		System.out.println("Boy, these computers really are dumb!");
		System.out.println("I added a public class and called it Scum,");
		refrain4();
	}
	
	public static void refrain(){
		System.out.println("I don't know why it wouldn't compile,");
		System.out.println("My TA just smiled.");
		System.out.println();
	}
	
	public static void refrain2(){
		System.out.println("I added System.out.println(\"I <3 coding\"),");
		refrain();
	}
	
	public static void refrain3(){
		System.out.println("I added a backslash to escape the quotes,");
		refrain2();
	}
	
	public static void refrain4(){
		System.out.println("I added a main method with its String[] args,");
		refrain3();
	}	

	public static void main(String[] args){
		verse1();
		verse2();
		verse3();
		verse4();
		verse5();
	}

}
