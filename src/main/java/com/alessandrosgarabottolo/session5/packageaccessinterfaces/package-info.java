/**
 * In this package we illustrate the case of a package access interface which 
 * is implemented by a public class. This approach is useful if we don't want to allow
 * new classes of that interface to be defined outside its package, still allowing
 * the classes of the interface -defined in the same package- to be used also outside
 * the package. In our example, our interface is implemented by a class ImplementingClass,
 * which is instead public. Outside this package, it is then possible to create objects
 * of ImplementingClass, but not import and use PackageAccessInterface. The
 * objects of ImplementingClass can call the method defined in
 * PackageAccessInterface because it is automatically public. See the code in
 * com.alessandrosgarabottolo.session5.anotherpackage.
 * 
 * Original author: Andrea Mazzon
 * Modified by: Alessandro Sgarabottolo
 * 
 * @author Andrea Mazzon
 * @author Alessandro Sgarabottolo
 */
package com.alessandrosgarabottolo.session5.packageaccessinterfaces;