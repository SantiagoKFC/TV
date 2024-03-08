package Televisor;
public class clasesTV {
	
public boolean on_off(boolean a ){
	if(a==true) {
	     System.out.println("Televisor encendido");
	}else {
	     System.out.println("Televisor apagado");
	}
	return a;
}

public boolean volumen(boolean a, int b){
	if(a==true) {
	    System.out.println("El volumen se subio hasta"+b);
	}else {
		System.out.println("El volumen se bajo hasta"+b);
	}
	return a;
}


}
