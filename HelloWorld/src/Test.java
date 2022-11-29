import java.util.Arrays;

public class Test {
    public static void main ( String [] args ) {
    int intArr[] = {10,9,8,7,6,5,4,3,2,1};
    char charArr[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'};
    int intIndex, charIndex;
    
    for(int i = 0; i < intArr.length; i++) {
        System.out.println(intArr[i]);
    }

    intIndex = Arrays.binarySearch(intArr,4);
    System.out.println("Ele está na posição:" + intIndex);
    charIndex = Arrays.binarySearch(charArr, 'b');
    System.out.println("Ele está na posição:" + charIndex);


    // Ordena o array
    Arrays.sort(intArr);
    for(int j = 0; j < intArr.length; j++) {
        System.out.println("(" + intArr[j] +")");
    }

    // Procurando o valor 5 no array
    intIndex = Arrays.binarySearch(intArr, 1);
    System.out.println("Ele está na posição:" + intIndex);
    }
}