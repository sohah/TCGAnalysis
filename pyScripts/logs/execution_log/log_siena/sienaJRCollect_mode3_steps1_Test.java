import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

 public class sienaJRCollect_mode3_steps1_Test{

	private tcgbenchmarks.siena.SENPDriver tcgbenchmarks_siena_senpdriver;

	@Before
	public void setUp() throws Exception {
		tcgbenchmarks_siena_senpdriver = new tcgbenchmarks.siena.SENPDriver();
	}

	@Test
	public void test0() {
		tcgbenchmarks_siena_senpdriver.mainProcess(11,11,11,11,5,5,7,8,9);
	}

	@Test
	public void test1() {
		tcgbenchmarks_siena_senpdriver.mainProcess(11,11,12,11,5,5,7,8,9);
	}

	@Test
	public void test2() {
		tcgbenchmarks_siena_senpdriver.mainProcess(11,11,13,11,5,5,7,8,9);
	}

	@Test
	public void test3() {
		tcgbenchmarks_siena_senpdriver.mainProcess(11,11,10,11,5,5,7,8,9);
	}

	@Test
	public void test4() {
		tcgbenchmarks_siena_senpdriver.mainProcess(11,11,-2147483648,11,5,5,7,8,9);
	}

	@Test
	public void test5() {
		tcgbenchmarks_siena_senpdriver.mainProcess(11,11,127,11,5,5,7,8,9);
	}
}

