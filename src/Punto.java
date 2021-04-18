
/**
 *
 * @author tahic
 */
public class Punto {

    /**
     *Atributo que define la coordenada X del punto.
     */
    protected float centroX;

    /**
     *Atributo que define la coordenada Y del punto.
     */
    protected float centroY;
    
    /**
     * Constructor que inicializa un objeto de la clase según las coordenadas.
     * @param centroX Variable que recoge la coordenada X del punto.
     * @param centroY Variable que recoge la coordenada Y del punto.
     */
    public Punto(float centroX, float centroY){
        this.centroX = centroX;
        this.centroY = centroY;
    }

    /**
     *Get que devuelve coordenada X del punto
     * @return coordenada X 
     */
    public float getCentroX(){
        return centroX;
    }

    /**
     *Set que establece coordenada X del punto.
     * @param centroX variable que recoge la coordenada X del punto.
     */
    public void setCentroX(float centroX){
        this.centroX = centroX;
    }

    /**
     *Get que devuelve coordenada Y
     * @return coordenada Y del punto
     */
    public float getCentroY(){
        return centroY;
    }

    /**
     *Set que establece coordenada Y.
     * @param centroY variable que recoge la coordenada Y
     */
    public void setCentroY(float centroY){
        this.centroY = centroY;
    }
}

