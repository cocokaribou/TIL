## Literal vs Constant  

A **literal** is a value that expressed as itself rather than as a variable's value or the result of an expression,  
such as number `3` or the string `"hello"`.  
A **constant** is a meaningful name that takes the place of a literal and retains the same value throughout the program, as opposed to variable, whose value may change.
 

```java
int meh = 8;
```
The literal is 8, but the variable is meh. meh HOLDS the literal 8 until it is changed.  
  
However, a CONSTANT needs to have the **"final"** keyword, which means that it doesn't change.  
Also, it is convention (but not required) that a constant be all capital letters (for naming purposes).  
The following are vaild constants:

```java
final int WIDTH = 640;
static final height = 480;
public static final int TheConstant = 131;
```

Notice that the "static" and the "public" qualifiers are not required, but they are commonly seen in constants, so I included them.  
However, to be a true constant, the "final" shall be there.  
  
  
April.10.2020
https://www.dreamincode.net/forums/topic/203631-constants-vs-literals/      
  
