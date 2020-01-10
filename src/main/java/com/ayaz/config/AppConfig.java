package com.ayaz.config;

import com.ayaz.conditon.DatabaseType;
import com.ayaz.conditon.MongoDatabaseTypeConditon;
import com.ayaz.conditon.MySqlDatabaseTypeConditon;
import com.ayaz.dao.UserDao;
import com.ayaz.dao.impl.JdbcUserDao;
import com.ayaz.dao.impl.MongoUserDao;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

  /*
    or @Profile("DEV")
    @Bean
    @Conditional(MySqlDatabaseTypeConditon.class)
    public UserDao jdbcUserDAO(){
        return new JdbcUserDao();
    }
    or @Profile("PROD")
    @Bean
    @Conditional(MongoDatabaseTypeConditon.class)
    public UserDao mongoUserDAO() {
        return new JdbcUserDao();
    }
    */

    @DatabaseType("MYSQL")
    public UserDao jdbcUserDAO(){
        return new JdbcUserDao();
    }
    @Bean
    @DatabaseType("MONGO")
    public UserDao mongoUserDAO(){
        return new MongoUserDao();
    }


}