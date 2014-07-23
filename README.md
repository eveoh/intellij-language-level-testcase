IntelliJ Language Level Testcase
================================

Testcase for IntelliJ Language Level bug: http://youtrack.jetbrains.com/issue/IDEA-127727

The module 'seven' uses language level 7.0 (JDK 1.7). The module 'eight' uses language level 8.0 (JDK 1.8) and depends on module 'seven'.

The 'Main' class (in module 'eight') compiles fine, but shows errors in IntelliJ.

Problem replicated with:
* IntelliJ 13.1.4 (Build #IU-135.1230)
* IntelliJ 14 EAP (Build #IU-138.1029)

Failure:
![IntelliJ 14 EAP 138.1029](https://raw.github.com/eveoh/intellij-language-level-testcase/master/intellij-14-eap-138-1029.png)
