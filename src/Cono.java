
/**
 *
 * @author tahic
 */
public class Cono extends Circulo {

    private float altura;

    private String color;
    
    /**
     *Constructor con el que se define las propiedades del Cono.
     * @param altura variable para recoger altura
     * @param color variable para recoger color del cono.
     * @param radio variable que recoge el radio.
     * @param centroX variable que recoge la coordenada X que tenga el centro de la base
     * @param centroY variable que recoge la coordenada Y que tenga el centro de la base.
     */
    public Cono (float altura, String color, float radio, float centroX, float centroY){
        super(radio, centroX, centroY);
        this.altura = altura;
        this.color = color;
    }

    /**
     *Get que devuelve altura del cono
     * @return altura del cono
     */
    public float getAltura(){
        return altura;
    }

    /**
     *Set que establece la altura
     * @param altura 
     */
    public void setAltura(float altura){
        this.altura = altura;
    }

    /**
     *Get que devuelve el color 
     * @return el color
     */
    public String getColor(){
        return color;
    }

    /**
     *Set 
     * @param color
     */
    public void setColor(String color){
        this.color = color;
    }

    /**
     *
     */
    public void imprimir() {
        System.out.println("El cono introducido presenta: ");
        System.out.println("Un círculo de radio "+super.radio+"cm con coordenadas en su centro de ("+super.centroX+", "+super.centroY+")");
        System.out.println("Un color: "+this.color);
        System.out.println("Una altura: "+this.altura+"cm");
    }
}
