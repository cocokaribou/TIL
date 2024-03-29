https://docs.oracle.com/javase/7/docs/api/java/lang/Object.html

java.lang</br>
<font size =5> Class Object</font></br>
java.lang.Object
___

`public class Object`</br>
Class `Object` is the root of the class hierarchy. Every class has `Object` as a superclass. All objects, including arrays, implement the methods of this class.

<font size = 3> Constructor Summary</font></br>

| Object()          |
|-------------------|

<font size = 3>Method Summary</font></br>
| Modifier and Type | Method and Description object.                                                                                                                                                                                                              
|------------------|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
| protected Object | <b>clone()</b></br>Creates and returns a copy of this
| boolean          | <b>equals(Object obj)</b></br>Indicates whether some other object is "equal to" this one.                                                                                                                                                                               
| protected void   | <b>finalize()</b></br>Called by the garbage collector on an object when garbage collection determines that there are no more references to the object.                                                                                                                  
| Class<?>         | <b>getClass()</b></br>Returns the runtime class of this Object.                                                                                                                                                                                                         
| int              | <b>hashCode()</b></br>Returns a hash code value for the object.                                                                                                                                                                                                         
| void             | <b>notify()</b></br>Wakes up a single thread that is waiting on this object's monitor.                                                                                                                                                                                  
| void             | <b>notifyAll()</b></br>Wakes up all threads that are waiting on this object's monitor.                                                                                                                                                                                  
| String           | <b>toString()</b></br>Returns a string representation of the object.                                                                                                                                                                                                    
| void             | <b>wait()</b></br>Causes the current thread to wait until another thread invokes the notify() method or the notifyAll() method for this object.                                                                                                                         
| void             | <b>wait(long timeout)</b></br>Causes the current thread to wait until either another thread invokes the notify() method or the notifyAll() method for this object, or a specified amount of time has elapsed.                                                           
| void             | <b>wait(long timeout, int nanos)</b></br>Causes the current thread to wait until another thread invokes the notify() method or the notifyAll() method for this object, or some other thread interrupts the current thread, or a certain amount of real time has elapsed.