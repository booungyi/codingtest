package booung.booungyi.codetest;

import javax.swing.text.Style;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Coolveriable {
    public int coolint(String sc) {
        int 멋쟁이숫자 = 0;
        String s = sc;
        s = "0";
        for (int i = 0; i < sc.length(); i++) {
            if (s.substring(0,1).equals(sc.substring(i + 1, i + 2))) {
                s.concat(sc.substring(i + 1, i + 2));
            }
        }
        return 멋쟁이숫자;
    }
}

