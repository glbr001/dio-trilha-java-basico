public class ParametrosInvalidosException extends Exception {
   private String erroMessage;
    public ParametrosInvalidosException() {
        super();
        erroMessage = "Parâmetros inválidos! \n Os parâmetros devem ser números inteiros e o segundo  número deve ser maior que o primeiro.";
    }

   public ParametrosInvalidosException(String erroMessage) {
      this.erroMessage = erroMessage;
   }

   public String getErroMessage() {
      return erroMessage;
   }
}



    
