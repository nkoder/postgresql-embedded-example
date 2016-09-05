FROM java:8

WORKDIR /example

ADD build.gradle /example/build.gradle
ADD gradlew /example/gradlew
ADD gradle  /example/gradle
ADD . /example

RUN /example/gradlew clean test
