package pavel.mvc.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pavel.mvc.model.Message;
import pavel.mvc.service.ProducerService;

@RestController
public class ProduceController {
    private ProducerService producerService;

    public ProduceController(ProducerService producerService) {
        this.producerService = producerService;
    }

    @GetMapping("/generate")
    public String generate(@RequestParam String message) {
        producerService.produce(new Message(message));
        return "OK";
    }
}