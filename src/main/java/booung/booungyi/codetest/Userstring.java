package booung.booungyi.codetest;

public class Userstring {
    String userstring;

    public Userstring(String userstring) {
        boolean validinput = false;
            System.out.println("숫자를 입력해주세요");
            try {
                int number = Integer.valueOf(userstring);

                validinput = true;
            } catch (NumberFormatException e) {
                System.out.println("숫자만 입력해주세요");

            }
        this.userstring = userstring;
    }
}
