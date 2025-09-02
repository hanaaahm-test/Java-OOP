package com.example;

import org.testng.ITestListener;
import org.testng.ITestContext;
import org.testng.ITestResult;

public class ListenerClass implements ITestListener{
 @Override
 public void onTestStart(ITestResult result) {
     System.out.println("Test Started Successfully");
 }
@Override
public void onFinish(ITestContext context) {
    System.out.println("All tests finished Successfully ");
}
}
