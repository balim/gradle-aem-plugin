package com.cognifide.gradle.aem.instance.satisfy

import com.cognifide.gradle.aem.api.AemException

class PackageException : AemException {

    constructor(message: String, cause: Throwable) : super(message, cause)

    constructor(message: String) : super(message)

}