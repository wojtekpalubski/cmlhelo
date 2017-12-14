package pl.wpe.cmlhelo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CmlheloApplicationTests {

	@Test
	public void contextLoads() {
            Double d=Math.random()*1000;
            String s=String.format("%d", d.intValue());
	}

}
