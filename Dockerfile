FROM java:8

WORKDIR /example

ADD build.gradle /example/build.gradle
ADD gradlew /example/gradlew
ADD gradle  /example/gradle
ADD . /example

# According to https://github.com/yandex-qatools/postgresql-embedded we cannot use root to run embedded Postgresql
RUN useradd -ms /bin/bash user_who_is_not_root
RUN chown -Rv user_who_is_not_root /example/
USER user_who_is_not_root

RUN /example/gradlew clean test
