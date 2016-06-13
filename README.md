- https://github.com/typesafehub/migration-manager/issues/118
- https://github.com/scalaz/scalaz/commit/64f8e822d558f3d61ae7aa79297818cdb2d51c4d
- https://github.com/scalaz/scalaz/commit/0495ae2ed90c8541dcacba25d9673d229ac8c846

- https://github.com/scalaz/scalaz/blob/v7.1.0/core/src/main/scala/scalaz/syntax/Syntax.scala
- https://github.com/scalaz/scalaz/blob/v7.1.1/core/src/main/scala/scalaz/syntax/Syntax.scala

- https://travis-ci.org/xuwei-k/mima-bug-118-scalaz/builds/137150003


```
[info] Running com.example.Main 
java.lang.AbstractMethodError: com.example.ToTypeClassOps0$.ToAssociativeOps(Ljava/lang/Object;Lscalaz/Associative;)Lscalaz/syntax/AssociativeOps;
        at com.example.Main$.main(Main.scala:10)
        at com.example.Main.main(Main.scala)
        at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
        at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
        at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
        at java.lang.reflect.Method.invoke(Method.java:498)
        at sbt.Run.invokeMain(Run.scala:67)
        at sbt.Run.run0(Run.scala:61)
        at sbt.Run.sbt$Run$$execute$1(Run.scala:51)
        at sbt.Run$$anonfun$run$1.apply$mcV$sp(Run.scala:55)
        at sbt.Run$$anonfun$run$1.apply(Run.scala:55)
        at sbt.Run$$anonfun$run$1.apply(Run.scala:55)
        at sbt.Logger$$anon$4.apply(Logger.scala:84)
        at sbt.TrapExit$App.run(TrapExit.scala:248)
        at java.lang.Thread.run(Thread.java:745)
[error] (run-main-0) java.lang.AbstractMethodError: com.example.ToTypeClassOps0$.ToProChoiceVFromKleisliLike(Ljava/lang/Object;Lscalaz/ProChoice;)Lscalaz/syntax/ProChoiceOps;
java.lang.AbstractMethodError: com.example.ToTypeClassOps0$.ToProChoiceVFromKleisliLike(Ljava/lang/Object;Lscalaz/ProChoice;)Lscalaz/syntax/ProChoiceOps;
        at com.example.Main$.main(Main.scala:19)
        at com.example.Main.main(Main.scala)
        at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
        at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
        at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
        at java.lang.reflect.Method.invoke(Method.java:498)
[trace] Stack trace suppressed: run last b/compile:run for the full output.
java.lang.RuntimeException: Nonzero exit code: 1
        at scala.sys.package$.error(package.scala:27)
[trace] Stack trace suppressed: run last b/compile:run for the full output.
[error] (b/compile:run) Nonzero exit code: 1
```
