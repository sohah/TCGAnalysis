import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

 public class apacheJRCollect_mode4_steps1_Test{

	private tcgbenchmarks.apachecli.CLI tcgbenchmarks_apachecli_cli;

	@Before
	public void setUp() throws Exception {
		tcgbenchmarks_apachecli_cli = new tcgbenchmarks.apachecli.CLI();
	}

	@Test
	public void test0() {
		tcgbenchmarks_apachecli_cli.mainProcess('-','-','\u0000','\u0000','-','h','y','m',false);
	}

	@Test
	public void test1() {
		tcgbenchmarks_apachecli_cli.mainProcess('-',' ','-','-','-','h','y','m',false);
	}

	@Test
	public void test2() {
		tcgbenchmarks_apachecli_cli.mainProcess('-',' ','-',' ','-','h','y','m',false);
	}

	@Test
	public void test3() {
		tcgbenchmarks_apachecli_cli.mainProcess('-',' ','-','a','-','h','y','m',false);
	}

	@Test
	public void test4() {
		tcgbenchmarks_apachecli_cli.mainProcess('-',' ','-','b','-','h','y','m',false);
	}

	@Test
	public void test5() {
		tcgbenchmarks_apachecli_cli.mainProcess('-',' ','-','','-','h','y','m',false);
	}

	@Test
	public void test6() {
		tcgbenchmarks_apachecli_cli.mainProcess('-','b','\t','-','-','h','y','m',false);
	}

	@Test
	public void test7() {
		tcgbenchmarks_apachecli_cli.mainProcess('-','b','2','','-','h','y','m',false);
	}
}

