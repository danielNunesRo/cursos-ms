package com.danieln.mscursos.services;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class LoginListenerService {

    private String token;

    @RabbitListener(queues = "${rabbitmq.queue.login.cursos}")
    public void tokenConsumer(String tokenRecebido) {
        this.token = tokenRecebido;
        System.out.println("Token recebido com sucesso");
    }

    public String getToken() {
        return this.token;
    }
}