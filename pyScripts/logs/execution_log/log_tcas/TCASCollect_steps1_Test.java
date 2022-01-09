import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

 public class TCASCollect_steps1_Test{

	private tcgbenchmarks.tcas.tcas tcgbenchmarks_tcas_tcas;

	@Before
	public void setUp() throws Exception {
		tcgbenchmarks_tcas_tcas = new tcgbenchmarks.tcas.tcas();
	}

	@Test
	public void test0() {
		tcgbenchmarks_tcas_tcas.sym1(-2147483648,0,0,-2147483648,-2147483648,-2147483648,0,-2147483648,-2147483648,-2147483648,-2147483648,-2147483648);
	}

	@Test
	public void test1() {
		tcgbenchmarks_tcas_tcas.sym1(-2147483648,0,0,-2147483648,-2147483648,-2147483648,1,-2147483648,-2147483648,-2147483648,-2147483648,-2147483648);
	}

	@Test
	public void test2() {
		tcgbenchmarks_tcas_tcas.sym1(-2147483648,0,0,-2147483648,-2147483648,-2147483648,2,-2147483648,-2147483648,-2147483648,-2147483648,-2147483648);
	}

	@Test
	public void test3() {
		tcgbenchmarks_tcas_tcas.sym1(-2147483648,0,0,-2147483648,-2147483648,-2147483648,-2,-2147483648,-2147483648,-2147483648,-2147483648,-2147483648);
	}

	@Test
	public void test4() {
		tcgbenchmarks_tcas_tcas.sym1(-2147483648,0,-1,-2147483648,-2147483648,-2147483648,0,-2147483648,-2147483648,-2147483648,-2147483648,-2147483648);
	}

	@Test
	public void test5() {
		tcgbenchmarks_tcas_tcas.sym1(301,-1,0,-2147483648,600,-2147483648,0,-2147483648,-2147483648,-2147483648,1,-2147483648);
	}

	@Test
	public void test6() {
		tcgbenchmarks_tcas_tcas.sym1(512,-1,0,-2147483648,600,-2147483647,0,285,384,-2147483648,-2,1);
	}

	@Test
	public void test7() {
		tcgbenchmarks_tcas_tcas.sym1(832,-1,0,-2147483648,600,-2147483647,0,285,384,-2147483648,-2,1);
	}

	@Test
	public void test8() {
		tcgbenchmarks_tcas_tcas.sym1(512,-1,0,-2147483648,600,-2147483648,0,285,384,-2147483648,-2,1);
	}

	@Test
	public void test9() {
		tcgbenchmarks_tcas_tcas.sym1(381,-1,0,-2147483648,600,-2147483647,0,349,448,-2147483648,-2,1);
	}

	@Test
	public void test10() {
		tcgbenchmarks_tcas_tcas.sym1(893,-1,0,-2147483648,600,2147483647,0,349,448,-2147483648,-2,1);
	}

	@Test
	public void test11() {
		tcgbenchmarks_tcas_tcas.sym1(894,-1,0,-2147483648,600,-2147483648,0,349,448,-2147483648,-2,1);
	}

	@Test
	public void test12() {
		tcgbenchmarks_tcas_tcas.sym1(381,-1,0,-2147483647,600,-2147483648,0,384,484,-2147483648,-2,1);
	}

	@Test
	public void test13() {
		tcgbenchmarks_tcas_tcas.sym1(382,-1,0,-2147483647,600,-2147483648,0,400,500,-2147483648,-2,1);
	}

	@Test
	public void test14() {
		tcgbenchmarks_tcas_tcas.sym1(382,-1,0,-2147483648,600,-2147483648,0,400,500,-2147483648,-2,1);
	}

	@Test
	public void test15() {
		tcgbenchmarks_tcas_tcas.sym1(893,-1,0,-2147483647,600,-2147483648,0,384,484,-2147483648,-2,1);
	}

	@Test
	public void test16() {
		tcgbenchmarks_tcas_tcas.sym1(893,-1,0,2147475456,600,-2147475457,0,2147483548,-2147483648,-2147483648,-2,1);
	}

	@Test
	public void test17() {
		tcgbenchmarks_tcas_tcas.sym1(893,-1,0,-2147483648,600,-2147483648,0,2147483548,-2147483648,-2147483648,-2,1);
	}

	@Test
	public void test18() {
		tcgbenchmarks_tcas_tcas.sym1(512,-1,0,-2147483648,600,-2147483647,0,385,384,-2147483648,-2,0);
	}

	@Test
	public void test19() {
		tcgbenchmarks_tcas_tcas.sym1(300,-1,0,-2147483648,600,-2147483648,0,-2147483648,-2147483648,-2147483648,-2147483648,-2147483648);
	}

	@Test
	public void test20() {
		tcgbenchmarks_tcas_tcas.sym1(-2147483648,-1,0,-2147483648,601,-2147483648,0,-2147483648,-2147483648,-2147483648,-2147483648,-2147483648);
	}

	@Test
	public void test21() {
		tcgbenchmarks_tcas_tcas.sym1(512,-1,-1,-2147483648,600,-2147483647,0,285,384,0,1,1);
	}

	@Test
	public void test22() {
		tcgbenchmarks_tcas_tcas.sym1(301,-1,-1,-2147483648,600,-2147483648,0,-2147483648,-2147483648,-1,1,-2147483648);
	}
}

