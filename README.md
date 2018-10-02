# <img src="https://raw.githubusercontent.com/bobocode-projects/resources/master/image/logo_transparent_background.png" height=50/>Spring framework tutorial
The list of tutorials on Dependency Injection, Aspect-Oriented programming, and Spring MVC

### Pre-conditions :heavy_exclamation_mark:
You're supposed to have at least good knowledge on Java SE

### Related resources :information_source:
#### Overview
* [Spring in Action](https://www.amazon.com/Spring-Action-Covers-4/dp/161729120X/ref=sr_1_1?s=books&ie=UTF8&qid=1538391717&sr=1-1&keywords=spring+in+action) :green_book: 
  * **1.1** Simplifying Java development. *(Advantages of Spring)*
  * **1.2** Containing your beans. *(A bean lifecycle)*
#### Bean configuration
* [Spring IoC and Dependency Injection tutorial](https://github.com/bobocode-projects/spring-framework-tutorial/tree/master/ioc-basics#spring-ioc-and-dependency-injection-tutorial)<img src="https://raw.githubusercontent.com/bobocode-projects/resources/master/image/logo_transparent_background.png" height=20/>
* [Spring in Action](https://www.amazon.com/Spring-Action-Covers-4/dp/161729120X/ref=sr_1_1?s=books&ie=UTF8&qid=1538391717&sr=1-1&keywords=spring+in+action) :green_book: 
  * **2.2.1** Creating discoverable beans *([`@Component`](https://docs.spring.io/spring-framework/docs/current/spring-framework-reference/core.html#beans-stereotype-annotations))*
  * **2.2.2** Naming a component-scanned bean
  * **2.2.3** Setting a base package for component scanning. *([`@ComponentScan`](https://docs.spring.io/spring-framework/docs/current/spring-framework-reference/core.html#beans-scanning-autodetection))*
  * **2.2.4** Annotating beans to be automatically wired. *(Configuring dependency injection with [`@Autowired`](https://docs.spring.io/spring-framework/docs/current/spring-framework-reference/core.html#beans-autowired-annotation))*
  * **2.3.1** Creating a configuration class. ([`@Congifuration`](https://docs.spring.io/spring-framework/docs/current/spring-framework-reference/core.html#beans-java-configuration-annotation))
  * **2.3.2** Declaring a simple bean. (Explicit Java configuration using [`@Bean`](https://docs.spring.io/spring-framework/docs/current/spring-framework-reference/core.html#beans-java-bean-annotation))
  * **2.3.3** Injecting with JavaConfig. *(Java config file features)*
#### ORM
* [Spring in Action](https://www.amazon.com/Spring-Action-Covers-4/dp/161729120X/ref=sr_1_1?s=books&ie=UTF8&qid=1538391717&sr=1-1&keywords=spring+in+action) :green_book:
  * **11.2.1** Configuring an entity manager factory. *(How to configure JPA without persistence.xml?)*
  * **11.2.2** Writing a JPA-based repository. *(How to create DAO using [`@Repository`](https://docs.spring.io/spring-framework/docs/current/spring-framework-reference/data-access.html#dao-annotations)?)*
  * **10.1.1** Getting to know Spring’s data-access exception hierarchy. *(Why Spring wraps SQL checked exceptions?)*
#### Transaction management
* [Understanding the Spring Framework’s Declarative Transaction Implementation](https://docs.spring.io/spring-framework/docs/current/spring-framework-reference/data-access.html#tx-decl-explained) <img src="https://spring.io/img/homepage/icon-spring-framework.svg" height=15/>
* [Using @Transactional](https://docs.spring.io/spring-framework/docs/current/spring-framework-reference/data-access.html#transaction-declarative-annotations) <img src="https://spring.io/img/homepage/icon-spring-framework.svg" height=15/>
