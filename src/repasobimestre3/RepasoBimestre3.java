
package repasobimestre3;


public class RepasoBimestre3 {

    
    public static void main(String[] args) {
    int notas[][] = {{10, 20, 30}, {40, 50, 60}, {70, 80, 90}}; 
        System.out.println("La diagonal principal es " + diagonalPrincipal(notas));
    }
    public static String diagonalPrincipal(int matriz[][]){
    String resultado = ""; 
        for (int i = 0; i < matriz.length; i++) {
        resultado = resultado + String.valueOf(matriz[i][i]) + "-> ";    
        }
    return resultado;
}
}
