import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class tcgbenchmarks_nanoxmlTCG_DumpXMLTest {

	private tcgbenchmarks.nanoxmlTCG.DumpXML tcgbenchmarks_nanoxmltcg_dumpxml;

	@Before
	public void setUp() throws Exception {
		tcgbenchmarks_nanoxmltcg_dumpxml = new tcgbenchmarks.nanoxmlTCG.DumpXML();
	}

	@Test
	public void test0() {
		tcgbenchmarks_nanoxmltcg_dumpxml.mainProcess('&','\u0000','\u0000','\u0000','=','=','"','1','"');
	}

	@Test
	public void test1() {
		tcgbenchmarks_nanoxmltcg_dumpxml.mainProcess('&','\u0000','\u0000',';','=','=','"','1','"');
	}

	@Test
	public void test2() {
		tcgbenchmarks_nanoxmltcg_dumpxml.mainProcess('&',';','\u0000','\u0000','=','=','"','1','"');
	}

	@Test
	public void test3() {
		tcgbenchmarks_nanoxmltcg_dumpxml.mainProcess('<','&','\u0000','\u0000','=','=','"','1','"');
	}

	@Test
	public void test4() {
		tcgbenchmarks_nanoxmltcg_dumpxml.mainProcess('<','?','?','膬','=','=','"','1','"');
	}

	@Test
	public void test5() {
		tcgbenchmarks_nanoxmltcg_dumpxml.mainProcess('<','?','?','>','=','=','"','1','"');
	}

	@Test
	public void test6() {
		tcgbenchmarks_nanoxmltcg_dumpxml.mainProcess('<','!','&','\u0000','=','=','"','1','"');
	}

	@Test
	public void test7() {
		tcgbenchmarks_nanoxmltcg_dumpxml.mainProcess('<','!','[','&','=','=','"','1','"');
	}

	@Test
	public void test8() {
		tcgbenchmarks_nanoxmltcg_dumpxml.mainProcess('<','!','[','<','=','=','"','1','"');
	}

	@Test
	public void test9() {
		tcgbenchmarks_nanoxmltcg_dumpxml.mainProcess('<','!','[','>','=','=','"','1','"');
	}

	@Test
	public void test10() {
		tcgbenchmarks_nanoxmltcg_dumpxml.mainProcess('<','!','D','&','=','=','"','1','"');
	}

	@Test
	public void test11() {
		tcgbenchmarks_nanoxmltcg_dumpxml.mainProcess('<','!','D','f','=','=','"','1','"');
	}

	@Test
	public void test12() {
		tcgbenchmarks_nanoxmltcg_dumpxml.mainProcess('<','!','D','O','=','=','"','1','"');
	}

	@Test
	public void test13() {
		tcgbenchmarks_nanoxmltcg_dumpxml.mainProcess('<','!','-','&','=','=','"','1','"');
	}

	@Test
	public void test14() {
		tcgbenchmarks_nanoxmltcg_dumpxml.mainProcess('<','!','-','\u0000','=','=','"','1','"');
	}

	@Test
	public void test15() {
		tcgbenchmarks_nanoxmltcg_dumpxml.mainProcess('<','!','-','-','=','=','"','1','"');
	}

	@Test
	public void test16() {
		tcgbenchmarks_nanoxmltcg_dumpxml.mainProcess('<','!','d','&','=','=','"','1','"');
	}

	@Test
	public void test17() {
		tcgbenchmarks_nanoxmltcg_dumpxml.mainProcess('<','!','d','<','=','=','"','1','"');
	}

	@Test
	public void test18() {
		tcgbenchmarks_nanoxmltcg_dumpxml.mainProcess('<','!','d',' ','=','=','"','1','"');
	}

	@Test
	public void test19() {
		tcgbenchmarks_nanoxmltcg_dumpxml.mainProcess('<','!','d','\t','=','=','"','1','"');
	}

	@Test
	public void test20() {
		tcgbenchmarks_nanoxmltcg_dumpxml.mainProcess('<','!','d','\n','=','=','"','1','"');
	}

	@Test
	public void test21() {
		tcgbenchmarks_nanoxmltcg_dumpxml.mainProcess('<','!','d','\r','=','=','"','1','"');
	}

	@Test
	public void test22() {
		tcgbenchmarks_nanoxmltcg_dumpxml.mainProcess('<','_','&','\u0000','=','=','"','1','"');
	}

	@Test
	public void test23() {
		tcgbenchmarks_nanoxmltcg_dumpxml.mainProcess('<','_','_',':','=','=','"','1','"');
	}

	@Test
	public void test24() {
		tcgbenchmarks_nanoxmltcg_dumpxml.mainProcess('<','_','_','-','=','=','"','1','"');
	}

	@Test
	public void test25() {
		tcgbenchmarks_nanoxmltcg_dumpxml.mainProcess('<','_','_','.','=','=','"','1','"');
	}

	@Test
	public void test26() {
		tcgbenchmarks_nanoxmltcg_dumpxml.mainProcess('<','_','_','','=','=','"','1','"');
	}

	@Test
	public void test27() {
		tcgbenchmarks_nanoxmltcg_dumpxml.mainProcess('<','_','_','0','=','=','"','1','"');
	}

	@Test
	public void test28() {
		tcgbenchmarks_nanoxmltcg_dumpxml.mainProcess('<','_','_','K','=','=','"','1','"');
	}

	@Test
	public void test29() {
		tcgbenchmarks_nanoxmltcg_dumpxml.mainProcess('<','_','_','x','=','=','"','1','"');
	}

	@Test
	public void test30() {
		tcgbenchmarks_nanoxmltcg_dumpxml.mainProcess('<','_','_','{','=','=','"','1','"');
	}

	@Test
	public void test31() {
		tcgbenchmarks_nanoxmltcg_dumpxml.mainProcess('<','_','_','`','=','=','"','1','"');
	}

	@Test
	public void test32() {
		tcgbenchmarks_nanoxmltcg_dumpxml.mainProcess('<','_','{','/','=','=','"','1','"');
	}

	@Test
	public void test33() {
		tcgbenchmarks_nanoxmltcg_dumpxml.mainProcess('<','_','{','>','=','=','"','1','"');
	}

	@Test
	public void test34() {
		tcgbenchmarks_nanoxmltcg_dumpxml.mainProcess('<','_','{','|','=','=','"','1','"');
	}

	@Test
	public void test35() {
		tcgbenchmarks_nanoxmltcg_dumpxml.mainProcess('<','{','/','>','=','=','"','1','"');
	}

	@Test
	public void test36() {
		tcgbenchmarks_nanoxmltcg_dumpxml.mainProcess('<','{','>','<','=','=','"','1','"');
	}
}

