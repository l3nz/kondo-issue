# kondo-issue

Reproduce:

		$ lein clj-kondo
		src/kondo_issue/core.clj:0:0: error: can't parse src/kondo_issue/core.clj, clojure.lang.Keyword cannot be cast to java.lang.String
		src/kondo_issue/core.clj:5:12: warning: namespace clash.core is required but never used
		src/kondo_issue/core.clj:6:14: warning: namespace cheshire.core is required but never used
		src/kondo_issue/core.clj:7:14: warning: namespace clojure.spec.alpha is required but never used
		linting took 32ms, errors: 1, warnings: 3

Java:

		$ java -version
		java version "1.8.0_181"
		Java(TM) SE Runtime Environment (build 1.8.0_181-b13)
		Java HotSpot(TM) 64-Bit Server VM (build 25.181-b13, mixed mode)


Good luck!

