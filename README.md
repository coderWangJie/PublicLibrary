本工程用来演示将代码放在Github上，制作成公开库，可通过gradle引用来使用。以下是操作过程记录：

（1）新建一个Android Studio的Android工程；

（2）在工程中新建一个Android Library类型的Module、一个Java Library类型的Module；

（3）在工程的根build.gradle对应位置添加 

```
buildscript { 
  dependencies {
    classpath 'com.github.dcendents:android-maven-gradle-plugin:2.1' // Add this line
  }
```

(4)