class TipoSocio{
  class FECHA{
    int dia;
    int mes;
    int anio;
    
    FECHA(int dia, int mes, int anio){
      this.dia=dia;
      this.mes=mes;
      this.anio=anio;
    }
    public String toString(){
      return dia+"/"+mes+"/"+anio;
    }
  }
  
  int codigo;
  private String nombre;
  private int edad;
  FECHA f;
  
  public TipoSocio(int codigo, String nombre, int edad, int dia, int mes,int anio){
    this.codigo=codigo;
    this.nombre=nombre;
    this.edad=edad;
    this.f=new FECHA(dia, mes, anio);
  }
  
  public int getCodigo(){
    return codigo;
  }
  
}