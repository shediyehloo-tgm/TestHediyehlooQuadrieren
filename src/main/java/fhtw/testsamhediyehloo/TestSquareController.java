package fhtw.testsamhediyehloo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestSquareController {



   @GetMapping("/api/square")
   public int square(int number){

      return number*number;
   }





}
