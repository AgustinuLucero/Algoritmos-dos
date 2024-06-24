import java.util.Scanner;
public class Main {
  //instruccines
  static void instrucciones(){
    System.out.println("1. Insertar");
    System.out.println("2. Buscar");
    System.out.println("3. Eliminar");
    System.out.println("4. Recorridos");
    System.out.println("5. Salir");
  }
  
  public static void main(String[] args) {
    System.out.println("Arbol binario de busqueda");
    Scanner leer = new Scanner(System.in);
    ArbolesdeBusqueda arbol = new ArbolesdeBusqueda();
    int opcion=0,numMatricula;
    String nombre;
    
    while(opcion != 5){
      instrucciones();
      opcion = leer.nextInt();
      try{ 
        switch(opcion){
          case 1:
            System.out.println("Eligio incertar un estudiante...");
            leer.nextLine();
            System.out.println("Ingrese su nombre: ");
            nombre=leer.nextLine();
            System.out.println("Ingrese su numero de matricula: ");
            numMatricula = leer.nextInt();
            Estudiante e = new Estudiante(numMatricula,nombre);
            arbol.insertar(e);
            
            break;
          case 2:
            System.out.println("Eligio buscar un estudiante...");
            System.out.println("Ingrese su numero de matricula: ");
            numMatricula = leer.nextInt();
            Estudiante e1 = new Estudiante(numMatricula,"");
            Nodo encontrado = arbol.buscar(e1);
            
            if(encontrado != null){
              Estudiante estEncontrado = (Estudiante) encontrado.getDato();
              System.out.println("Nombre: " + estEncontrado.getNombre() + " " + estEncontrado.getNumMatricula());
            }else{
              System.out.println("No se encontro el estudiante");
            }
            
            break;
          case 3:
            System.out.println("Eligio eliminar un estudiante");
            System.out.println("Ingrese su numero de matricula: ");
            numMatricula = leer.nextInt();
            Estudiante est = new Estudiante(numMatricula,"");
            arbol.eliminar(est);
            
            break;
          case 4:
            if(!arbol.esVacia()){
              System.out.println("Recorrido en preorden");
              arbol.preorden(arbol.getRaiz());
              
              System.out.println("Recorrido en inorden");
              arbol.inorden(arbol.getRaiz());
              
              System.out.println("Recorrido en postorden");
              arbol.postorden(arbol.getRaiz());
            }else{
              System.out.println("El arbol esta vacio");
            }
            
            break;
          case 5:
            System.out.println("Eligio Salir\nSaliendo....\nGracias por usar el programa!!!");
            
            break;
        }
        
      }catch(Exception e){
        System.out.println("Error");
        
      }
    }
    
  }
}