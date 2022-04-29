/*
Matriz 3

0	1	2	3	4
1	2	3	4	5
2	3	4	5	6
3	4	5	6	7
 */
package matriz3;
import java.util.Arrays;
public class Matriz3 {

    public static void main(String[] args) {
        System.out.println("Matriz");
            
    int matriz [][] = new int [4][5];
    
        for (int i=0;i<matriz.length;i++)
            for (int j=0;j<matriz[i].length; j++){
                matriz [i][j] = i+j;
            }
        for (int i=0;i<matriz.length;i++){
            System.out.println(Arrays.toString(matriz[i]));
        }
    }
    
}
