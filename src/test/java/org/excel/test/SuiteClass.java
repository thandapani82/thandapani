package org.excel.test;

import java.util.List;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runner.notification.Failure;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import org.testng.test.Sample4;

@RunWith(Suite.class)
@SuiteClasses({Sample.class,Sample4.class,Samplejunit2.class})

public class SuiteClass {
	
	public static void main(String[] args) {
		
		Result result = JUnitCore.runClasses(SuiteClass.class);
		int f = result.getFailureCount();
		System.out.println("Failure count;"+f);
		
		int i = result.getIgnoreCount();
		System.out.println("ignore count;"+i);
		
		int j = result.getRunCount();
		System.out.println("Run count;"+j);
		
		long rt = result.getRunTime();
		System.out.println("Run time;"+rt);
		
		List<Failure> failures = result.getFailures();
		for (Failure x : failures) {
			
			System.out.println(x.toString());
		}
		
		
		
		
	}

}
