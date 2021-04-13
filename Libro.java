
//este clase "sirve" para definir los datos de tu propio libro
//al inspeccionarlo una vez creado el objeto
//donde podes dar el nombre,autor,año de salida y el precio
//Mauricio Apaza Callapa
public class Libro
{
    private String nombre;
    private String autor;
    private int año;
    private int precio;
    
    Libro(String n, String a, int añ, int p){
    this.nombre = n;
    this.autor = a;
    this.año = añ;
    this.precio = p;
    }
    String getNombre(){
    return nombre;
    }
    void setNombre(String n){
    this.nombre=nombre;
    }
    String getAutor(){
    return autor;
    }
    void setAutor(String a){
    this.autor=autor;
    }
    int getAño(){
    return año;
    }
    void setAño(int añ){
    this.año=año;
    }
    int getPrecio(){
    return precio;
    }
    void setPrecio(){
    this.precio=precio;
    }
  
    
}
