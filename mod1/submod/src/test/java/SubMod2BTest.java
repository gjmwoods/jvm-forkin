import org.junit.Test;

import java.lang.management.ManagementFactory;

public class SubMod2BTest {

	@Test
	public void goodbye() throws InterruptedException {
		System.out.println(this.getClass().getName() + " on " + ManagementFactory.getRuntimeMXBean().getName());
		Thread.sleep(2 * 1000);
	}
}
