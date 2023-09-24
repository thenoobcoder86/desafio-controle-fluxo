public class ParametrosInvalidosException extends Exception {    
        
        public ParametrosInvalidosException(String message) {          
          super(message);
        }      
        
        @Override
        public String getMessage() {          
          return "Parâmetros inválidos: " + super.getMessage();
        }
      }

