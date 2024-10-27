// Napisz program, który tworzy listę tablicową 10 liczb całkowitych, a następnie wyświetla
// je w konsoli w porządku odwrotnym do wprowadzenia.

import java.util.ArrayList;

public class ReverseArrayList {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();

        for (int i=0; i<10; i++){
            list.add(i);
        }

        System.out.println(list.reversed());
    }

}
