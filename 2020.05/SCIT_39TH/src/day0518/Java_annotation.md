https://docs.oracle.com/javase/tutorial/java/annotations/

<i>Annotations</i>, a form of metadata, provide data about a program that is not part of the program itself. Annotations have no direct effect on the operation of the code they annotate.

Annotations have a number of uses, among them:

- <b>Information for the compiler</b> — Annotations can be used by the compiler to detect errors or suppress warnings.
- <b>Compile-time and deployment-time processing</b> — Software tools can process annotation information to generate code, XML files, and so forth.
- <b>Runtime processing</b> — Some annotations are available to be examined at runtime.

This lesson explains where annotations can be used, how to apply annotations, what predefined annotation types are available in the Java Platform, Standard Edition (Java SE API), how type annnotations can be used in conjunction with pluggable type systems to write code with stronger type checking, and how to implement repeating annotations.

______

https://en.wikipedia.org/wiki/Java_annotation

### Built-in annotations

Java defines a set of annotations that are built into the language. Of the seven standard annotations, three are part of java.lang, and the remaining four are imported from java.lang.annotation.[5][6]

<b>Annotations applied to Java code:</b>

`@Override` - Checks that the method is an override. Causes a compilation error if the method is not found in one of the parent classes or implemented interfaces.</br>
`@Deprecated` - Marks the method as obsolete. Causes a compile warning if the method is used.</br>
`@SuppressWarnings` - Instructs the compiler to suppress the compile time warnings specified in the annotation parameters.

<b>Annotations applied to other annotations (also known as "Meta Annotations"):</b>

`@Retention` - Specifies how the marked annotation is stored, whether in code only, compiled into the class, or available at runtime through reflection.</br>
`@Documented` - Marks another annotation for inclusion in the documentation.</br>
`@Target` - Marks another annotation to restrict what kind of Java elements the annotation may be applied to.</br>
`@Inherited` - Marks another annotation to be inherited to subclasses of annotated class (by default annotations are not inherited to subclasses).</br>

Since Java 7, three additional annotations have been added to the language.

`@SafeVarargs` - Suppress warnings for all callers of a method or constructor with a generics varargs parameter, since Java 7.</br>
`@FunctionalInterface` - Specifies that the type declaration is intended to be a functional interface, since Java 8.
`@Repeatable` - Specifies that the annotation can be applied more than once to the same declaration, since Java 8.


