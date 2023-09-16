package biz.gelicon.core.utilitycopydata.configuration;

import jakarta.persistence.EntityManagerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(
        entityManagerFactoryRef = "mainEntityManagerFactory",
        transactionManagerRef = "mainTransactionManager",
        basePackages = {"biz.gelicon.core.utilitycopydata.mainrepository"})
public class PostgresDbConfig {

    @Autowired
    private Environment env;

    @Bean(name = "mainDataSource")
    @ConfigurationProperties(prefix = "main.datasource.postgresql")
    public DataSource dataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "mainEntityManagerFactory")
    public LocalContainerEntityManagerFactoryBean mainEntityManagerFactory(
            EntityManagerFactoryBuilder builder,
            @Qualifier("mainDataSource") DataSource dataSource) {
        return builder.dataSource(dataSource)
                .packages("biz.gelicon.core.utilitycopydata.mainmodel")
                .persistenceUnit("main")
                .properties(jpaProperties())
                .build();
    }

    @Bean(name = "mainTransactionManager")
    @ConfigurationProperties("spring.jpa")
    public PlatformTransactionManager mainTransactionManager(
            @Qualifier("mainEntityManagerFactory") EntityManagerFactory mainEntityManagerFactory) {
        return new JpaTransactionManager(mainEntityManagerFactory);
    }

    private Map<String, String> jpaProperties() {
        Map<String, String> jpaProperties = new HashMap<>();
        jpaProperties.put("hibernate.dialect", env.getProperty("main.hibernate.dialect"));
        return jpaProperties;
    }
}
