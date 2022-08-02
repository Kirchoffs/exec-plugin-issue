What I am trying to do, is to create a java class (PrimitiveServlet.class) file, and then use URLClassLoader to load this class file dynamically.  

To reproduce the bug using exec-maven-plugin, run the following command:
```
>> javac -cp webroot/javax.servlet-api-4.0.1.jar webroot/PrimitiveServlet.java
>> mvn clean install
>> mvn exec:java
```

However, if we use pure java command to run the program, the code can work:
```
>> javac -cp webroot/javax.servlet-api-4.0.1.jar webroot/PrimitiveServlet.java
>> mvn clean install
>> java -cp webroot/javax.servlet-api-4.0.1.jar:target/exec-plugin-issue-1.0-SNAPSHOT.jar org.syh.demo.App
```