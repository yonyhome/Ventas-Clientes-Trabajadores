
import java.util.Scanner;

public class FINAL {
	
        static Scanner scanner = new Scanner(System.in); 
        static int select = -1; 
	static int i, l, k; static int[]cv=new int[100];
        
        
       
        
        
      
	
	public static void main(String[] args) {
                System.out.println("BIENVENIDO");
                System.out.println("          ");
		          System.out.println("por favor registre a sus empleados primero, segun el codigo de cada uno (Opcion 7) ");
		
		while(select != 0){
			
			try{
				System.out.println("Elige opción:\n1.- VENTAS" +
						"\n2.- Registro de cada vendedor\n" +
						"3.- Sueldo a pagar\n" +
						"4.- Visualización de los tres trabajadores que más vendieron y de los 3 trabajadores que menos vendieron.\n" +
                                                "5.- Consultas\n" +
                                                "6.- Ingreso de un vendedor\n" +
                                                "7.- Despido de un vendedor\n" +
						"8.- Salir");
				
				select = Integer.parseInt(scanner.nextLine()); 
	
				
				switch(select){
				case 1: 
                                    
                                    while (i<=8){
                                        for (i=1; i<=8; i++){
                                            System.out.println("escriba el codigo del vendedor");
                                            int c = scanner.nextInt();
                                            System.out.println("escriba el codigo del comprador");
                                            int cc = scanner.nextInt();
                                            System.out.println("escriba el precio del producto");
                                            int np=5;
                                            while (np > 4){
                                            int p= scanner.nextInt();
                                            System.out.println("escriba el numero de productos maximo 4 productos del mismo");
                                            np= scanner.nextInt();
                                            }
                                            
                                            
                                        }
                                    }                                    
					
				case 2: 
                                    
                                case 3: 
					
				case 4: 
					
                                case 5: 
					
				case 6: 
                                    System.out.println(" cuantos vendedores va a ingresar");
                                    int n=scanner.nextInt();
                                    for (i=1 ; i<=n; i++){
                                    System.out.println(" ingrese el codigo del vendedor "+ i );
                                    cv[i]= scanner.nextInt();
                                    }
                                    
                                case 7:    
                                   
				case 8: 
					System.out.println("Adios!");
					break;
				default:
					System.out.println("Número no reconocido");break;
				}
				
				System.out.println("\n"); 
				
			}catch(Exception e){
				System.out.println("Uoop! Error!");
			}
		}

   

        }

    
}


    

