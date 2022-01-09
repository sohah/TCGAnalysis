import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class tcgbenchmarks_printtokens2_3_printTokens2Test {

	private tcgbenchmarks.printtokens2_3.printTokens2 tcgbenchmarks_printtokens2_3_printtokens2;

	@Before
	public void setUp() throws Exception {
		tcgbenchmarks_printtokens2_3_printtokens2 = new tcgbenchmarks.printtokens2_3.printTokens2();
	}

	@Test
	public void test0() {
		tcgbenchmarks_printtokens2_3_printtokens2.mainProcess('\u0000','\u0000',_,'d','e','f','g','h');
	}

	@Test
	public void test1() {
		tcgbenchmarks_printtokens2_3_printtokens2.mainProcess('\u0000',' ','\u0000','d','e','f','g','h');
	}

	@Test
	public void test2() {
		tcgbenchmarks_printtokens2_3_printtokens2.mainProcess('\u0000',' ',' ','d','e','f','g','h');
	}

	@Test
	public void test3() {
		tcgbenchmarks_printtokens2_3_printtokens2.mainProcess('\u0000',' ','\n','d','e','f','g','h');
	}

	@Test
	public void test4() {
		tcgbenchmarks_printtokens2_3_printtokens2.mainProcess('\u0000',' ','(','d','e','f','g','h');
	}

	@Test
	public void test5() {
		tcgbenchmarks_printtokens2_3_printtokens2.mainProcess('\u0000',' ',')','d','e','f','g','h');
	}

	@Test
	public void test6() {
		tcgbenchmarks_printtokens2_3_printtokens2.mainProcess('\u0000',' ','[','d','e','f','g','h');
	}

	@Test
	public void test7() {
		tcgbenchmarks_printtokens2_3_printtokens2.mainProcess('\u0000',' ',']','d','e','f','g','h');
	}

	@Test
	public void test8() {
		tcgbenchmarks_printtokens2_3_printtokens2.mainProcess('\u0000',' ','\'','d','e','f','g','h');
	}

	@Test
	public void test9() {
		tcgbenchmarks_printtokens2_3_printtokens2.mainProcess('\u0000',' ','`','d','e','f','g','h');
	}

	@Test
	public void test10() {
		tcgbenchmarks_printtokens2_3_printtokens2.mainProcess('\u0000',' ',',','d','e','f','g','h');
	}

	@Test
	public void test11() {
		tcgbenchmarks_printtokens2_3_printtokens2.mainProcess('\u0000',' ','"','d','e','f','g','h');
	}

	@Test
	public void test12() {
		tcgbenchmarks_printtokens2_3_printtokens2.mainProcess('\u0000',' ',';','d','e','f','g','h');
	}

	@Test
	public void test13() {
		tcgbenchmarks_printtokens2_3_printtokens2.mainProcess('\u0000',' ','a','d','e','f','g','h');
	}

	@Test
	public void test14() {
		tcgbenchmarks_printtokens2_3_printtokens2.mainProcess('\u0000',' ','o','d','e','f','g','h');
	}

	@Test
	public void test15() {
		tcgbenchmarks_printtokens2_3_printtokens2.mainProcess('\u0000',' ','i','d','e','f','g','h');
	}

	@Test
	public void test16() {
		tcgbenchmarks_printtokens2_3_printtokens2.mainProcess('\u0000',' ','x','d','e','f','g','h');
	}

	@Test
	public void test17() {
		tcgbenchmarks_printtokens2_3_printtokens2.mainProcess('\u0000',' ','l','d','e','f','g','h');
	}

	@Test
	public void test18() {
		tcgbenchmarks_printtokens2_3_printtokens2.mainProcess('\u0000',' ','=','d','e','f','g','h');
	}

	@Test
	public void test19() {
		tcgbenchmarks_printtokens2_3_printtokens2.mainProcess('\u0000',' ','C','d','e','f','g','h');
	}

	@Test
	public void test20() {
		tcgbenchmarks_printtokens2_3_printtokens2.mainProcess('\u0000',' ','','d','e','f','g','h');
	}

	@Test
	public void test21() {
		tcgbenchmarks_printtokens2_3_printtokens2.mainProcess('\u0000',' ','_','d','e','f','g','h');
	}

	@Test
	public void test22() {
		tcgbenchmarks_printtokens2_3_printtokens2.mainProcess('\u0000',' ','0','d','e','f','g','h');
	}

	@Test
	public void test23() {
		tcgbenchmarks_printtokens2_3_printtokens2.mainProcess('\u0000',' ','#','d','e','f','g','h');
	}

	@Test
	public void test24() {
		tcgbenchmarks_printtokens2_3_printtokens2.mainProcess('\u0000','\n','\u0000','d','e','f','g','h');
	}

	@Test
	public void test25() {
		tcgbenchmarks_printtokens2_3_printtokens2.mainProcess('\u0000','"','"','d','e','f','g','h');
	}

	@Test
	public void test26() {
		tcgbenchmarks_printtokens2_3_printtokens2.mainProcess('\u0000','"','\n','d','e','f','g','h');
	}

	@Test
	public void test27() {
		tcgbenchmarks_printtokens2_3_printtokens2.mainProcess('\u0000',';','\n','d','e','f','g','h');
	}

	@Test
	public void test28() {
		tcgbenchmarks_printtokens2_3_printtokens2.mainProcess('\u0000','0','\u0000','d','e','f','g','h');
	}

	@Test
	public void test29() {
		tcgbenchmarks_printtokens2_3_printtokens2.mainProcess('\u0000','#','\u0000','d','e','f','g','h');
	}

	@Test
	public void test30() {
		tcgbenchmarks_printtokens2_3_printtokens2.mainProcess('\u0000','a','(','d','e','f','g','h');
	}

	@Test
	public void test31() {
		tcgbenchmarks_printtokens2_3_printtokens2.mainProcess('\u0000','a',' ','d','e','f','g','h');
	}

	@Test
	public void test32() {
		tcgbenchmarks_printtokens2_3_printtokens2.mainProcess('\u0000','a','\n','d','e','f','g','h');
	}

	@Test
	public void test33() {
		tcgbenchmarks_printtokens2_3_printtokens2.mainProcess('\u0000','a',';','d','e','f','g','h');
	}

	@Test
	public void test34() {
		tcgbenchmarks_printtokens2_3_printtokens2.mainProcess('\u0000','a','n','d','e','f','g','h');
	}

	@Test
	public void test35() {
		tcgbenchmarks_printtokens2_3_printtokens2.mainProcess('\u0000','a','{','d','e','f','g','h');
	}

	@Test
	public void test36() {
		tcgbenchmarks_printtokens2_3_printtokens2.mainProcess('\u0000','a','0','d','e','f','g','h');
	}

	@Test
	public void test37() {
		tcgbenchmarks_printtokens2_3_printtokens2.mainProcess('\u0000','o','r','d','e','f','g','h');
	}

	@Test
	public void test38() {
		tcgbenchmarks_printtokens2_3_printtokens2.mainProcess('\u0000','i','f','d','e','f','g','h');
	}

	@Test
	public void test39() {
		tcgbenchmarks_printtokens2_3_printtokens2.mainProcess('\u0000','x','o','d','e','f','g','h');
	}

	@Test
	public void test40() {
		tcgbenchmarks_printtokens2_3_printtokens2.mainProcess('\u0000','l','a','d','e','f','g','h');
	}

	@Test
	public void test41() {
		tcgbenchmarks_printtokens2_3_printtokens2.mainProcess('\u0000','=','>','d','e','f','g','h');
	}

	@Test
	public void test42() {
		tcgbenchmarks_printtokens2_3_printtokens2.mainProcess('\u0000','0','0','d','e','f','g','h');
	}

	@Test
	public void test43() {
		tcgbenchmarks_printtokens2_3_printtokens2.mainProcess('a','n','\u0000','d','e','f','g','h');
	}

	@Test
	public void test44() {
		tcgbenchmarks_printtokens2_3_printtokens2.mainProcess('x','o','r','d','e','f','g','h');
	}

	@Test
	public void test45() {
		tcgbenchmarks_printtokens2_3_printtokens2.mainProcess('l','a','m','d','e','f','g','h');
	}
}

