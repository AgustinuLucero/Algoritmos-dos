class Elementos{
  TipoSocio socio;
  Elementos siguiente;
  
  public Elementos(TipoSocio s){
    socio=s;
    siguiente=null;
  }
  
  public TipoSocio getSocio(){
    return socio;
  }
  
}