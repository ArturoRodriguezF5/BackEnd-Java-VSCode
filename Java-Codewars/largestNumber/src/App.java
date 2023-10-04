public class App {
  public static void main(String[] args) throws Exception {
    String cad = "gh12cdy695m1";
    System.out.println(largestNumber(cad));
  }

  public static int largestNumber(String cadena) {
    int myInt = 5;
    System.out.println(((Object) cadena.charAt(2)).getClass().getSimpleName());
    System.out.println(((Object) myInt).getClass().getSimpleName());
    System.out.println("Buscar como separar la cadena en numeros y letras");
    return 0;
  }
}
