package com.company.modules;

import com.google.inject.Scopes;
import com.google.sitebricks.SitebricksModule;
import com.company.adapter.http.UserService;
import com.company.adapter.memory.InMemoryUserRepository;
import com.company.core.UserRepository;

public class AppModule extends SitebricksModule {

    @Override
    protected void configureSitebricks() {
        bind(UserRepository.class).to(InMemoryUserRepository.class).in(Scopes.SINGLETON);
        at("/users").serve(UserService.class);
    }
}
