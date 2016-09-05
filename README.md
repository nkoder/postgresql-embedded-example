postgresql-embedded-example
===========================

Minimal example of Spring Boot application with embedded
Postgresql used in tests.

run tests outside Docker
------------------------

1. Install JDK 8 and run `./gradlew clean test`
   (on OS X or linux)

run tests inside Docker
-----------------------

1. Install Docker (or `docker-machine` on OS X)

2. Remove previously built Docker image (if any). 
   Provided `Dockerfile` seems to not detect changes in
   code in proper way so only "full" rebuild guarantees
   that we run tests from the most recent codebase.
   
3. Prepare docker image and run tests with: `docker build .`

