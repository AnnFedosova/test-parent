package net.proselyte.testui;

import javax.faces.bean.ManagedBean;

/**
 * Managed bean for home.xhtml page
 *
 * @version 1.0
 */

@ManagedBean(name = "helloWorld", eager = true)
public class HelloWorld {
    public HelloWorld() {
        System.out.println("HelloWorld started!");
    }

    public String getMessage() {
        return "Hello World!";
    }
}
