package school.sptech.sprint1_nota1.ex3;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExercicioDificilController {

    @GetMapping("/ex-03/{n}")
    public ExercicioDificilResponse exercicioDificil(@PathVariable int n) {
        if (n <= 0) {
            return new ExercicioDificilResponse(0, 0);
        }

        Integer a = 0, b = 1;
        Integer soma = a;
        Integer termoAtual = a;

        for (Integer i = 2; i <= n; i++) {
            termoAtual = a + b;
            a = b;
            b = termoAtual;
            soma += a;
        }

        return new ExercicioDificilResponse(termoAtual, soma);
    }
}
