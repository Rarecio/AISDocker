package ru.zhaleykin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import ru.zhaleykin.rabbitmq.RabbitConfiguration;
import org.springframework.amqp.rabbit.annotation.EnableRabbit;

@SpringBootApplication
@EnableJpaRepositories("ru.zhaleykin.repository")
@Import(RabbitConfiguration.class)
@EnableRabbit
public class JavaProject {
	public static void main(String[] args) {
		SpringApplication.run(JavaProject.class);
	}
}
