import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

 public class replaceCollect_steps1_Test{

	private tcgbenchmarks.replace.replace11 tcgbenchmarks_replace_replace11;

	@Before
	public void setUp() throws Exception {
		tcgbenchmarks_replace_replace11 = new tcgbenchmarks.replace.replace11();
	}

	@Test
	public void test0() {
		tcgbenchmarks_replace_replace11.mainProcess('?','?','&','&','&','2','c','2','a','&','a');
	}

	@Test
	public void test1() {
		tcgbenchmarks_replace_replace11.mainProcess('?','?','&','&','@','2','c','2','a','&','a');
	}

	@Test
	public void test2() {
		tcgbenchmarks_replace_replace11.mainProcess('?','?','&','@','\u0000','2','c','2','a','&','a');
	}

	@Test
	public void test3() {
		tcgbenchmarks_replace_replace11.mainProcess('?','?','&','@','n','2','c','2','a','&','a');
	}

	@Test
	public void test4() {
		tcgbenchmarks_replace_replace11.mainProcess('?','?','&','@','t','2','c','2','a','&','a');
	}

	@Test
	public void test5() {
		tcgbenchmarks_replace_replace11.mainProcess('?','?','\u0000','\u0000','\u0000','2','c','2','a','&','a');
	}

	@Test
	public void test6() {
		tcgbenchmarks_replace_replace11.mainProcess('?','[','\u0000','\u0000','\u0000','2','c','2','a','&','a');
	}

	@Test
	public void test7() {
		tcgbenchmarks_replace_replace11.mainProcess('?','%','&','&','&','2','c','2','a','&','a');
	}

	@Test
	public void test8() {
		tcgbenchmarks_replace_replace11.mainProcess('?','*','&','&','&','2','c','2','a','&','a');
	}

	@Test
	public void test9() {
		tcgbenchmarks_replace_replace11.mainProcess('?','$','&','&','&','2','c','2','a','&','a');
	}

	@Test
	public void test10() {
		tcgbenchmarks_replace_replace11.mainProcess('?','2','&','&','&','2','c','2','a','&','a');
	}

	@Test
	public void test11() {
		tcgbenchmarks_replace_replace11.mainProcess('?','@','&','&','&','2','c','2','a','&','a');
	}

	@Test
	public void test12() {
		tcgbenchmarks_replace_replace11.mainProcess('[','^','\u0000','\u0000','\u0000','2','c','2','a','&','a');
	}

	@Test
	public void test13() {
		tcgbenchmarks_replace_replace11.mainProcess('[',' ','\u0000','\u0000','\u0000','2','c','2','a','&','a');
	}

	@Test
	public void test14() {
		tcgbenchmarks_replace_replace11.mainProcess('[','-','\u0000','\u0000','\u0000','2','c','2','a','&','a');
	}

	@Test
	public void test15() {
		tcgbenchmarks_replace_replace11.mainProcess('[',']','&','&','&','2','c','2','a','&','a');
	}

	@Test
	public void test16() {
		tcgbenchmarks_replace_replace11.mainProcess('%','?','&','&','&','2','c','2','a','&','a');
	}

	@Test
	public void test17() {
		tcgbenchmarks_replace_replace11.mainProcess('%','*','\u0000','\u0000','\u0000','2','c','2','a','&','a');
	}

	@Test
	public void test18() {
		tcgbenchmarks_replace_replace11.mainProcess('%','\u0000','&','&','&','2','c','2','a','&','a');
	}

	@Test
	public void test19() {
		tcgbenchmarks_replace_replace11.mainProcess('*','?','&','&','&','2','c','2','a','&','a');
	}

	@Test
	public void test20() {
		tcgbenchmarks_replace_replace11.mainProcess('*','*','&','&','&','2','c','2','a','&','a');
	}

	@Test
	public void test21() {
		tcgbenchmarks_replace_replace11.mainProcess('$','?','&','&','&','2','c','2','a','&','a');
	}

	@Test
	public void test22() {
		tcgbenchmarks_replace_replace11.mainProcess('c','*','&','&','&','2','c','2','a','&','a');
	}

	@Test
	public void test23() {
		tcgbenchmarks_replace_replace11.mainProcess('@','n','&','&','&','2','c','2','a','&','a');
	}

	@Test
	public void test24() {
		tcgbenchmarks_replace_replace11.mainProcess('@','t','&','&','&','2','c','2','a','&','a');
	}

	@Test
	public void test25() {
		tcgbenchmarks_replace_replace11.mainProcess('@','c','&','&','&','2','c','2','a','&','a');
	}

	@Test
	public void test26() {
		tcgbenchmarks_replace_replace11.mainProcess('\u0000','\u0000','&','&','&','2','c','2','a','&','a');
	}
}

