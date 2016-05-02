package pl.edu.pwr.pp;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class TestDoHoroskopu {
	Horoskop horoskop;
	@Before
	public void setUp(){
		horoskop = new Horoskop();
	}
	@Test
	public void winnoBycZero(){
		int len = horoskop.healthIndex("");
		assertThat(len,is(equalTo(0)));
	}
	@Test
	public void tomekNameShouldBe0(){
		int len = horoskop.healthIndex("Tomek Dróżdż");
		assertThat(len,is(equalTo(0)));
	}
	@Test
	public void twentyFiveShouldBe0(){
		int len = horoskop.loveIndex(25);
		assertThat(len,is(equalTo(0)));
	}
	@Test
	public void workShouldBeLowerThan11(){
		assertThat(horoskop.workIndex(),is(equalTo(0)));
	}
	@Test
	public void thirtyTwoOfAprilShouldBeError(){
		boolean isGood = false;
		try{
			horoskop.loveIndex(32);
		}
		catch(Exception e){
			isGood = true;
		}
		assertThat(isGood,is(true));
	}
}
