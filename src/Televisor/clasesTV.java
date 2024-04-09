
import java.util.Scanner;

public class ClasesTV {
	public static boolean on_off(boolean a ){
		if(a==true) {
		     System.out.println("Televisor encendido");
		     System.out.println(" -------------\n"
		    		 		+ "|             |\n"
		    		 		+ "|     ON      |\n"
		    		 		+ "|             |\n"
		    		 		+ " ------------- ");
		}else {
		     System.out.println("Televisor apagado");
		     System.out.println(" ------------- \n"
	    		 		+ "|             |\n"
	    		 		+ "|     OFF     |\n"
	    		 		+ "|             |\n"
	    		 		+ " ------------- ");
		}
		return a;
	}

	public static boolean volumen(boolean a, int b){
		if(a==true) {
		    for(int i=0;i>b; i++) {
		    	System.out.print("|");
		    }
		    System.out.println("El volumen se subio hasta "+b);
		}else {
			for(int i=b;i<=0; i--) {
		    	System.out.print("|");
		    }
			System.out.println("El volumen se bajo hasta "+b);
		}
		return a;
	}
	public static void datos(String a, int b) {
		System.out.println("La marca de su televisor es "+a);
		System.out.println("tiene un tamaño de "+b+" pulgadas");
	}
	public static void canal(int a) {
		System.out.println("En este momento esta en el canal "+a);
			System.out.println(" -------------\n"
					         + "|             |\n"
					         + "|     "+a+"     |\n"
					         + "|             |\n"
					         + " ------------- ");
	}
	public static void conexion(String a) {
		System.out.println("En este momento esta conectado en la entrada "+a);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner s = new Scanner(System.in);
		byte dato=0;
		int vol=0;
		tv Tele= new tv(null, null, 0, 0, false, false);
		System.out.println("¿Que marca es el televisor?");
		Tele.setMarca(sc.nextLine());
		System.out.println("¿Que tamaño tiene el televisor?");
		Tele.setTamaño(s.nextInt());
		do {
		System.out.println("¿Quiere encender el televisor?");
		System.out.println("1. On\n2. Off");
		dato=sc.nextByte();
		if(dato==1) {
			Tele.setPower(true);
			on_off(Tele.isPower());
		}else if(dato==2){
			Tele.setPower(false);
			on_off(Tele.isPower());
		}else {
			System.out.println("boton oprimido incorrecto");
		}
		}while(dato!=1 && dato!=2);
		do {
		System.out.println("¿Quiere modificar el volumen?");
		System.out.println("1. Subir\n2. Bajar");
		dato=sc.nextByte();
		if(dato==1) {
			System.out.println("¿cuanto desea subir?");
			vol=s.nextInt();
			Tele.setSonido(true);
			volumen(Tele.isSonido(), vol);
		}else if(dato==2){
			System.out.println("¿cuanto desea bajar?");
			vol=s.nextInt();
			Tele.setSonido(false);
			volumen(Tele.isSonido(), vol);
		}else {
			System.out.println("boton oprimido incorrecto");
		}
		}while(dato!=1 && dato!=2);
		
		System.out.println("¿A que canal quiere pasar?");
		Tele.setCanal(sc.nextInt());
		canal(Tele.getCanal());
		do {
		System.out.println("¿A que entrada lo va a conectar?");
		System.out.println("1. HDM1\n2. Antena\n3. VGA\n4. Video Compuesto\n5. USB");
		dato=sc.nextByte();
		if(dato==1) {
			Tele.setConexion("HDM1");
		}else if(dato==2){
			Tele.setConexion("Antena");
		}else if(dato==3){
			Tele.setConexion("VGA");
		}else if(dato==4){
			Tele.setConexion("Video Compuesto");
		}else if(dato==5){
			Tele.setConexion("USB");		
		}else {
			System.out.println("boton oprimido incorrecto");
		}
		}while(dato!=1 && dato!=2 && dato!=3 && dato!=4 && dato!=5);
		
		datos(Tele.getMarca(),Tele.getTamaño());
		conexion(Tele.getConexion());
		
		
		
		
		
	
	}
}
