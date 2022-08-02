package org.syh.demo;

import java.net.URL;
import java.net.URLClassLoader;

import javax.servlet.Servlet;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String protocol = "file:";
        String resourcePath = System.getProperty("user.dir") + "/webroot/";
        String servletName = "PrimitiveServlet";

        URLClassLoader loader = null;
        try {
            URL url = new URL(protocol + resourcePath);
            URLClassLoader ucl = new URLClassLoader(new URL[] { url });
            
            Class<?> servletClass = ucl.loadClass(servletName);
            Servlet servlet = (Servlet) servletClass.getDeclaredConstructor().newInstance();
            System.out.println("servlet created successfully");
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
