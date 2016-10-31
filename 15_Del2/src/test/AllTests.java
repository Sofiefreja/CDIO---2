package test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ testAccount.class, testDice.class, testPlayer.class, testRandomColorClass.class })
public class AllTests {
	
}
