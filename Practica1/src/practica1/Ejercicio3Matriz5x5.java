package practica1;

public class Ejercicio3Matriz5x5 {

    public static void main(String[] args) {
        
            //matriz de 5 filas por 5 columnas
        int[][] matriz = new int[5][5];
        
        generarMatriz(matriz);
        mostrarMatriz(matriz);
        System.out.println("la suma de los elementos de la fila 1 es: " + sumarFila(1,matriz));
        
        
        int[] vec = new int[5];
        
        generarVector(vec,matriz);
        mostrarVector(vec);
        
        encontrarNro(matriz);
        
    }
    
    
    static void encontrarNro(int[][] m){
        
        int nro;
        System.out.print("ingrese el nro a buscar: ");
        nro = PaqueteLectura.Lector.leerInt();
        System.out.println("");
        
        int columna = -1 ,fila = -1;
        
        for (int i = 0; i< 5; i++)            
            for(int j = 0; j< 5; j++){
                
                if(m[i][j] == nro){
                    columna = i;
                    fila = j;
                }
                    
            }
        
        if(columna != -1)
            System.out.println("el elemento se encuentra en la columna "+(columna+1) +" y fila: "+ (fila+1) );
        
        else
            System.out.println("NO se encontro el elemento.");
        
    }
            
    
    
    static void mostrarVector(int[] v){
        System.out.println("");
        
        for(int j= 0; j<5; j++)
            System.out.print("  ["+ v[j] +"]    ");
        
        System.out.println("");
    }
    
    static void generarVector(int[] v, int[][] m){
        for (int j= 0; j<5; j++){
            v[j] = sumarColumnas(j,m);
        }
        
    }
    
    static void generarMatriz(int[][] mat){
        for (int i = 0; i< 5; i++)            
            for(int j = 0; j< 5; j++){
                mat[i][j] = PaqueteLectura.GeneradorAleatorio.generarInt(31);
            }   
    }
    
    static void mostrarMatriz(int[][] mat){
        for (int i = 0; i< 5; i++){ 
           
            for(int j = 0; j< 5; j++){
                System.out.print("  ["+mat[i][j]+"]   ");
            }
            
            System.out.println("");
        }
    }
    
    static int sumarFila(int fila, int[][] matrx){
        
        int sumatoria = 0;
        
        for (int i = 0; i< 5; i++){
            sumatoria += matrx[fila][i];
        }
        
        
        return sumatoria;
    }
    
    static int sumarColumnas(int columna, int[][] matrx){
        
        int sumatoria = 0;
        
        for (int i = 0; i< 5; i++){
            sumatoria += matrx[i][columna];
        }
        
        
        return sumatoria;
    }
    
}


