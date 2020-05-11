https://stackoverflow.com/questions/19359548/setter-methods-or-constructors

# Constuctor vs Setter Method

> so far I have seen two approaches of setting a variable's value in Java. >Sometimes a constructor with arguments is used, others setter methods are used >to set the value of each variable.
></br></br>I know that a constructor initialises an instance variable inside a >class once a class is instantiated using the "new" Keyword.
></br></br>But when do we use constructors and when do we use setters?

</br>
First, let's start with some concepts. I hope this explanation helps everybody that want to know when to use constructors or setters() and getters() methods (Accessors and Mutators).
</br>
<b>Constructors</b> are similar to <b>Methods</b>, however there are few differences between constructor and method in java:

1) <b>Constructor</b> is used to initialize the state of an object. <b>Method</b> is used to expose behaviour of an object.

2) <b>Constructor</b> must not have return type. <b>Method</b> must have return type.

3) <b>Constructor</b> is invoked implicitly. <b>Method</b> is invoked explicitly.

4) <b>Getters()</b>, or accessors, are methods that provide access to an object's instance variables. <b>Setters()</b>, or mutators, are methods that provide the caller with an opportunity to update the value of a particular instance variable.

Having this clear, let's think in term of Object Oriented Programming (OOP), to meet the requirement of OOP principals (The Objects Oriented Programming (OOP) is constructed over four major principles: <b>Encapsulation, Data Abstraction, Polymorphism</b> and <b>Inheritance</b>.), Getter() and Setter() methods is the key to achieve this.

Here is a formula that is going to show you what I mean:

> Private fields + Public accessors == Encapsulation;

As you can see based on this formula when we set private fields and use public accesors we are performing encapsulation one of the 4 OOP principals.

Here I am going to provide you two classes, I added comment on it to try to make my code self explaining. Take these classes as a lab on methods with `Customer` and `TestCustomer` [the one with the `main()` method] classes, you can copy the code and run it yourself. Note I used two constructors in order to explain a class having multiple constructors and having public `setters()` and `getters()` methods in order to access private instance variables:

```java
package com.exercise.lecture2;

/**
 * 1) Create a Customer class that has the following attributes:
 * name, SSN.
 * 2) This class should have two methods: getName() and getSSN().
 * 3) If the class is instantiated with only a SSN, then give the default name of "John Doe". (HINT: Use two constructors)
 * 4) Also, add a method toString(), that returns a string representation of the customer object (name and SSN concatenated).
 *      Make sure to set this method public.
 * 5) Create a class to test your program (e.g. a class that include the main() method). In your test program, instantiate
 *      three customers and print out the value using toString() method.
 * 
 * @author Samuel M.
 *
 */

//this class is complemented with class  TestLabCustomer.java
public class LabCustomer {

// Private filds: name and socialSecurityNum
    private String name;
    private int socialSecurityNum;

    // constructors
    public LabCustomer(String name, int socialSecurityNum) {
        this.name = name;
        this.socialSecurityNum = socialSecurityNum;
    }

    /** The keyword 'this' can be used to call a constructor from a constructor,
     * when writing several constructor for a class, there are times when
     * you'd like to call one constructor from another to avoid duplicate code.
     */
    // Account with This() on a second constructor
    public LabCustomer(int socialSecurityNum) {
        this("John Doe", socialSecurityNum); // default name is printed if only the SSN is provided
    }

    // Public accessors (getters and setters)
    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    int getSSN() {
        return socialSecurityNum;
    }

    void setSSN(int socialSecurityNum) {
        this.socialSecurityNum = socialSecurityNum;
    }


    // instance method
    public String toString() { //overriding the toString() method 
        return ("Customer name: " + getName() + ", SSN#: " + getSSN() ); // concatenating the name and SSN

    }
}
```

Here is the test class, the one that has the `main()` method and calling an instance method after instantiating an object of the previews class

```java
package com.exercise.lecture2;

//this class is complemented with class  LabCustomer.java
public class TestLabCustomer {

    public static void main(String[] args) {
        // Instantiating an object of class LabCustomer and creating three customers objects
        LabCustomer cust1 = new LabCustomer("Juan Melendez", 123457789);
        LabCustomer cust2 = new LabCustomer("Mary Lee", 125997536);
        LabCustomer cust3 = new LabCustomer(124963574); // when instantiating with no "name", the default (John Doe) is printed 

        /**
         * Once you've instantiated an object and have an object variable,
         * you can use object variable to call an instance method. 
         *  e.g.:
         *  object variables: cust1, cust2, cust3
         *  call the method toString() using the object variable and dot [.] in order to perform the method call.
         */
        // calling method toString() in class LabCustomer to print customer values
        System.out.println(cust1.toString());
        System.out.println(cust2.toString());
        System.out.println(cust3.toString());

    }

}
```
> result:
> 
> Customer name: Juan Melendez, SSN#: 123457789
> 
> Customer name: Mary Lee, SSN#: 125997536
> 
> Customer name: John Doe, SSN#: 124963574

