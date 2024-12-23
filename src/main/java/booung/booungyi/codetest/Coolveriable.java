package booung.booungyi.codetest;

import javax.swing.text.Style;
import java.util.*;

public class Coolveriable {
    public int coolint(String sc) {
        List<Integer> 멋쟁이후보 = new ArrayList<>();
        Queue<String> queue = new LinkedList<>();
        //Todo 예외처리 문자열의 길이가 3보다 작을떄    //Todo 예외처리 문자열의 길이가 3일떄
        if (sc.length() < 3) {
            return -1;
        }
        for (int i =  0; i <= sc.length()-1; i++) {
            //Todo 큐
            queue.add(String.valueOf(sc.charAt(i)));
            if (queue.size() == 3) {
                StringBuilder sb = new StringBuilder();
                for (String string : queue) {
                    sb.append(string);
                }
                String s = sb.toString();
                if (s.charAt(0) == s.charAt(1)
                        && s.charAt(0) == s.charAt(2)) {
                    멋쟁이후보.add(Integer.valueOf(s));
                }
                queue.poll();
            }
        }
        if (멋쟁이후보.isEmpty()) {
            return -1;
        } else if (멋쟁이후보.get(0).equals(000)) {
            return 0;
        }
        return Collections.max(멋쟁이후보);
    }
}

