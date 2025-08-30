package com.aej.cecarticulo.conf;

@Configurarion
public class ThreadPoolConfig {
    @Value("${app.threads}")
    private int threads;

    @Bean
    public ExecutorService executorService() {
        return Executors.newFixedThreadPool(threads);
    }
}