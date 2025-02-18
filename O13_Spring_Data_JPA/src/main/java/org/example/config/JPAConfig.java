package org.example.config;

import jakarta.persistence.EntityManagerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.sql.DriverManager;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(basePackages = "org.example.repository")
public class JPAConfig {

//    myql/hibernate/
    //mulinm connection ekk hdngnn oni - mysql
    // it psse wender knk oni - hibernate wge
    //transaction manager    antim dekata jpa dependancy dgnn oni
    //entity manager )bean 4k hdl configuration dnn oni)

    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactoryBean(DataSource dataSource,JpaVendorAdapter jpaVendorAdapter){
       LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
       em.setDataSource(dataSource);
       em.setJpaVendorAdapter(jpaVendorAdapter);
       em.setPackagesToScan("org.example");
       return em;
    }

    @Bean
    public DataSource dataSource(){
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/spring?createDatabaseIfNotExist=true");
        dataSource.setUsername("root");
        dataSource.setPassword("Ijse@1234");
        return dataSource;
    }
    @Bean
    public JpaVendorAdapter jpaVendorAdapter(){
        HibernateJpaVendorAdapter hibernateJpaVendorAdapter = new HibernateJpaVendorAdapter();
        hibernateJpaVendorAdapter.setShowSql(true);
        hibernateJpaVendorAdapter.setGenerateDdl(true);
        hibernateJpaVendorAdapter.setDatabase(Database.MYSQL);
        hibernateJpaVendorAdapter.setDatabasePlatform("org.hibernate.dialect.MySQL8Dialect");
        return hibernateJpaVendorAdapter;
    }
    @Bean
    public PlatformTransactionManager transactionManager(EntityManagerFactory emf){
        return  new JpaTransactionManager(emf);
    }
}
