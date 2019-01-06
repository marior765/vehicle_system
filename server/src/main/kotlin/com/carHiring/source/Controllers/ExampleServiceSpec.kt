object ExampleServiceSpec : Spek({
    describe("a very good service") {
        val exampleService = ExampleService()

        it("should return the correct value") {
            val value = exampleService.getSomeValue()

            // hamkrest lets us write assertions that read like a normal sentence
            assert.that(value.message, equalTo("Hello World!") and startsWith("Hello"))
        }

        it("should not return the not correct value") {
            val value = exampleService.getSomeValue()

            assert.that(value.message, !equalTo("Something completely different!"))
        }
    }
})