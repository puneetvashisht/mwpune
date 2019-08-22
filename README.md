# mwpune
    Git link: https://www.youtube.com/playlist?list=PLyTwvJkOVx7hm_WCI2ESmaS5-xStMwhIw
    
    Setting up a Spring project
        1. Create a simple maven project
        2. Notice maven project has a slightly different structure.
        3. Add Spring dependencies in maven project. (spring-core, spring-context)
        4. Add code with few dependencies
        5. Test cases needs to be present in test folder
        6. Create a configuration file for your dependencies
        7. Configure ApplicationContext to get A instance and use it

    Why to use Spring?
        - DI makes code simpler
        - One store for application needs : DB interaction - spring-jdbc
        - Provides infrastructure code
        - Spring test module--> provides you testing features
    
    What different ways for DI?
        - Annotations, XML & Java Configuration
    
    Spring ApplicationContext
        - First thing to create ApplicationContext
            - new ClassPathXMLAC("beans.xml")
            - @ContextConfiguration("classpath:beans.xml")
        - Extract/Get instances of POJO's by using ApplicationContext
    
    Spring JDBC
        - JdbcTemplate ready: existing class in spring-jdbc package
        - Avoids boilerplate code
        - Simple, write queries and get results.

    Spring JPA(Java Persistence API) 