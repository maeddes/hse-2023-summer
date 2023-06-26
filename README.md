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

![Docker and Compose](pics/docker_run_vs_compose.excalidraw.png)

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

![API](pics/spring_boot_full_and_documented_rest_api_2022_11.png)

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

![Container Build](pics/container_build_options.png)

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

* CAP Theorem
* Conway's Law
* Fallacies of distributed computing
* Domain-Driven Design basics
* 12-factor application
* Evolution of applications and deployments: Monolithic -> Service-Oriented Architecture -> Microservices
* Introduction to serverless and FaaS terminology

### Objectives and exercises
_The student knows about the evolution of distributed systems (and middleware) and the drivers towards state-of-the-art implementation and deployment. She/he can explain the underlying concepts and theories and put it into practical context. No dedicated exercises for this module. Recap of basics: Spring Boot, Docker, configuration, persistence and messaging._

### Review questions

* "WHY" Cloud-Native Software? What IS Cloud-Native Software?
* Why "evolution" from a monolithic approach to a distributed approach?
* How does the CAP Theorem/Conway's Law relate to this?
* (NO Domain-Driven Design questions)
* How do the 12-factor application "methodology" relate to the technologies that we covered in this semester? (important)
* "WHY" is external configuration important in cloud-native software?
* Where did you see aspects of external configuration in the technologies we used? Provide examples

## 15-May Persistence

![Recap 12-factor](pics/12-factor.jpg)

* Spring Data
* Concept of entities and repositories
* JPA and JDBC basics
* H2, PostgeSQL, MySQL - configuration via Spring Boot profiles
* Running databases as Docker images

![Spring Data](pics/spring_data_overview.png)

### Objectives and exercises
_The student is able to build a Spring Boot application (or extend an existing one) with Spring Data configuration. The exercise is to create an application, which performs CRUD operations on a database backend. The database can either be in-memory (H2) or a (containerized) PostgreSQL. Optional: Provide a docker-compose file to stand up a multi-container environment with application and database._

### Review Questions

* "WHY" persistence? "WHY" persistence frameworks like JPA?
* Describe the necessary components to build an application with Spring Data? Potentially sketch
* What does the annotation @Entity do? 
* How could docker compose help if you have a persistence-based application?

## 22-May Kubernetes 

![Kubernetes Simple](pics/kubernetes_simple_objects.excalidraw.png)

* Presentation: Cloud Platforms & Kubernetes
* Kubernetes Background
* What is CaaS?
* Cluster & Node Concept
* Behaviour scenarios of Kubernetes in Action
* Base API objects: Deployments, ReplicaSets, Pods, Services
* Intro into kubectl 
  
### Objectives and exercises
_The student understands the requirements and expectations towards cloud platforms and is able to list them. She/he can explain the advantages over standard container operation with Docker. The exercise is to take a sample Spring Boot application and walk through the steps to containerize and deploy to Kubernetes. The student is aware about various options for local and remote Kubernetes options._

### Review questions

* Please write 100 lines of YAML Code :)
* Explain the relation of "some" of the 12 factors in relation to Kubernetes
* Explain the core principe of Kubernetes in own words. "Why" Kubernetes?
* What is pod? What is a service?
* Which kind of Kubernetes providers do you know? Can they be grouped somehow?

### Links

* https://docs.docker.com/engine/reference/commandline/compose_build/
* https://kubernetes.io/docs/tasks/configure-pod-container/configure-liveness-readiness-startup-probes/
* https://www.baeldung.com/spring-value-annotation

### Links - Kubernetes Options

* https://github.com/learnk8s/free-kubernetes (Overview)

* https://www.katacoda.com/courses/kubernetes/playground (web-based)
* https://training.play-with-kubernetes.com/ (web-based, broken?)

* https://kind.sigs.k8s.io/docs/user/quick-start/ (local)
* https://minikube.sigs.k8s.io/docs/ (local)
* https://docs.docker.com/get-started/kube-deploy/ (local)
* https://k3s.io/ (local)
* https://microk8s.io/ (local)

* https://aws.amazon.com/de/education/awseducate/ (Student)
* https://azure.microsoft.com/en-us/free/students/ (Student)

## 29-May No lecture - public holiday

## 05-July Kubernetes and resilience patterns

## 12-July Frontend / HTTP Client

![Recap Kubernetes](pics/K8s-12factor.jpg)
![Full landscape](pics/full_landscape_docker_and_microservices.excalidraw.png)

