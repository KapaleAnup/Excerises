package sentry;

import io.sentry.Sentry;
public class sentryDemo {

    public static void main(String[] args) {

        Sentry.init("your dsn");

        try {
            runSomething("Test");
        } catch (Exception e) {
            Sentry.capture(e);
        }
    }

    private static void runSomething(String text) {

    }
}

