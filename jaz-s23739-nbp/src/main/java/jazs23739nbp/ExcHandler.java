package jazs23739nbp;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.client.HttpClientErrorException;

//@RestControllerAdvice
public class ExcHandler {
    @ExceptionHandler(HttpClientErrorException.NotFound.class )
    public ResponseEntity<String> notFound(HttpClientErrorException.NotFound exception){
        return ResponseEntity.status(404).body("NIE MA"+exception.getLocalizedMessage());
    }
    @ExceptionHandler(HttpClientErrorException.BadRequest.class)
    public ResponseEntity<String> badRequest(HttpClientErrorException.BadRequest exception){
        return ResponseEntity.status(400).body("ZŁE DANE"+exception.getLocalizedMessage());
    }

}
