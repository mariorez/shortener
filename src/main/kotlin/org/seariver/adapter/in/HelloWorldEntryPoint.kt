package org.seariver.adapter.`in`

import org.seariver.protogen.HelloRequest
import org.seariver.protogen.HelloResponse
import org.seariver.protogen.HelloServiceGrpcKt.HelloServiceCoroutineImplBase
import javax.inject.Singleton

@Singleton
class HelloWorldEntryPoint : HelloServiceCoroutineImplBase() {

    override suspend fun world(request: HelloRequest): HelloResponse {
        return HelloResponse
            .newBuilder()
            .setMessage("Hi ${request.name}! Say Hello World from the MICRONAUT")
            .build()
    }
}