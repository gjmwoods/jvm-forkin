import org.junit.Test;

import java.lang.management.ManagementFactory;

public class Mod2ATest {

	@Test
	public void hello() throws InterruptedException {
		System.out.println(this.getClass().getName() + "    on " + ManagementFactory.getRuntimeMXBean().getName());
		Thread.sleep(2 * 1000);
	}
}
