package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HookesSD {

    @Before("@verifyHook")
    public void someMethod1()
    {
        System.out.println("====> @Before--> Some Method1");
    }

    @After("@verifyHook")
    public void someMethod2()
    {
        System.out.println("====> @After--> Some Method2");
    }

}
