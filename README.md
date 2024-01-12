# maven-spotless-plugin-demo
Demonstrate issue with maven spotless plugin and Java guarded case lables using `when` in switch statements.


## Directions

- Run `make` from the root to kick of the maven spotless plugin and demonstrate the index out of bounds exception.
- Go into `pom.xml` and comment out the `eclipse` section and run `make` again to demonstrate how the exception is resolved.

## Details

Running the spotless plugin with the eclipse formatter enabled causes an index out of bounds exception when using Java 21 switch statements.
And produces and error like:

```shell
[ERROR] Failed to execute goal com.diffplug.spotless:spotless-maven-plugin:2.41.1:apply (default-cli) on project demo-app: Unable to format file /maven-spotless-plugin-demo/src/main/java/com.adase.demo/DemoSpotlessIssue.java: java.lang.reflect.InvocationTargetException: Index 106 out of bounds for length 106 -> [Help 1]
```
From debugging the maven process it appears that the issues is with processing this line:

```java
case DemoRecord d when d.x != null -> demoRecord.x();
```

## Link to switch statement docs
https://docs.oracle.com/javase/specs/jls/se21/html/jls-14.html#jls-SwitchBlock
