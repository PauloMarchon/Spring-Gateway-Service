package com.paulomarchon.service.dice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import java.util.Random;

@RestController
@RequestMapping("dice")
public class DiceController {

    @GetMapping("roll{quantity}")
    public Flux<int[]> rollDice(@PathVariable int quantity) {
        Random random = new Random();
        int[] results = new int[quantity];

        for (int i = 0; i < quantity; i++)
            results[i] = random.nextInt(6) + 1;

        return Flux.just(results);
    }
}
