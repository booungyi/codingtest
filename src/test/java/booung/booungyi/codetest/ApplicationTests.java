package booung.booungyi.codetest;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

class ApplicationTests {

	@Test
	void contextLoads() {
		Coolveriable coolveriable = new Coolveriable();
//		assertThat(coolveriable.coolint("123456789")).isEqualTo(-1);
		assertThat(coolveriable.coolint("123336789")).isEqualTo(333);
		assertThat(coolveriable.coolint("1222333456789")).isEqualTo(333);
		assertThat(coolveriable.coolint("123444456789")).isEqualTo(444);
		assertThat(coolveriable.coolint("129")).isEqualTo(-1);
		assertThat(coolveriable.coolint("111")).isEqualTo(111);
		assertThat(coolveriable.coolint("000")).isEqualTo(0);
		assertThat(coolveriable.coolint("123123")).isEqualTo(-1);
		assertThat(coolveriable.coolint("111122223424999222")).isEqualTo(999);
	}
}
