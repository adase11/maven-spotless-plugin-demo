# maven-spotless-plugin-demo
Demonstrate issue with maven spotless plugin and Java 21 switch statements


## Directions

- Run `make` from the root to kick of the maven spotless plugin and demonstrate the index out of bounds exception.
- Go into `pom.xml` and comment out the `eclipse` section and run `make` again to demonstrate how the exception is resolved.
