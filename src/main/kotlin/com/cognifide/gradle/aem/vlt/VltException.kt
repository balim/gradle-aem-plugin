package com.cognifide.gradle.aem.vlt

import com.cognifide.gradle.aem.AemException

class VltException : AemException {

    constructor(message: String, cause: Throwable) : super(message, cause)

    constructor(message: String) : super(message)

}
