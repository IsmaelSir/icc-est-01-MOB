public class Metodos {

    public Metodos(){

        System.out.println("Se inicio la clase Metodos" + " *Se creo la clase Metodos" + " *Este mensaje biene del constructor Metodos");
    }

    public int[] sortByBubble(int[] arreglo){

        int tamanio = arreglo.length;

        for (int i = 0; i < tamanio; i++) {
            for (int j = i+1; j < tamanio; j++) {
                if(arreglo[i] >arreglo[j]){
                    int aux = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = aux;
                }
            }
        }
        return arreglo;
    }

    public void printArreglo(int[] arreglo){
        System.out.println("Arreglo en orden acendente: ");
        for (Object elemento : arreglo) {
            System.out.print(elemento + " ");
        }

    }

    public int[] sortByBubbleDe(int[] arreglo){

        int tamanio = arreglo.length;

        for (int i = 0; i < tamanio; i++) {
            for (int j = i+1; j < tamanio; j++) {
                if(arreglo[i] <arreglo[j]){
                    int aux = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = aux;
                }
            }
        }
        return arreglo;
    }

    public void printArregloDe(int[] arreglo){
        System.out.println("\nArreglo en orden decendente: ");
        for (Object elemento : arreglo) {
            System.out.print(elemento + " ");
        }
    }

    //Para ordenar la cadena a pal
    public String[] sortByBubblePalabras(String[] palabras){
        int tamanio = palabras.length;

        for (int i = 0; i < tamanio; i++) {
            for (int j = i+1; j < tamanio; j++) {
                if(palabras[i].compareTo(palabras[j]) >0){
                    String aux = palabras[i];
                    palabras[i] = palabras[j];
                    palabras[j] = aux;
                }
            }
        }
        return palabras;
    }
    public void printArregloPalabras(String[] arreglo){
        System.out.println("\nArreglo de palabras ordenado alfabeticamente: ");
        for (Object elemento : arreglo) {
            System.out.print(elemento + " ");
        }

    }
}
