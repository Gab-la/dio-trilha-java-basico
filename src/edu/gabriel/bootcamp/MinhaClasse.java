package edu.gabriel.bootcamp;
public class MinhaClasse {
    
    public static void main (String [] args){
      String primeiroNome = "gabriel";
     
      String segundoNome = "lacerda";

      String nomeCompleto = nomeCompleto (primeiroNome, segundoNome);
      System.out.println(nomeCompleto);

      //aula 1
    

    }
  public static String nomeCompleto (String primeiroNome,String segundoNome) {
  return "resultado do metodo" + primeiroNome.concat(" ").concat(segundoNome);

  }
}





