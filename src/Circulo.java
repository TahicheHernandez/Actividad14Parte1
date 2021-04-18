
/**
 *
 * @author tahic
 */
public class Circulo extends Punto {

    /**
     *Define el radio del círculo.
     */
    protected float radio;
    
    /**
     *Constructor que inicializa un objeto de la clase según el radio y coordenadas indicados
     * @param radio Variable que recoge radio del círculo.
     * @param centroX Variable que recoge la coordenada X del centro del círculo.
     * @param centroY Variable que recoge la coordenada Y del centro del círculo.
     */
    public Circulo(float radio, float centroX, float centroY){
        super(centroX, centroY);
        this.radio = radio;
    }

    /**
     *Get que devuelve radio del círculo
     * @return radio del círculo
     */ 
    public float getRadio(){
        return radio;
        
    }

    /**
     *Set para establecer radio del círculo.
     * @param radio recoger el radio del círculo.
     */
    public void setRadio(float radio){
        this.radio = radio;
    }
}


