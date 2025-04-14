/**
 * Here we show how multiple implementation is possible with interfaces: the class Duck implements
 * both the interfaces AnimalThatFlies (that has a method fly()) and AnimalThatSwims (that has a method
 * swim()).
 * Remember that multiple inheritance is not possible with classes, because the parent classes
 * might have methods with same name and same argument lists implemented in different ways. Here we don't have
 * this problem because these interfaces are a kind of "full abstract classes", so no implementation is
 * given. We see in com.alessandrosgarabottolo.session5.multipleinterfaceimplementation.nameclasheswithinterfaces
 * that some problems may arise if the methods have different return type. Here we see a possible clash for
 * the values of fields (remember that interfaces can have fields, and they are implicitly static and final).
 * 
 * Original author: Andrea Mazzon
 * Modified by: Alessandro Sgarabottolo
 * 
 * @author Andrea Mazzon
 * @author Alessandro Sgarabottolo
 */
package com.alessandrosgarabottolo.session5.multipleinterfaceimplementation.animals;