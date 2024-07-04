import java.util.Scanner;

public class Main {
  static void instrucciones(){
    System.out.println("1. Insertar");
    System.out.println("2. Buscar");
    System.out.println("3. Eliminar");
    System.out.println("4. Mostrar");
    System.out.println("5. Salir");
  }
  public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    TablaDispEnlazada tabla = new TablaDispEnlazada();
    int opcion=0;
    System.out.println("Tabla hash enlazada Tipo socio");
    while(opcion!=5){
      System.out.println("Ingrese una opcion: ");
      instrucciones();
      opcion=leer.nextInt();
      switch(opcion){
        case 1:
          //insertar
          System.out.println("Ingrese el codigo: ");
          int codigo = leer.nextInt();
          while(codigo<101 || codigo>1999){
            System.out.println("ERROR:Codigo invalido, ingrese el codigo(rango 101-1999): ");
            codigo = leer.nextInt();
          }
          
          System.out.println("Ingrese el nombre: ");
          String nombre = leer.next();
          
          System.out.println("Ingrese la edad: ");
          int edad = leer.nextInt();
          if(edad<18 || edad>80){
            System.out.println("Lo lamentamos..\nSolo se admiten socios mayores a 18 años y menores a 80 años...");
            break;
          }
          
          System.out.println("Ingrese el dia: ");
          int dia = leer.nextInt();
          while(dia<1 || dia>31){
            System.out.println("ERROR:Dia invalido, ingrese el dia: ");
            dia = leer.nextInt();
          }
          
          System.out.println("Ingrese el mes: ");
          int mes = leer.nextInt();
          while(mes<1 || mes>12){
            System.out.println("ERROR:Mes invalido, ingrese el mes: ");
            mes = leer.nextInt();
          }
         
          System.out.println("Ingrese el anio: ");
          int anio = leer.nextInt();
          while(anio<1944 || anio>2024){
            System.out.println("ERROR:Anio invalido, ingrese el anio: ");
            anio = leer.nextInt();
          }
          
          TipoSocio s = new TipoSocio(codigo, nombre, edad, dia,mes,anio);
          tabla.insertar(s);
          
          break;
        case 2:
          //buscar
          System.out.println("Ingrese el codigo: ");
          codigo = leer.nextInt();
          
          Elementos e = tabla.buscar(codigo);
          if(e!=null){
            System.out.println(e.getSocio().toString());
          }else{
            System.out.println("No se encontro el socio");
          }
          
          break;
        case 3:
          //eliminar
          System.out.println("Ingrese el codigo: ");
          codigo = leer.nextInt();
          tabla.eliminar(codigo);
          
          break;
        case 4:
          //mostrar
          tabla.mostrar();
          
          break;
        case 5:
          //salir
          System.out.println("Saliendo...");
          break;
      }
    }
  }
}