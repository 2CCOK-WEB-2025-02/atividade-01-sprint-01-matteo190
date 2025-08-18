package school.sptech.sprint1_nota1.ex1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExercicioFacilController {

    @GetMapping("/ex-01/{palavra}")
    public Boolean exercicioFacil(@PathVariable String palavra) {
        palavra = palavra.toLowerCase();

        for (Integer i = 0, j = palavra.length() - 1; i < j; i++, j--) {
            if (palavra.charAt(i) != palavra.charAt(j)) {
                return false;
            }
        }
        return true;
    }
}
