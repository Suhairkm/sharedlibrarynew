// MySharedLibrary.groovy
package com.example

class MySharedLibrary implements Serializable {
    def call(body) {
        def config = [:]
        body.resolveStrategy = Closure.DELEGATE_FIRST
        body.delegate = config
        body()
        return this
    }

    def mySharedFunction() {
        echo "Hello from MySharedLibrary!"
    }
}
