/**
 * In this package we show why multiple inheritance is not allowed in Java: if a class inherits from
 * two base classes, it can happen that the two classes have a method with same name, same argument list
 * and different implementation. They might also have a field with the same name and initialized with different values.
 * In this case, which implementation can the derived class inherit? And which value to give to that field?
 * Multiple inheritance is therefore never allowed.
 * 
 * Original author: Andrea Mazzon
 * Modified by: Alessandro Sgarabottolo
 * 
 * @author Andrea Mazzon
 * @author Alessandro Sgarabottolo
 */
package com.alessandrosgarabottolo.session5.nomultipleinheritance;