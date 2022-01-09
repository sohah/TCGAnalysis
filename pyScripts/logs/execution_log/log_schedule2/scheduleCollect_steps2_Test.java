import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

 public class scheduleCollect_steps2_Test{

	private tcgbenchmarks.schedule2_3.Schedule2 tcgbenchmarks_schedule2_3_schedule2;

	@Before
	public void setUp() throws Exception {
		tcgbenchmarks_schedule2_3_schedule2 = new tcgbenchmarks.schedule2_3.Schedule2();
	}

	@Test
	public void test0() {
		tcgbenchmarks_schedule2_3_schedule2.launch(3,3,3,3,3,2,5,3,2,5,3,2,5,3,2);
	}

	@Test
	public void test1() {
		tcgbenchmarks_schedule2_3_schedule2.launch(3,3,3,3,1,2,5,3,2,5,3,2,5,3,2);
	}

	@Test
	public void test2() {
		tcgbenchmarks_schedule2_3_schedule2.launch(3,3,3,3,4,2,5,3,2,5,3,2,5,3,2);
	}

	@Test
	public void test3() {
		tcgbenchmarks_schedule2_3_schedule2.launch(3,3,3,3,5,2,5,3,2,5,3,2,5,3,2);
	}

	@Test
	public void test4() {
		tcgbenchmarks_schedule2_3_schedule2.launch(3,3,3,3,6,2,5,3,2,5,3,2,5,3,2);
	}

	@Test
	public void test5() {
		tcgbenchmarks_schedule2_3_schedule2.launch(3,3,3,3,-131074,2,5,3,2,5,3,2,5,3,2);
	}

	@Test
	public void test6() {
		tcgbenchmarks_schedule2_3_schedule2.launch(3,3,3,1,4,2,5,3,2,5,3,2,5,3,2);
	}
}

