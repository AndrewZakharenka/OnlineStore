package com.store.config;

import com.store.repository.impl.BaseRepositoryImpl;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages = "com.store.repository",
        repositoryBaseClass = BaseRepositoryImpl.class)
public class RepositoryConfig {
}
