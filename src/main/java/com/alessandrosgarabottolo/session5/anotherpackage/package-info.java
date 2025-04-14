/**
 * In this package we illustrate the meaning of an interface with package access:
 * we have a tester class, with a main method that is able to create an object of the public class
 * ImplementingClass, which implements the interface PackageAccessInterface, both in the package
 * com.alessandrosgarabottolo.session5.packageaccessinterfaces. The method implemented by ImplementingClass 
 * is public, since the methods of an interface are automatically public, so we can call it from here.
 * However, it is not possible to import the interface itself, because it has only package access.
 * 
 * Original author: Andrea Mazzon
 * Modified by: Alessandro Sgarabottolo
 * 
 * @author Andrea Mazzon
 * @author Alessandro Sgarabottolo
 */
package com.alessandrosgarabottolo.session5.anotherpackage;