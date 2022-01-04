import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class tcgbenchmarks_apachecli_CLITest {

	private tcgbenchmarks.apachecli.CLI tcgbenchmarks_apachecli_cli;

	@Before
	public void setUp() throws Exception {
		tcgbenchmarks_apachecli_cli = new tcgbenchmarks.apachecli.CLI();
	}

	@Test
	public void test0() {
		tcgbenchmarks_apachecli_cli.mainProcess('-','-','-','m','-','h','y','m',false);
	}

	@Test
	public void test1() {
		tcgbenchmarks_apachecli_cli.mainProcess('-',' ','-','m','-','h','y','m',false);
	}

	@Test
	public void test2() {
		tcgbenchmarks_apachecli_cli.mainProcess('-','a','-','m','-','h','y','m',false);
	}

	@Test
	public void test3() {
		tcgbenchmarks_apachecli_cli.mainProcess('-',',','-','m','-','h','y','m',false);
	}
}

