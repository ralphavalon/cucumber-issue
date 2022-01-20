# cucumber-issue

### This project is an example of a Cucumber issue in order to get it fixed

#### About the project

* Maven 3
* Java 15

You can build it using Docker:

`docker run -it --rm -v "$(pwd)":/usr/src/mymaven -w /usr/src/mymaven maven:3-adoptopenjdk-15 mvn clean package`

And you can also run using Docker:

`docker run -v "$PWD":/home -w /home openjdk:15-jdk java -jar target/demo-0.0.1-SNAPSHOT-fat-testjar.jar`

#### About the issue

* Versions that the issue happens:

From 7.1.0 to 7.2.3 (latest so far)

* Versions that the issue doesn't happen:

7.0.0 (Didn't test previous versions)

* Instructions on how to reproduce:

See the "About the project" session to build it and run it

* Stacktrace

```
io.cucumber.core.exception.CucumberException: class com.demo.project.DemoParentSteps does not have a public zero-argument constructor.

To use dependency injection add an other ObjectFactory implementation such as:
 * cucumber-picocontainer
 * cucumber-spring
 * cucumber-jakarta-cdi
 * ...etc

        at io.cucumber.core.backend.DefaultObjectFactory.cacheNewInstance(DefaultObjectFactory.java:57)
        at io.cucumber.core.backend.DefaultObjectFactory.getInstance(DefaultObjectFactory.java:45)
        at io.cucumber.java.AbstractGlueDefinition.invokeMethod(AbstractGlueDefinition.java:47)
        at io.cucumber.java.JavaStepDefinition.execute(JavaStepDefinition.java:29)
        at io.cucumber.core.runner.CoreStepDefinition.execute(CoreStepDefinition.java:66)
        at io.cucumber.core.runner.PickleStepDefinitionMatch.runStep(PickleStepDefinitionMatch.java:63)
        at io.cucumber.core.runner.ExecutionMode$1.execute(ExecutionMode.java:10)
        at io.cucumber.core.runner.TestStep.executeStep(TestStep.java:86)
        at io.cucumber.core.runner.TestStep.run(TestStep.java:57)
        at io.cucumber.core.runner.PickleStepTestStep.run(PickleStepTestStep.java:51)
        at io.cucumber.core.runner.TestCase.run(TestCase.java:95)
        at io.cucumber.core.runner.Runner.runPickle(Runner.java:75)
        at io.cucumber.core.runtime.Runtime.lambda$executePickle$6(Runtime.java:128)
        at io.cucumber.core.runtime.CucumberExecutionContext.lambda$runTestCase$3(CucumberExecutionContext.java:146)
        at io.cucumber.core.runtime.RethrowingThrowableCollector.executeAndThrow(RethrowingThrowableCollector.java:23)
        at io.cucumber.core.runtime.CucumberExecutionContext.runTestCase(CucumberExecutionContext.java:146)
        at io.cucumber.core.runtime.Runtime.lambda$executePickle$7(Runtime.java:128)
        at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:515)
        at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
        at io.cucumber.core.runtime.Runtime$SameThreadExecutorService.execute(Runtime.java:249)
        at java.base/java.util.concurrent.AbstractExecutorService.submit(AbstractExecutorService.java:118)
        at io.cucumber.core.runtime.Runtime.lambda$runFeatures$3(Runtime.java:110)
        at java.base/java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:195)
        at java.base/java.util.stream.SliceOps$1$1.accept(SliceOps.java:199)
        at java.base/java.util.ArrayList$ArrayListSpliterator.tryAdvance(ArrayList.java:1602)
        at java.base/java.util.stream.ReferencePipeline.forEachWithCancel(ReferencePipeline.java:127)
        at java.base/java.util.stream.AbstractPipeline.copyIntoWithCancel(AbstractPipeline.java:502)
        at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:488)
        at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
        at java.base/java.util.stream.ReduceOps$ReduceOp.evaluateSequential(ReduceOps.java:913)
        at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
        at java.base/java.util.stream.ReferencePipeline.collect(ReferencePipeline.java:578)
        at io.cucumber.core.runtime.Runtime.runFeatures(Runtime.java:111)
        at io.cucumber.core.runtime.Runtime.lambda$run$0(Runtime.java:82)
        at io.cucumber.core.runtime.Runtime.execute(Runtime.java:94)
        at io.cucumber.core.runtime.Runtime.run(Runtime.java:80)
        at io.cucumber.core.cli.Main.run(Main.java:87)
        at com.demo.project.TestRunner.main(TestRunner.java:18)
Caused by: java.lang.NoSuchMethodException: com.demo.project.DemoParentSteps.<init>()
        at java.base/java.lang.Class.getConstructor0(Class.java:3508)
        at java.base/java.lang.Class.getConstructor(Class.java:2244)
        at io.cucumber.core.backend.DefaultObjectFactory.cacheNewInstance(DefaultObjectFactory.java:52)
        ... 37 more
```
