import org.junit.Test;

import java.lang.management.ManagementFactory;

public class Mod2CTest {

	@Test
	public void goodbye() throws InterruptedException {
		System.out.println(this.getClass().getName() + "    on " + ManagementFactory.getRuntimeMXBean().getName());
		Thread.sleep(500);
	}
}