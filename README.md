# Distributed Systems Lecture - Summer Semester 2023 - HSE

## Session 13-Mar-2023 Distributed Systems & Cloud Computing Introduction

### Intro questions:

* Which technologies or what do you have in mind in general if you think about "distributed systems"?
* the "WHY" - Why would people use and implement a distributed systems architecture?

![Initial Brainstorm Mindmap](pics/intro-distributed-systems-mindmap.png)
![Initial Brainstorm Diagram](pics/intro-distributed-systems-diagram.png)

### Student questions:

* How does the topic of Spring Boot relate to Distibuted Systems?
* What are reasons to not do Distributed Systems?
* How does Function as a Service work and what are sample uses cases?

## Session 20-Mar-2023 Intro to Cloud-based IDEs and Container Technology

* What are containers and how do they work?
* Containers vs. VMs
* History of containers and rise of Docker
* Docker concepts: daemon, hub, dockerfile, CLI
* Running containers with various options

### Objectives

_The student understands the concepts and use cases of container technology and is able to describe them. The first exercise is to pull sample images from an image registry (e.g. Docker Hub) and interact with them (run, expose port, execute shell, cleanup etc). After that the student can show how to build a custom image via Dockerfile and push it to a registry for others to access. Complete the exercises handed out via URL._

### Exercises/Lab task

* Create or get yourself a Docker Id (https://www.docker.com)
* Get a github or gitlab id. A public one, please :-)
* Do the container lab given at: https://hsexd.new.trainings.nvtc.io/ (up until Networks)
* Create a docker-compose file to start all 3 containers in the exercise
* Optional: Externalize

![Overview Client - GitPod - GitHub - Docker Hub](pics/gitpod_scope.png)

### Review questions

* "WHY" Containers? List advantages/disadvantages ..
* What is the difference between a container and a VM? List 3 criteria
* Which technologies led to the evolution of docker (and why)? 
* What is the difference between a docker daemon and the docker hub? 
* What is the difference between docker run, docker pull and docker start?
* Which command transitions from a container instance to an image?
* What are the Docker components and describe them? (Rephrase!)
* What does docker exec do? Provide a pseudo-code example and explain what it does 
* Explain the container latest tag

## Session 27-Mar-2023 Docker/Container Wrap-Up & Labs

* Docker storage
* Docker networks
* docker-compose

### Exercises/Lab task

* Finish the container lab given at: https://hsexd.new.trainings.nvtc.io/ (up until Networks)
* Create a docker-compose file to start all 3 containers in the exercise
* Optional: Externalize the database storage to the filesystem outside of the container

![Review questions container](pics/blackboard-23-04-02.jpg)

## Session 03-April-23 Introduction to Spring Boot

* Background: Spring Framework - History & components
* Spring ← → Spring Boot
* Spring Initializr (start.spring.io) & starter dependencies
* Basic project structure (folders, configuration ..)
* "Hello, World!" example explained
* Using Actuator

![Spring Boot Initializr Flow](pics/spring_boot_initializr_flow.png)

### Objectives

The student is able to build and configure an own Spring Boot application from scratch with the IDE of choice. The exercise is to build an own "Hello, World!" application that exposes various - endpoints and is able to execute CRUD operations on the state of the application. Optional: Add logging and testing, configure Actuator.

### Exercises

Application:

* Build your own first Spring Boot Hello, World application at 
* https://start.spring.io
* Change name, Java version, build tool, dependencies. Observe changes
* Use the following deps: Web, Actuator, DevTools
* Annotate a class with @RestController and expose "some" REST Mappings
* Experiment with Mappings, e.g. @GetMapping, @PostMapping
* Pass a parameter via @PathVariable
* Build the application and package into a container image

Helpful Links:

* https://start.spring.io
* https://www.baeldung.com/spring-requestmapping
* https://spring.io/guides#getting-started-guides
* Full tutorial (stuff for next weeks): https://www.baeldung.com/spring-boot-start
* https://www.gitpod.io/docs/introduction/languages/java
* https://spring.io/guides/gs/rest-service/ (or basically Spring Guides in general)
* https://www.baeldung.com/spring-pathvariable (or basically all Baeldung guides)

## 10-April No lecture - Easter Monday

## 17-April API and REST

* Synchronous communication
* HTTP and REST
* Verbs, Resources, Nouns
* Evolution, Richardson Maturity Model
* CRUD Operations
* Building a REST API with Spring (Boot)
* Building a data model with REST

### Objectives and exercises
_The student understands the concepts of an API and synchronous communication in distributed systems and can explain it in own words._

### Exercise/Lab Task

* Create a full CRUD Rest API on your application
* The API object is a simple Java object with the following field
````
    private String todo;
    private int priority = 2;
````
* A RestController class is supposed to have an internal list of these objects and provide CRUD functionality.
* Starter sample is given in the git repo.

Links:

* https://restfulapi.net/idempotent-rest-apis/
* https://restfulapi.net/richardson-maturity-model/
* https://en.wikipedia.org/wiki/List_of_HTTP_status_codes

* https://www.baeldung.com/spring-requestmapping
* https://www.baeldung.com/spring-request-response-body
* https://www.baeldung.com/spring-rest-openapi-documentation
* https://www.baeldung.com/spring-cors

### Review questions

* Identify good and bad API examples and explain why
* Describe the concepts of Verbs and Nouns
* When is an invocation idempotent and safe? What does it mean? Provide examples
* Describe in your own words the mapping of REST calls to database (SQL) and CRUD calls

## 24-April REST Recap and Container Build Options

* Difference and relation between container and container images
* Concepts of image layers
* "docker commit"
* History of Dockerfile. Initial, multi-stage & BuildKit
* Building container for Java apps
* Using Jib, Cloud-Native Buildpacks and Paketo

### Objectives and exercises
_The student understands the relation between container image and container, how to instantiate a container from an image and how to commit to a new image from an existing container. The exercise is to build the previous Spring Boot application and put it into a container image using various options, e.g. different Dockerfile options, Google JIB, CND, Paketo and more ...? The student is aware and able to describe on a high-level what the different fundamentals of the various approaches are and is able to list advantages and disadvantages._

### Links

* https://docs.docker.com/engine/reference/builder/
* https://buildpacks.io/
* https://paketo.io/
* https://github.com/maeddes/options-galore-container-build/blob/main/walkthrough.adoc
* https://github.com/GoogleContainerTools/jib

## 01-May No lecture - public holiday

## 08-May Theory lecture - Cloud-Native Software 

