/**
 * Is it meaningful to define a package access class with public methods? This package, together with
 * com.alessandrosgarabottolo.session5.onemorepackage provides an example of this situation.
 * The idea is that for some reason we may want to prevent the creation of an object of type
 * PackageAccessClass outside of the package, therefore we create APublicClass which inherits
 * from PackageAccessClass and we can call the public method defined therein from outside the package.
 */

package com.alessandrosgarabottolo.session5.packageaccessclasswithpublicmethods;