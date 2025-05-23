package com.alessandrosgarabottolo.session5.inheritinginterfaces;

/**
 * This class illustrates how to work with multiple inheritance of interfaces, and how polymorphism
 * works in this case.
 */
public class MakingCalls {

	/**
	 * @param first, object of a class implementing FirstInterface. Note that it can
	 *               also take objects of classes implementing InheritingInterface:
	 *               it makes sense, because they can also call firstMethod().
	 */
	public static void callerToFirstInterface(FirstInterface first) {
		first.firstMethod();
	}

	/**
	 * @param second, object of a class implementing SecondInterface. Note that it
	 *                can also take objects of classes implementing InheritingInterface:
	 *                it makes sense, because they can also call secondMethod().
	 */
	public static void callerToSecondInterface(SecondInterface second) {
		second.secondMethod();
	}

	/**
	 * @param inheriting, object of a class implementing InheritingInterface: it has to
	 *                    be able to call all the three methods.
	 */
	public static void callerToInheritingInterface(InheritingInterface inheriting) {
		inheriting.firstMethod(); // inherited from FirstInterface
		inheriting.secondMethod(); // inherited from SecondInterface
		inheriting.thirdMethod(); // specific of InheritingInterface
	}
	
	/**
	 * @param theClassObject, object of a class implementing InheritingInterface: it has to
	 *                        be able to call all the three methods.
	 */
	public static void callerToInheritingAndImplementingClass(InheritingAndImplementingClass theClassObject) {
		theClassObject.firstMethod();
		theClassObject.secondMethod();
		theClassObject.thirdMethod();
		theClassObject.aClassMethod();
	}

	/**
	 * @param objectOfFirstClass, object of the class FirstClass. Note: it can also take an object of
	 *           InheritingAndImplementingClass, which extends FirstClass.
	 */
	public static void callerToFirstClass(FirstClass objectOfFirstClass) {
		objectOfFirstClass.aClassMethod();
	}

	public static void main(String[] args) {
		InheritingAndImplementingClass inheritingAndImplementingClass = new InheritingAndImplementingClass();
		// note how the object given in input gets implicitly upcasted everytime
		callerToFirstInterface(inheritingAndImplementingClass);
		System.out.println();
		
		callerToSecondInterface(inheritingAndImplementingClass);
		System.out.println();
		
		callerToInheritingInterface(inheritingAndImplementingClass);
		System.out.println();
		
		callerToFirstClass(inheritingAndImplementingClass);
		System.out.println();
		
		callerToInheritingAndImplementingClass(inheritingAndImplementingClass);
		System.out.println();
		
		System.out.println("Now a class that only implements the first interface:");
		ClassImplementingFirstInterface firstInterfaceObject = new ClassImplementingFirstInterface();
		callerToFirstInterface(firstInterfaceObject);
//		callerToSecondInterface(firstInterfaceObject);//FAIL!
//		callerToInheritingInterface(firstInterfaceObject);//FAIL!

	}
}
