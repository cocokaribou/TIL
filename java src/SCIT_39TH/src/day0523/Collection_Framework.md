https://docs.oracle.com/javase/8/docs/technotes/guides/collections/overview.html

## Collection Framework Overview

The collections framework consists of:

-   <b>Collection interfaces</b>. Represent different types of collections, such as sets, lists, and maps. These interfaces form the basis of the framework.
General-purpose implementations. Primary implementations of the collection interfaces.
-   <b>Legacy implementations</b>. The collection classes from earlier releases, Vector and Hashtable, were retrofitted to implement the collection interfaces.
Special-purpose implementations. Implementations designed for use in special situations. These implementations display nonstandard performance characteristics, usage restrictions, or behavior.
-   <b>Concurrent implementations</b>. Implementations designed for highly concurrent use.
-   <b>Wrapper implementations</b>. Add functionality, such as synchronization, to other implementations.
-   <b>Convenience implementations</b>. High-performance "mini-implementations" of the collection interfaces.
-   <b>Abstract implementations</b>. Partial implementations of the collection interfaces to facilitate custom implementations.
-   <b>Algorithms</b>. Static methods that perform useful functions on collections, such as sorting a list.
-   <b>Infrastructure</b>. Interfaces that provide essential support for the collection interfaces.
-   <b>Array Utilities</b>. Utility functions for arrays of primitive types and reference objects. Not, strictly speaking, a part of the collections framework, this feature was added to the Java platform at the same time as the collections framework and relies on some of the same infrastructure.

____

geeksforgeeks.org/vector-vs-arraylist-java/

## Vector vs ArrayList in Java

ArrayList and Vectors both implement the List interface and both use <b>(dynamically resizable) arrays</b> for its internal data structure, much like using an ordinary array.
Syntax:
```
   ArrayList<T> al = new ArrayList<T>();
   Vector<T> v = new Vector<T>(); 
```

Major Differences between ArrayList and Vector:

1. <b>Synchronization</b> : <u>Vector is synchronized</u>, which means only one thread at a time can access the code, while <u>arrayList is not synchronized</u>, which means multiple threads can work on arrayList at the same time. For example, if one thread is performing an add operation, then there can be another thread performing a remove operation in a multithreading environment.
If multiple threads access arrayList concurrently, then we must synchronize the block of the code which modifies the list structurally, or alternatively allow simple element modifications. Structural modification means addition or deletion of element(s) from the list. Setting the value of an existing element is not a structural modification.

<center><img src="https://media.geeksforgeeks.org/wp-content/uploads/ArrayList-vs-Vector-Java.png"></center>

2. <b>Performance: ArrayList is faster</b>, since it is non-synchronized, while vector operations give slower performance since they are synchronized (thread-safe). If one thread works on a vector, it has acquired a lock on it, which forces any other thread wanting to work on it to have to wait until the lock is released.
3. <b>Data Growth</b>: ArrayList and Vector both grow and shrink dynamically to maintain optimal use of storage – <u>but the way they resize is different.</u> ArrayList increments 50% of the current array size if the number of elements exceeds its capacity, while vector increments 100% – essentially doubling the current array size.
4. <b>Traversal</b>: Vector can use both <b>Enumeration and Iterator</b> for traversing over elements of vector while ArrayList can only use Iterator for traversing.

<i>Note: ArrayList is preferable when there is no specific requirement to use vector.</i>
</br>
</br>
</br>

<b>How to choose between ArrayList and Vector?</b>

-   ArrayList is unsynchronized and not thread-safe, whereas Vectors are. Only one thread can call methods on a Vector at a time, which is a slight overhead, but helpful when safety is a concern. Therefore, in a single-threaded case, arrayList is the obvious choice, but where multithreading is concerned, vectors are often preferable.
-   If we don’t know how much data we are going to have, but know the rate at which it grows, Vector has an advantage, since we can set the increment value in vectors.
-   ArrayList is newer and faster. If we don’t have any explicit requirements for using either of them, we use ArrayList over vector.