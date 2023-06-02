package br.com.guivideo.api.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ModelMapperConfig {
    @Bean1
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }
}
