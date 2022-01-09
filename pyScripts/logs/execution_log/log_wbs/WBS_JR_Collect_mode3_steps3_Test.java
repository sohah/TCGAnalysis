import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

 public class WBS_JR_Collect_mode3_steps3_Test{

	private tcgbenchmarks.wbs.WBS tcgbenchmarks_wbs_wbs;

	@Before
	public void setUp() throws Exception {
		tcgbenchmarks_wbs_wbs = new tcgbenchmarks.wbs.WBS();
	}

	@Test
	public void test0() {
		tcgbenchmarks_wbs_wbs.launch(1,true,false,-468816509,false,false,-839619554,true,false,-2147483648,false,false,-2147483648,false,false);
	}

	@Test
	public void test1() {
		tcgbenchmarks_wbs_wbs.launch(2,false,true,4,false,false,1299369776,true,true,-2147483648,false,false,-2147483648,false,false);
	}

	@Test
	public void test2() {
		tcgbenchmarks_wbs_wbs.launch(364765868,false,true,0,false,false,1398304463,false,true,-2147483648,false,false,-2147483648,false,false);
	}

	@Test
	public void test3() {
		tcgbenchmarks_wbs_wbs.launch(364765868,false,true,3,true,true,1398304463,false,true,-2147483648,false,false,-2147483648,false,false);
	}

	@Test
	public void test4() {
		tcgbenchmarks_wbs_wbs.launch(364765868,false,true,2,true,true,2,true,false,-2147483648,false,false,-2147483648,false,false);
	}
}

