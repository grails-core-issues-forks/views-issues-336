package com.example;

import io.micronaut.core.async.publisher.Publishers;
import io.micronaut.http.HttpRequest;
import io.micronaut.security.authentication.Authentication;
import io.micronaut.security.filters.AuthenticationFetcher;
import jakarta.inject.Singleton;
import org.reactivestreams.Publisher;

@Singleton
public class MockAuthenticationFetcher implements AuthenticationFetcher {
    @Override
    public Publisher<Authentication> fetchAuthentication(HttpRequest<?> request) {
        return Publishers.just(Authentication.build("sergio"));
    }
}
