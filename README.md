# My Backend Scala Play Hello World Program

## Challenge

Implement this application to retrieve a greeting message from a connector called `GreetingConnector.scala`.

Following the [Model View Controller(MVC)](https://www.playframework.com/documentation/1.0/main) pattern, keep in mind the [separation of concerns](https://dev.to/marie_berezhna/separation-of-concerns-a-fundamental-principle-in-software-development-oaj) between our modules. I.e. we should have a `GreetingService.scala` that will
allow communication between the `GreetingController.scala` and the `GreetingConnector.scala`.

### Test Driven Development

You are encouraged to use [Test Driven Development(TDD)](https://martinfowler.com/bliki/TestDrivenDevelopment.html) in order to arrive at a solution with confidence of covering most, if not all edge cases. There is an integration test: `it/src/test/scala/greeting/GreetingSpec.scala`.

And there is a unit test: `test/controllers/HelloControllerSpec.scala` that you can start with.

Feel free to use TDD and make them pass and let the test guide you to resolve the problem.

## To build the app

```bash
sbt compile
```

## To run unit tests on the app

```bash
sbt test
```

## To run integration tests on the app

```bash
sbt integration/test
```

## To run all the tests on the app

```bash
sbt test integration/test
```
