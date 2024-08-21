/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figuras.e1;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Seidor Colombia
 */
public class Figuras {
    private List<Figura> figuras = new ArrayList<>();

    public void addFigura(Figura f) {
        figuras.add(f);
    }

    public void dibujarFiguras() {
        for (Figura f : figuras) {
            f.dibujar();
        }
    }
}