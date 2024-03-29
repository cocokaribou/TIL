https://docs.oracle.com/javase/tutorial/java/IandI/abstract.html
## Abstract Methods and Classes

An <i>abstract class</i> is a class that is declared `abstract`—it may or may not include abstract methods. Abstract classes cannot be instantiated, but they can be subclassed.

An <i>abstract method</i> is a method that is declared without an implementation (without braces, and followed by a semicolon), like this:

```
abstract void moveTo(double deltaX, double deltaY);
```
If a class includes abstract methods, then the class itself <i>must</i> be declared abstract, as in:
```
public abstract class GraphicObject {
   // declare fields
   // declare nonabstract methods
   abstract void draw();
}
```

> Note: Methods in an <i>interface</i> (see the Interfaces section) that are not declared as default or static are <i>implicitly</i> abstract, so the `abstract` modifier is not used with interface methods. (It can be used, but it is unnecessary.)

## Abstract Classes Compared to Interfaces

Abstract classes are similar to interfaces. You cannot instantiate them, and they may contain a mix of methods declared with or without an implementation. However, with abstract classes, you can declare fields that are not static and final, and define public, protected, and private concrete methods. With interfaces, all fields are automatically public, static, and final, and all methods that you declare or define (as default methods) are public. In addition, you can extend only one class, whether or not it is abstract, whereas you can implement any number of interfaces.

Which should you use, abstract classes or interfaces?

-   Consider using abstract classes if any of these statements apply to your situation:
    -   You want to share code among several closely related classes.
    -   You expect that classes that extend your abstract class have many common methods or fields, or require access modifiers other than public (such as protected and private).
    -   You want to declare non-static or non-final fields. This enables you to define methods that can access and modify the state of the object to which they belong.
-   Consider using interfaces if any of these statements apply to your situation:
    -   You expect that unrelated classes would implement your interface. For example, the interfaces Comparable and Cloneable are implemented by many unrelated classes.
    -   You want to specify the behavior of a particular data type, but not concerned about who implements its behavior.
    -   You want to take advantage of multiple inheritance of type.


## An Abstract Class Example
In an object-oriented drawing application, you can draw circles, rectangles, lines, Bezier curves, and many other graphic objects. These objects all have certain states (for example: position, orientation, line color, fill color) and behaviors (for example: moveTo, rotate, resize, draw) in common. Some of these states and behaviors are the same for all graphic objects (for example: position, fill color, and moveTo). Others require different implementations (for example, resize or draw). All `GraphicObjects` must be able to draw or resize themselves; they just differ in how they do it. This is a perfect situation for an abstract superclass. You can take advantage of the similarities and declare all the graphic objects to inherit from the same abstract parent object (for example, `GraphicObject`) as shown in the following figure.
<center><img src = "https://docs.oracle.com/javase/tutorial/figures/java/classes-graphicObject.gif"></center>

First, you declare an abstract class, `GraphicObject`, to provide member variables and methods that are wholly shared by all subclasses, such as the current position and the `moveTo` method. `GraphicObject` also declares abstract methods for methods, such as `draw` or `resize`, that need to be implemented by all subclasses but must be implemented in different ways. The `GraphicObject` class can look something like this:

```
abstract class GraphicObject {
    int x, y;
    ...
    void moveTo(int newX, int newY) {
        ...
    }
    abstract void draw();
    abstract void resize();
}
```
Each nonabstract subclass of `GraphicObject`, such as `Circle` and `Rectangle`, must provide implementations for the `draw` and `resize` methods:

```
class Circle extends GraphicObject {
    void draw() {
        ...
    }
    void resize() {
        ...
    }
}
class Rectangle extends GraphicObject {
    void draw() {
        ...
    }
    void resize() {
        ...
    }
}
```

___
https://www.geeksforgeeks.org/difference-between-abstract-class-and-interface-in-java/
## Difference between Abstract Class and Interface in Java

<b>Abstraction</b>: Hiding the internal implementation of the feature and only showing the functionality to the users. i.e. what it works (showing), how it works (hiding). Both abstract class and interface are used for abstraction.

<center><b>Abstract class vs Interface</b></center>

1. <b>Type of methods</b>: <u>Interface can have only abstract methods.</u> <u>Abstract class can have abstract and non-abstract methods.</u> From Java 8, it can have default and static methods also.
2. <b>Final Variables</b>: Variables declared in a Java interface are by default final. An abstract class may contain non-final variables.
3. <b>Type of variables</b>: Abstract class can have final, non-final, static and non-static variables. Interface has only static and final variables.
4. <b>Implementation</b>: <u>Abstract class can provide the implementation of interface.</u> Interface can’t provide the implementation of abstract class.
5. <b>Inheritance vs Abstraction</b>: A Java interface can be implemented using keyword “implements” and abstract class can be extended using keyword “extends”.
6. <b>Multiple implementation</b>: An interface can extend another Java interface only, an abstract class can extend another Java class and implement multiple Java interfaces.
7. <b>Accessibility of Data Members</b>: Members of a Java interface are public by default. A Java abstract class can have class members like private, protected, etc.

