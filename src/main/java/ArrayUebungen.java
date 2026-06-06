import java.util.Arrays;

public class ArrayUebungen {

    public static void main(String[] args) {



        System.out.println(getSum(new int[]{2, 3, 4, 5}));

        System.out.println(getSum(new int[][]{{3, 4, 5}, {1, 2, 3}})); /** println empf?ngt einen R?ckgabenwert von getSum also eine int Zahl **/

        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};
        int[] result = concatenate(arr1, arr2);

        System.out.println(Arrays.toString(result));

        System.out.println(Arrays.toString(filter(new int[]{7, 8, 3, 5, 4, 9, 10, 11, 12, 13, 14, 15}, 5, 14)));
    }


    public static int getSum(int[] elements) {     /**Diese Methode nimmt ein int-Array als Parameter und gibt eine int-Zahl zur?ck **/
        int sum = 0;
        for (int i = 0; i < elements.length; i++) {  /** solange der index kleiner als length geht die schleife durch**/
            sum += elements[i];                  /** Nach jeder Iteration wird das aktuelle Element mit dem bereits gespeicherten Wert in sum addiert **/
        }
        return sum;

    }


    public static int getSum(int[][] elements) {
        int sum = 0;
        for (int i = 0; i < elements.length; i++) {

            sum += getSum(elements[i]);
        }

        return sum;
    }

    public static int[] concatenate(int[] arr1, int[] arr2) {

        int[] arr3 = new int[arr1.length + arr2.length];

        for (int i = 0; i < arr1.length; i++) {

            arr3[i] = arr1[i];

        }
        for (int i = 0; i < arr2.length; i++) {

            arr3[arr1.length + i] = arr2[i]; /**n dem zweiten Schleife haben wir array 3 teilweise bef?llt von der ersten schleife, deswegen geben wir die Elemente von der zweiten Schleife auf leere positionen! die zeile sagt gib schon zu der teilweise gef?llte Arr3 die gebliebene elemente von den array2: **/
        }
        return arr3;
    }

    public static int[] filter(int[] arr, int min, int max) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= min && arr[i] <= max) {
                count++;
            }
        }
        int[] newArr = new int[count];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= min && arr[i] <= max) {
                newArr[j] = arr[i];
                j++;
            }
        }
        return newArr;


    }

}
