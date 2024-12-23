package booung.booungyi.codetest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Coolveriable coolveriable = new Coolveriable();
		System.out.println("숫자로된 문자열을 입력해주세요");
		coolveriable.coolint(sc.nextLine());

	}
}
