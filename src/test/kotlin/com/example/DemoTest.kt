package com.example

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import io.micronaut.serde.ObjectMapper
import io.micronaut.test.extensions.kotest5.annotation.MicronautTest
import java.time.LocalDate
import java.time.OffsetDateTime

@MicronautTest
class DemoTest(private val objectMapper: ObjectMapper) : StringSpec({

    "test the server is running" {
        val product = Product(
            a0 = "a0",
            a1 = 1,
            a2 = "a2",
            a3 = 3,
            a4 = "a4",
            a5 = 5,
            a6 = "a6",
            a7 = 7,
            a8 = "a8",
            a9 = 9,
            a10 = "a10",
            a11 = 11,
            a12 = "a12",
            a13 = 13,
            a14 = "a14",
            a15 = 15,
            a16 = "a16",
            a17 = 17,
            a18 = "a18",
            a19 = 19,
            a20 = "a20",
            a21 = 21,
            a22 = "a22",
            a23 = 23,
            a24 = "a24",
            a25 = 25,
            a26 = "a26",
            a27 = 27,
            a28 = "a28",
            a29 = 29,
            a30 = 1,
            a31 = "a31",
            a32 = LocalDate.now(),
            a33 = OffsetDateTime.now(),
            a34 = "a34",
            a35 = 35,
            a36 = "a36",
            a37 = 37,
            a38 = "a38",
            a39 = 39,
        )
        val json = objectMapper.writeValueAsString(product)
        println(json)

        val result = objectMapper.readValue(json, Product::class.java)
        println(result)

        result shouldBe product
    }
})
