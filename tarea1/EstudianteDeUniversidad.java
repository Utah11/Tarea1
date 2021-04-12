
public class EstudianteDeUniversidad 
{
    private String id;
    private String nombre;
    private String universidad;
    private String carrera; 
    /*método constructor*/

    public EstudianteDeUniversidad(String id, String nombre, String universidad, String carrera){
        this.id = id;
        this.nombre = nombre;
        this.universidad = universidad;
        this.carrera = carrera;
    }

    /*método*/
    public String Darnombre(){
        String DarNombre;

        nombre = "hola mi nombre es" + nombre + "y estudio en la universidad de" + universidad;

        return nombre;
    }

    public String PedirId(){
        String PedirId;
        id = "¿cuál es tu id?" + id +"¿y que carrera estas estudiando?" + carrera ;
        return id;
    }

    /*set id*/
    public void setId(String id){
        this.id = id;
    }

    public String getId(){
        return id;
    }   
    /*set nombre*/
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return nombre;
    }    
    /*set universidad*/
    public void setUniversidad(){
        this.universidad = universidad;
    } 
    public String getUniversidad(){
        return universidad;
    }
    /*set carrera*/
    public void setCarrera(String carrera){
        this.carrera = carrera;
    }
    public String getCarrera(){
        return carrera;
    }
}
