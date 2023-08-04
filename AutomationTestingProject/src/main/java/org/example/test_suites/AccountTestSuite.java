package org.example.test_suites;

import org.example.LoginTest;
import org.example.LogoutTest;
import org.example.RegisterTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        RegisterTest.class,
        LogoutTest.class,
        LoginTest.class
})
public class AccountTestSuite {
}
