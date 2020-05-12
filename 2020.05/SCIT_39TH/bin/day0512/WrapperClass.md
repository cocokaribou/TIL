https://www.geeksforgeeks.org/wrapper-classes-java/

## Wrapper Class

A Wrapper class is a class whose object wraps or contains a primitive data types. When we create an object to a wrapper class, it contains a field and in this field, we can store a primitive data types. In other words, we can wrap a primitive value into a wrapper class object.


### <center>Need of Wrapper Classes</center>

- They convert primitive data types into objects. Objects are needed if we wish to modify the arguments passed into a method (because primitive types are passed by value).
- The classes in java.util package handles only objects and hence wrapper classes help in this case also.
- Data structures in the Collection framework, such as ArrayList and Vector, store only objects (reference types) and not primitive types.
- An object is needed to support synchronization in multithreading.


---
https://stackoverflow.com/questions/1570416/when-to-use-wrapper-class-and-primitive-type
### When to use wrapper class and primitive type

Generally, you should use primitive types unless you need an object for some reason (e.g. to put in a collection). Even then, consider a different approach that doesn't require a object if you want to maximize numeric performance. This is advised by [the documentation](https://docs.oracle.com/javase/1.5.0/docs/guide/language/autoboxing.html), that demonstrates how auto-boxing can cause a large performance difference.
</br>
</br>

