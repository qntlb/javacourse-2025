package com.alessandrosgarabottolo.session5.onemorepackage;

import com.alessandrosgarabottolo.session5.packageaccessclasswithpublicmethods.APublicClass;

//import com.alessandrosgarabottolo.session5.packageaccessclasswithpublicmethods.PackageAccessClass;

public class AClassFromOutsidePackage {

	public static void main(String[] args) {

		APublicClass anObject = new APublicClass();
		anObject.aPublicMethod();
	}

}
