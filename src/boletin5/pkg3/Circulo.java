
package boletin5.pkg3;

/**
 *
 * @author Pablite5
 */
public class Circulo {
    private double radio;
    private final static double PI = 3.14;
    
    public Circulo(){
    
}
public Circulo(double r){
    radio = r;
}

public void setRadio(double r){
    radio = r;
}
public double getArea (){
    double area = (PI+Math.pow(radio, 2));
    return area;
}
public double getLongitud (){
    double longitud = 2*radio*PI;
    return longitud;
}

}