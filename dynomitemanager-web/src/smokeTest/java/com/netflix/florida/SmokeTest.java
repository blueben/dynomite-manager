package com.netflix.florida;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.io.IOException;

import javax.inject.Named;

import org.junit.Test;
import org.junit.runner.RunWith;

import com.google.inject.Inject;
import com.netflix.archaius.test.TestPropertyOverride;
import com.netflix.governator.guice.jetty.Archaius2JettyModule;
import com.netflix.governator.guice.test.ModulesForTesting;
import com.netflix.governator.guice.test.junit4.GovernatorJunit4ClassRunner;
import com.netflix.florida.startup.FloridaModule;


/**
 * This is the one and only one integration test for the whole service.
 * We leverage the governator-test-junit library to run the test for us.
 *
 * We don't do any deep testing here. Our unit tests are supposed to do that. We keep this test simple and we check that
 * everything is wired well together and that all of our endpoints are up. Testing the actual content returned
 * or that our POSTs work etc. is done in the unit tests. Our unit test do not reach out to the network so it's faster
 * to test all possible input/output scenarios there and gain confidence that our business logic works.
 *
 * @author This file is auto-generated by runtime@netflix.com. Feel free to modify.
 */
public class SmokeTest {

    @Test
    public void testRestEndpoint() throws IOException {
    }
}
